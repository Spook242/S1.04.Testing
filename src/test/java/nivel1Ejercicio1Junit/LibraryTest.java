package nivel1Ejercicio1Junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private Library library;

    @BeforeEach
    void setup() {
        library = new Library();
        library.addBook("A clockwork orange");
        library.addBook("Acid House");
        library.addBook("The catcher in the rye");
    }

    @Test
    void testListNoNull() {
        assertNotNull(library.getBOOKS());
    }

    @Test
    void testSizeListAdd() {
        assertEquals(3, library.size());
    }

    @Test
    void testBookPosition() {
        List<String> books = library.getBOOKS();
        assertEquals("A clockwork orange", library.getPositionBook(books.indexOf("A clockwork orange")));
    }

    @Test
    void testWithoutDuplicate() {
        library.addBook("A clockwork orange");
        assertEquals(3, library.size());
    }

    @Test
    void testAddBookPosition() {
        library.addPositionBook("Acid House", 1);
        assertTrue(library.getBOOKS().contains("Acid House"));
    }

    @Test
    void testDeleteBook() {
        library.deleteBook("A clockwork orange");
        assertEquals(2, library.size());
        assertFalse(library.getBOOKS().contains("A clockwork orange"));
    }

    @Test
    void testOrderedList() {
        List<String> books = library.getBOOKS();
        List<String> OrderedCopy = new ArrayList<>(books);
        OrderedCopy.sort(String::compareToIgnoreCase);
        assertEquals(OrderedCopy, books);
    }
}

