package homeworkTheme18.exercise2;

import java.util.*;
import java.util.stream.*;

public class BookApp {
    public static void main(String[] args) {
        List<Book> books = List.of(
                new Book("Dune", "Frank Herbert", Genre.SCIENCE_FICTION, 1965),
                new Book("1984", "George Orwell", Genre.SCIENCE_FICTION, 1949),
                new Book("The Hobbit", "J.R.R. Tolkien", Genre.FANTASY, 1937),
                new Book("The Shining", "Stephen King", Genre.HORROR, 1977),
                new Book("Pride and Prejudice", "Jane Austen", Genre.ROMANCE, 1813),
                new Book("The Da Vinci Code", "Dan Brown", Genre.MYSTERY, 2003),
                new Book("Ready Player One", "Ernest Cline", Genre.SCIENCE_FICTION, 2011),
                new Book("The Girl with the Dragon Tattoo", "Stieg Larsson", Genre.THRILLER, 2005),
                new Book("The Martian", "Andy Weir", Genre.SCIENCE_FICTION, 2014),
                new Book("The Fault in Our Stars", "John Green", Genre.DRAMA, 2012)
        );

        // 1. Books published after 2000
        System.out.println("Books after 2000:");
        books.stream()
                .filter(book -> book.getPublicationYear() > 2000)
                .forEach(System.out::println);

        // 2. Science Fiction books
        System.out.println("\nScience Fiction books:");
        books.stream()
                .filter(book -> book.getGenre() == Genre.SCIENCE_FICTION)
                .forEach(System.out::println);

        // 3. Books by a specific author
        String authorSearch = "George Orwell";
        System.out.println("\nBooks by " + authorSearch + ":");
        books.stream()
                .filter(book -> book.getAuthor().equalsIgnoreCase(authorSearch))
                .forEach(System.out::println);

        // 4. List of titles
        System.out.println("\nList of titles:");
        List<String> titles = books.stream()
                .map(Book::getTitle)
                .collect(Collectors.toList());
        titles.forEach(System.out::println);

        // 5. List in format "Title (Author)"
        System.out.println("\nFormatted list:");
        List<String> formatted = books.stream()
                .map(book -> book.getTitle() + " (" + book.getAuthor() + ")")
                .collect(Collectors.toList());
        formatted.forEach(System.out::println);

        // 6. Unique genres
        System.out.println("\nUnique genres:");
        Set<Genre> genres = books.stream()
                .map(Book::getGenre)
                .collect(Collectors.toSet());
        genres.forEach(System.out::println);

        // 7. Total number of books
        System.out.println("\nTotal books: " + books.size());

        // 8. Number of books before 1990
        long oldBooksCount = books.stream()
                .filter(book -> book.getPublicationYear() < 1990)
                .count();
        System.out.println("Books before 1990: " + oldBooksCount);

        // 9. Earliest publication year
        int earliestYear = books.stream()
                .mapToInt(Book::getPublicationYear)
                .min()
                .orElse(-1);
        System.out.println("Earliest year: " + earliestYear);

        // 10. Group by genre and count
        System.out.println("\nBooks by genre:");
        Map<String, Long> booksByGenre = books.stream()
                .collect(Collectors.groupingBy(b -> b.getGenre().toString(), Collectors.counting()));
        booksByGenre.forEach((genre, count) -> System.out.println(genre + ": " + count));
    }
}