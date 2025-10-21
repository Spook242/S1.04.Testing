package nivel1Ejercicio1Junit;

import java.util.Objects;

    public class Book implements Comparable<Book> {

        private String title;

        public Book(String title) {
            this.title = title;
        }

        // Getter i Setter
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        // compareTo para ordenar alfabéticament (case-insensitive)
        @Override
        public int compareTo(Book other) {
            return this.title.compareToIgnoreCase(other.title);
        }

        // equals y hashCode basados en el título (único identificador lógico)
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book)) return false;
            Book book = (Book) o;
            return title.equalsIgnoreCase(book.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title.toLowerCase());
        }

        @Override
        public String toString() {
            return "Book{title='" + title + "'}";
        }
    }

