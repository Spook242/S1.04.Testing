package nivel1Ejercicio1Junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books);
        }
    }

    public void addPositionBook(String title, int posistion) {
        if (!books.contains(title) && posistion >= 0 && posistion <= books.size()) {
            books.add(posistion, title);
            Collections.sort(books);
        }
    }

    public List<String> getBooks() {
        return new ArrayList<>(books);
    }

    public String getPositionBook(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        return null;
    }

    public boolean eliminarLlibre(String titol) {
        boolean eliminat = books.remove(titol);
        if (eliminat) {
            Collections.sort(books);
        }
        return eliminat;
    }

    public int mida() {
        return books.size();
    }
}

