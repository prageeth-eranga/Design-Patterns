import code.Logger;

public class Main {


    public static void main(String[] args){

        Logger.getLazyInstance();
        Logger.getThreadSafeInstance();
        Logger.getThreadSafeDoubleCheckInstance();

        Logger.getLazyInstance();
        Logger.getThreadSafeInstance();
        Logger.getThreadSafeDoubleCheckInstance();

    }

}
