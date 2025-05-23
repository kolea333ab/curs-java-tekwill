package homeworkTheme20;

public class Newspaper extends Media {
    private String date;

    public Newspaper(String title, String date) {
        super(title);
        this.date = date;
    }

    @Override
    public void displayInfo() {
        System.out.println("Newspaper: " + getTitle() + ", Date: " + date);
    }
}