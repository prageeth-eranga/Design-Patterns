package code;


public class Logger {

    private Logger() {
    }

    private static Logger instanceA;
    private static Logger instanceB;
    private static Logger instanceC;

    /**
     * Lazy Instantiation
     */
    public static Logger getLazyInstance() {
        if (instanceA == null) {
            instanceA = new Logger();
        }
        System.out.println(instanceA.hashCode());
        return instanceA;
    }


    /**
     * Thread safe
     */
    public static synchronized Logger getThreadSafeInstance() {
        if (instanceB == null) {
            instanceB = new Logger();
        }
        System.out.println(instanceB.hashCode());
        return instanceB;
    }


    /**
     * Thread safe double check locking
     */
    public static Logger getThreadSafeDoubleCheckInstance() {
        if (instanceC == null) {
            synchronized (Logger.class) {
                if (instanceC == null) {
                    instanceC = new Logger();
                }
            }
        }
        System.out.println(instanceC.hashCode());
        return instanceC;
    }

}
