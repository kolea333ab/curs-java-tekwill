package homeworkTheme11;

class CPU {
    static class  Processor{
        private int cores;
        private double speed;

        public Processor (int cores, double speed){
            this.cores = cores;
            this.speed = speed;
        }

        public void displayInfo (){
            System.out.println("Процессор:" + cores + " cores, " + speed + " GHz");
        }
    }
    static class RAM{
        private int size;
        private int speed;

        public RAM (int size, int speed){
            this.size = size;
            this.speed = speed;
        }

        public void displayInfo(){
            System.out.println("RAM " + size + " GB, " + speed+ " MHz");
        }
    }
}

class MotherBoard{
    static class USB{
        private String version;
        private int ports;

        public USB (String version, int ports){
            this.version = version;
            this.ports = ports;
        }
        public void displayInfo(){
            System.out.println("USB " + version + " версия, " + ports + " порты");
        }
    }
}

public class Main{
    public static void main (String[] args){
        CPU.Processor cpuProcessor =  new CPU.Processor(8, 3.5);
        CPU.RAM cpuRam = new CPU.RAM(16, 3200);

        cpuProcessor.displayInfo();
        cpuRam.displayInfo();

        MotherBoard.USB motherboardUsb = new MotherBoard.USB("3.0", 4);
        motherboardUsb.displayInfo();
    }
}
