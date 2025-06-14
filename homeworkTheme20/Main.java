package homeworkTheme20;

public class Main {
    public static void main(String[] args) {
        // Использование версии без дженериков
        WithoutGenerics mediaLibrary = new WithoutGenerics();
        mediaLibrary.addBook(new Book("1984"));
        mediaLibrary.addVideo(new Video("Inception"));
        mediaLibrary.addNewspaper(new Newspaper("The Times"));

        // Приведение типов при извлечении
        Book book = (Book) mediaLibrary.getBooks().get(0);
        System.out.println(book);

        // Использование GenericMediaLibrary
        Generics<Book> bookLibrary = new Generics<>();
        bookLibrary.addMedia(new Book("Brave New World"));

        Generics<Video> videoLibrary = new Generics<>();
        videoLibrary.addMedia(new Video("Matrix"));

        Generics<Newspaper> newspaperLibrary = new Generics<>();
        newspaperLibrary.addMedia(new Newspaper("Daily News"));

        System.out.println(bookLibrary.getAllMedia().get(0));
        System.out.println(videoLibrary.getAllMedia().get(0));
        System.out.println(newspaperLibrary.getAllMedia().get(0));
    }
}
