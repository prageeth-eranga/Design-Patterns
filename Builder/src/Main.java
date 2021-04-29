import code.Computer;

public class Main {


    public static void main(String[] args) {

        Computer computer1 = new Computer
                .ComputerBuilder("2GHZ", "2GB", "1TB")
                .build();

        Computer computer2 = new Computer
                .ComputerBuilder("2GHZ", "2GB", "1TB")
                .setROM(true)
                .setVGA(false)
                .build();

        System.out.println("1: "+computer1);
        System.out.println("2: "+computer2);
    }

}
