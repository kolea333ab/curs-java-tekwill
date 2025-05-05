package homeworkTheme12;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Manager manager1 = new Manager("Nicolae", 101);
        Programmer programmer1 = new Programmer("Diana", 102);
        Programmer programmer2 = new Programmer("Alexia", 103);
        Manager manager2 = new Manager("Alexander", 104);

        manager1.work();
        programmer1.work();

        List<Trainable> trainingAttendees = new ArrayList<>();
        trainingAttendees.add(manager1);
        trainingAttendees.add(programmer1);
        trainingAttendees.add(programmer2);
        trainingAttendees.add(manager2);

        MeetingRoom room = new MeetingRoom(trainingAttendees);
        System.out.println("\n--- Training Session ---");
        room.conductTrainingSession();

        List<Employee> employees = new ArrayList<>();
        employees.add(manager1);
        employees.add(programmer1);
        employees.add(programmer2);
        employees.add(manager2);

        System.out.println("\n--- Type-specific Operations ---");
        for (Employee emp : employees) {
            if (emp instanceof Trainable) {
                ((Trainable) emp).attendTraining();
            }

            if (emp instanceof InterviewConductable) {
                ((InterviewConductable) emp).conductInterview();
            }
        }
    }
}