package nivel1Ejercicio1Junit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        if (!books.contains(book)) {
            books.add(book);
            Collections.sort(books);
        }
    }

    public void addBookAtPosition(Book book, int position) {
        if (!books.contains(book) && position >= 0 && position <= books.size()) {
            books.add(position, book);
            Collections.sort(books);
        }
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public Book getBookAtPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        return null;
    }

    public void deleteBook(Book book) {
        boolean removed = books.remove(book);
        if (removed) {
            Collections.sort(books);
        }
    }

    public void clearLibrary() {
        books = new ArrayList<>();
    }

    public int size() {
        return books.size();
    }
}
