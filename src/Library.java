import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Default constructor
    public Library() {
        books = new ArrayList<>();
        books.add(new Book("Book One", "Author One", 10.99, "Publisher One", "1-11-111111-1"));
        books.add(new Book("Book Two", "Author Two", 15.99, "Publisher Two", "978-1-11-111111-1"));
        books.add(new Book("Book Three", "Author Three", 20.99, "Publisher Three", "1-111-11111-1"));
        books.add(new Book("Book Four", "Author Four", 25.99, "Publisher Four", "978-1-111-11111-1"));
        books.add(new Book("Book Five", "Author Five", 30.99, "Publisher Five", "1-1111-1111-1"));
    }

    // Constructor with ArrayList
    public Library(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }

    // Copy constructor
    public Library(Library other) {
        this.books = new ArrayList<>(other.books);
    }

    // Search for books by keyword
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> searchResults = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(keyword.toLowerCase())
                    || book.getAuthor().toLowerCase().contains(keyword.toLowerCase())) {
                searchResults.add(book);
            }
        }
        return searchResults;
    }

    // Override toString()
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Library contains:\n");
        for (Book book : books) {
            sb.append(book.toString()).append("\n\n");
        }
        return sb.toString();
    }

    // Equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Library library = (Library) obj;
        return books.equals(library.books);
    }

    // Getters and setters
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = new ArrayList<>(books);
    }
}