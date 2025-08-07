
public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable = true;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
    }

    public int getBookId() {
        return bookId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void displayDetails() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

