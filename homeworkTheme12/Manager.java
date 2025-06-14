package homeworkTheme12;

class Manager extends Employee implements Trainable, InterviewConductable {
    public Manager(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println("Менеджер " + this.getName() + " управляет командой");
    }

    public void conductInterview() {
        System.out.println("Менедждер " + this.getName() + " проводит интервью");
    }

    public void attendTraining() {
        System.out.println("Менеджер " + this.getName() + " посещает курсы по менеджменту");
    }
}
