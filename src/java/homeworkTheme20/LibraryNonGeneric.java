package homeworkTheme20;

import java.util.ArrayList;
import java.util.List;

public class LibraryNonGeneric {
    private List<Media> items = new ArrayList<>();

    public void addMedia(Media item) {
        items.add(item);
    }

    public Media getMedia(int index) {
        return items.get(index);
    }

    public void showAllMedia() {
        for (Media item : items) {
            item.displayInfo();
        }
    }
}