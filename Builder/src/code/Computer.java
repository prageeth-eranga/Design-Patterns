package code;

public class Computer {

    private String CPU;
    private String RAM;
    private String HDD;

    //optional
    private boolean hasVGA;
    private boolean hasROM;

    public Computer(ComputerBuilder builder) {
        this.CPU = builder.CPU;;
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.hasVGA = builder.hasVGA;
        this.hasROM = builder.hasROM;
    }

    public String getCPU() {
        return CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public boolean isHasVGA() {
        return hasVGA;
    }

    public boolean isHasROM() {
        return hasROM;
    }

    public static class ComputerBuilder{
        private String CPU;
        private String RAM;
        private String HDD;
        private boolean hasVGA;
        private boolean hasROM;

        public ComputerBuilder(String CPU, String RAM, String HDD) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setVGA(boolean hasVGA) {
            this.hasVGA = hasVGA;
            return this;
        }

        public ComputerBuilder setROM(boolean hasROM) {
            this.hasROM = hasROM;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", hasVGA=" + hasVGA +
                ", hasROM=" + hasROM +
                '}';
    }
}
