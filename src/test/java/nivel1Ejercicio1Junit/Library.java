package nivel1Ejercicio1Junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private final List<String> BOOKS;

    public Library() {
        this.BOOKS = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!BOOKS.contains(title)) {
            BOOKS.add(title);
            Collections.sort(BOOKS);
        }
    }

    public void addPositionBook(String title, int position) {
        if (!BOOKS.contains(title) && position >= 0 && position <= BOOKS.size()) {
            BOOKS.add(position, title);
            Collections.sort(BOOKS);
        }
    }

    public List<String> getBOOKS() {
        return new ArrayList<>(BOOKS);
    }

    public String getPositionBook(int position) {
        if (position >= 0 && position < BOOKS.size()) {
            return BOOKS.get(position);
        }
        return null;
    }

    public void deleteBook(String title) {
        boolean deleted = BOOKS.remove(title);
        if (deleted) {
            Collections.sort(BOOKS);
        }
    }

    public int size() {
        return BOOKS.size();
    }
}
