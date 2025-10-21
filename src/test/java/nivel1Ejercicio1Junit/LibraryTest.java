package nivel1Ejercicio1Junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;
    private Book book1, book2, book3;

    @BeforeEach
    void setup() {
        library = new Library();
        book1 = new Book("A clockwork orange");
        book2 = new Book("Acid House");
        book3 = new Book("The catcher in the rye");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    void testListNotNull() {
        assertNotNull(library.getBooks());
    }

    @Test
    void testSizeAfterAdd() {
        assertEquals(3, library.size());
    }

    @Test
    void testBookPosition() {
        List<Book> books = library.getBooks();
        int pos = books.indexOf(book1);
        assertEquals(book1, library.getBookAtPosition(pos));
    }

    @Test
    void testNoDuplicates() {
        library.addBook(new Book("A clockwork orange"));
        assertEquals(3, library.size());
    }

    @Test
    void testAddBookAtPosition() {
        Book newBook = new Book("Trainspotting");
        library.addBookAtPosition(newBook, 1);
        assertTrue(library.getBooks().contains(newBook));
    }

    @Test
    void testDeleteBook() {
        library.deleteBook(book1);
        assertEquals(2, library.size());
        assertFalse(library.getBooks().contains(book1));
    }

    @Test
    void testBooksOrderedAlphabetically() {
        List<Book> books = library.getBooks();
        List<Book> orderedCopy = new ArrayList<>(books);
        orderedCopy.sort(Book::compareTo);
        assertEquals(orderedCopy, books);
    }
}

