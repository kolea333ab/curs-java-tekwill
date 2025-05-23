package homeworkTheme20;

public class Main {
    public static void main(String[] args) {
        // Without generics
        LibraryNonGeneric library1 = new LibraryNonGeneric();
        library1.addMedia(new Book("1984", "George Orwell"));
        library1.addMedia(new Video("Interstellar", 169));
        library1.addMedia(new Newspaper("NY Times", "2024-05-01"));
        System.out.println("Non-Generic Library:");
        library1.showAllMedia();

        // With generics
        LibraryGeneric<Book> bookLibrary = new LibraryGeneric<>();
        bookLibrary.addMedia(new Book("Brave New World", "Aldous Huxley"));
        System.out.println("\nGeneric Book Library:");
        bookLibrary.showAllMedia();
    }
}