import code.Computer;
import code.ComputerFactory;

public class Main {


    public static void main(String[] args){

        Computer computer1 = ComputerFactory.getComputer("pc", "2GB", "1TB", "2GHZ");

        Computer computer2 = ComputerFactory.getComputer("server","8GB","10TB","4GHZ");

        System.out.println(computer1.toString());
        System.out.println(computer2.toString());

    }

}
