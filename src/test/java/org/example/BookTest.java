package org.example;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    public void testSortByTitle() {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99),
                new Book("1984", "George Orwell", 1949, 8.99),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99)
        );

        books.sort(Book.titleComparator);

        assertEquals("1984", books.get(0).getTitle());
        assertEquals("The Great Gatsby", books.get(1).getTitle());
        assertEquals("To Kill a Mockingbird", books.get(2).getTitle());
    }

    @Test
    public void testSortByAuthor() {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99),
                new Book("1984", "George Orwell", 1949, 8.99),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99)
        );

        books.sort(Book.authorComparator);

        assertEquals("F. Scott Fitzgerald", books.get(0).getAuthor());
        assertEquals("George Orwell", books.get(1).getAuthor());
        assertEquals("Harper Lee", books.get(2).getAuthor());
    }

    @Test
    public void testSortByYear() {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99),
                new Book("1984", "George Orwell", 1949, 8.99),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99)
        );

        books.sort(Book.yearComparator);

        assertEquals(1925, books.get(0).getYear());
        assertEquals(1949, books.get(1).getYear());
        assertEquals(1960, books.get(2).getYear());
    }

    @Test
    public void testSortByPrice() {
        List<Book> books = Arrays.asList(
                new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99),
                new Book("1984", "George Orwell", 1949, 8.99),
                new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99)
        );

        books.sort(Book.priceComparator);

        assertEquals(7.99, books.get(0).getPrice(), 0.01);
        assertEquals(8.99, books.get(1).getPrice(), 0.01);
        assertEquals(10.99, books.get(2).getPrice(), 0.01);
    }

    @Test
    public void testEmptyList() {
        List<Book> books = new ArrayList<>();

        books.sort(Book.titleComparator);

        assertTrue(books.isEmpty());
    }

    @Test
    public void testSingleBook() {
        List<Book> books = Arrays.asList(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 10.99));

        books.sort(Book.titleComparator);

        assertEquals("The Great Gatsby", books.get(0).getTitle());
    }
}