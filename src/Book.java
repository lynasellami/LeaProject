import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;

    // Default constructor
    public Book() {
        this.title = "Untitled";
        this.author = "Unknown";
        this.price = 0.0;
        this.publisher = "Not available";
        this.isbn = "000-0-00-000000-0";
    }

    // Constructor with title
    public Book(String title) {
        this.title = toTitleCase(title);
        this.author = "Unknown";
        this.price = 0.0;
        this.publisher = "Not available";
        this.isbn = "000-0-00-000000-0";
    }

    // Constructor with all data members
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = toTitleCase(title);
        this.author = toTitleCase(author);
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // Copy constructor
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        this.publisher = other.publisher;
        this.isbn = other.isbn;
    }

    // Check ISBN status
    public int checkIsbnStatus() {
        if (isbn.matches("\\d{1}-\\d{2,7}-\\d{1,7}-\\d{1}")
                || isbn.matches("\\d{1}-\\d{3,7}-\\d{1,7}-\\d{1}")) {
            return 0; // ISBN10
        } else if (isbn.matches("978-\\d{1}-\\d{2,7}-\\d{1,7}-\\d{1}")) {
            return 1; // ISBN13
        } else {
            return -1; // Invalid
        }
    }

    // Convert string to title case
    private String toTitleCase(String str) {
        String[] words = str.split(" ");
        StringBuilder titleCase = new StringBuilder();
        for (String word : words) {
            titleCase.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        return titleCase.toString().trim();
    }

    // Override toString()
    @Override
    public String toString() {
        return "Title      : " + title + "\n"
                + "Author     : " + author + "\n"
                + "Price      : " + price + "\n"
                + "Publisher  : " + publisher + "\n"
                + "ISBN       : " + isbn;
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Double.compare(book.price, price) == 0
                && title.equals(book.title)
                && author.equals(book.author)
                && publisher.equals(book.publisher)
                && isbn.equals(book.isbn);
    }

    // Clone method
    public Book clone() {
        return new Book(this);
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = toTitleCase(title);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = toTitleCase(author);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}