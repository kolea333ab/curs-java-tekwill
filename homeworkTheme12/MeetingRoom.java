package homeworkTheme12;

import java.util.List;

class MeetingRoom {
    private List<Trainable> attendees;

    public MeetingRoom(List<Trainable> attendees) {
        this.attendees = attendees;
    }

    public void conductTrainingSession() {
        for(Trainable person : this.attendees) {
            person.attendTraining();
        }

    }
}
