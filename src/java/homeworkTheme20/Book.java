package homeworkTheme20;

public class Book extends Media {
    private String author;

    public Book(String title, String author) {
        super(title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book: " + getTitle() + " by " + author);
    }
}