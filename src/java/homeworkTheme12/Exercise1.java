package homeworkTheme12;

interface Trainable{
    void attendTraining();
}

interface InterviewConductable{
    void conductInterview();
}

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public abstract void work();
}

class Manager extends Employee implements Trainable, InterviewConductable{
    public Manager(String name, int id){
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Менеджер " + getName() + " управляет командой");
    }

    @Override
    public void conductInterview() {
        System.out.println("Менедждер " + getName() + " проводит интервью");
    }

    @Override
    public void attendTraining() {
        System.out.println("Менеджер " + getName() + " посещает курсы по менеджменту");
    }
}

class Programmer extends Employee implements Trainable{
    public Programmer (String name, int id){
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Программист " + getName() + " пишет код");
    }

    @Override
    public void attendTraining() {
        System.out.println("Программист " + getName() + " посещает курсы по кодированию");
    }
}
