package homeworkTheme18;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

public class BookStreamExample {

    enum Genre {
        ACTION, ADVENTURE, COMEDY, DRAMA, FANTASY, HORROR,
        SCIENCE_FICTION, THRILLER, ROMANCE, MYSTERY
    }

    static class Book {
        private String title;
        private String author;
        private Genre genre;
        private int publicationYear;

        // No-args constructor
        public Book() {}

        // All-args constructor
        public Book(String title, String author, Genre genre, int publicationYear) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.publicationYear = publicationYear;
        }

        // Getters and Setters
        public String getTitle() { return title; }
        public void setTitle(String title) { this.title = title; }

        public String getAuthor() { return author; }
        public void setAuthor(String author) { this.author = author; }

        public Genre getGenre() { return genre; }
        public void setGenre(Genre genre) { this.genre = genre; }

        public int getPublicationYear() { return publicationYear; }
        public void setPublicationYear(int publicationYear) { this.publicationYear = publicationYear; }

        // equals and hashCode
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

        // toString
        @Override
        public String toString() {
            return title + " by " + author + " (" + genre + ", " + publicationYear + ")";
        }
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Dune", "Frank Herbert", Genre.SCIENCE_FICTION, 1965),
                new Book("1984", "George Orwell", Genre.SCIENCE_FICTION, 1949),
                new Book("The Hobbit", "J.R.R. Tolkien", Genre.FANTASY, 1937),
                new Book("Pride and Prejudice", "Jane Austen", Genre.ROMANCE, 1813),
                new Book("The Shining", "Stephen King", Genre.HORROR, 1977),
                new Book("Harry Potter", "J.K. Rowling", Genre.FANTASY, 2001),
                new Book("Gone Girl", "Gillian Flynn", Genre.THRILLER, 2012),
                new Book("It", "Stephen King", Genre.HORROR, 1986),
                new Book("The Martian", "Andy Weir", Genre.SCIENCE_FICTION, 2011),
                new Book("The Notebook", "Nicholas Sparks", Genre.ROMANCE, 1996)
        );

        // Books published after 2000
        List<Book> after2000 = books.stream()
                .filter(b -> b.getPublicationYear() > 2000)
                .collect(toList());
        System.out.println("Books after 2000: " + after2000);

        // Books of Science Fiction genre
        List<Book> sciFiBooks = books.stream()
                .filter(b -> b.getGenre() == Genre.SCIENCE_FICTION)
                .collect(toList());
        System.out.println("Science Fiction books: " + sciFiBooks);

        // Books by a specific author (e.g., Stephen King)
        List<Book> byStephenKing = books.stream()
                .filter(b -> b.getAuthor().equalsIgnoreCase("Stephen King"))
                .collect(toList());
        System.out.println("Books by Stephen King: " + byStephenKing);

        // List of all book titles
        List<String> titles = books.stream()
                .map(Book::getTitle)
                .collect(toList());
        System.out.println("Titles: " + titles);

        // List of "Title (Author)"
        List<String> titleAuthorList = books.stream()
                .map(b -> b.getTitle() + " (" + b.getAuthor() + ")")
                .collect(toList());
        System.out.println("Title (Author): " + titleAuthorList);

        // Set of unique genres
        Set<Genre> uniqueGenres = books.stream()
                .map(Book::getGenre)
                .collect(toSet());
        System.out.println("Unique genres: " + uniqueGenres);

        // Total number of books
        long totalBooks = books.size();
        System.out.println("Total books: " + totalBooks);

        // Count books published before 1990
        long before1990 = books.stream()
                .filter(b -> b.getPublicationYear() < 1990)
                .count();
        System.out.println("Books before 1990: " + before1990);

        // Earliest publication year
        books.stream()
                .map(Book::getPublicationYear)
                .min(Integer::compare)
                .ifPresent(year -> System.out.println("Earliest publication year: " + year));

        // Group by genre and count
        Map<Genre, Long> countByGenre = books.stream()
                .collect(groupingBy(Book::getGenre, counting()));
        System.out.println("Count by genre: " + countByGenre);
    }
}
