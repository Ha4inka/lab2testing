package org.example;

import java.util.Comparator;

public class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public static Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);
    public static Comparator<Book> authorComparator = Comparator.comparing(Book::getAuthor);
    public static Comparator<Book> yearComparator = Comparator.comparingInt(Book::getYear);
    public static Comparator<Book> priceComparator = Comparator.comparingDouble(Book::getPrice);
}
