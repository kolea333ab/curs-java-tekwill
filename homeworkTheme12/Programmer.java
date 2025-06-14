package homeworkTheme12;

class Programmer extends Employee implements Trainable {
    public Programmer(String name, int id) {
        super(name, id);
    }

    public void work() {
        System.out.println("Программист " + this.getName() + " пишет код");
    }

    public void attendTraining() {
        System.out.println("Программист " + this.getName() + " посещает курсы по кодированию");
    }
}
