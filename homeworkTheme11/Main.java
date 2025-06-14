package homeworkTheme11;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        CPU.Processor cpuProcessor = new CPU.Processor(8, (double)3.5F);
        CPU.RAM cpuRam = new CPU.RAM(16, 3200);
        cpuProcessor.displayInfo();
        cpuRam.displayInfo();
        MotherBoard.USB motherboardUsb = new MotherBoard.USB("3.0", 4);
        motherboardUsb.displayInfo();
    }
}
