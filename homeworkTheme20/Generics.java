package homeworkTheme20;

import java.util.ArrayList;
import java.util.List;

class Generics<T> {
    private List<T> items = new ArrayList<>();

    public void addMedia(T media) {
        items.add(media);
    }

    public List<T> getAllMedia() {
        return items;
    }
}
