package homeworkTheme20;

import java.util.ArrayList;
import java.util.List;

public class LibraryGeneric<T extends Media> {
    private List<T> items = new ArrayList<>();

    public void addMedia(T item) {
        items.add(item);
    }

    public T getMedia(int index) {
        return items.get(index);
    }

    public void showAllMedia() {
        for (T item : items) {
            item.displayInfo();
        }
    }
}
