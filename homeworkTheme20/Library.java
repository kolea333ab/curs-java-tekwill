package homeworkTheme20;

class Book {
    private String title;
    public Book(String title) { this.title = title; }
    public String getTitle() { return title; }
    @Override public String toString() { return "Book: " + title; }
}

class Video {
    private String title;
    public Video(String title) { this.title = title; }
    public String getTitle() { return title; }
    @Override public String toString() { return "Video: " + title; }
}

class Newspaper {
    private String name;
    public Newspaper(String name) { this.name = name; }
    public String getName() { return name; }
    @Override public String toString() { return "Newspaper: " + name; }
}
