package homeworkTheme20;

public class Video extends Media {
    private int duration; // in minutes

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void displayInfo() {
        System.out.println("Video: " + getTitle() + ", Duration: " + duration + " mins");
    }
}