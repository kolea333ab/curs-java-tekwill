package homeworkTheme18.exercise2;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private Genre genre;
    private int publicationYear;

    public Book() {}

    public Book(String title, String author, Genre genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }


    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public Genre getGenre() { return genre; }
    public int getPublicationYear() { return publicationYear; }


    public void setTitle(String title) { this.title = title; }
    public void setAuthor(String author) { this.author = author; }
    public void setGenre(Genre genre) { this.genre = genre; }
    public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author) &&
                genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, publicationYear);
    }


    @Override
    public String toString() {
        return title + " by " + author + " (" + genre + ", " + publicationYear + ")";
    }
}
