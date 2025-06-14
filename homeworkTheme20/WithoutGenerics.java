package homeworkTheme20;

import java.util.ArrayList;
import java.util.List;

class WithoutGenerics {
    private List books = new ArrayList();
    private List videos = new ArrayList();
    private List newspapers = new ArrayList();

    public void addBook(Object book) {
        books.add(book);
    }

    public void addVideo(Object video) {
        videos.add(video);
    }

    public void addNewspaper(Object newspaper) {
        newspapers.add(newspaper);
    }

    public List getBooks() {
        return books;
    }

    public List getVideos() {
        return videos;
    }

    public List getNewspapers() {
        return newspapers;
    }
}
