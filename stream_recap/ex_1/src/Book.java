//Create a Book class with:
//
//        - String isbn
//        - String title
//        - String author
//        - double price
//
//        - Override equals and hashCode so books are distinct based on isbn.
//        - Create a list of books with duplicate ISBNs and varying prices.
//
//        - Use streams to:
//        -- Remove duplicates based on the ISBN.
//        -- Find the book with the highest price.
//        -- Group books by author and count how many books each author has.
//

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Book {
    private final String isbn;
    private final String title;
    private final String author;
    private final double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getters
    public String getIsbn() { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("2", "Book1", "Author1", 19.12),
                new Book("2", "Book1", "Author1", 29.32),
                new Book("3", "Book2", "Author1", 39.11),
                new Book("4", "Book3", "Author2", 49.11),
                new Book("5", "Book4", "Author2", 15.22)
        );


        // distintc book
        List<Book> distinctBooks = books.stream()
                .distinct()
                .toList();
        System.out.println("distinct books: " + distinctBooks);

        //book with highest price
        Book mostExpensive = books.stream()
                .max(Comparator.comparingDouble(Book::getPrice))
                .orElse(null);
        System.out.println("most expensive " + mostExpensive.getTitle());

}}