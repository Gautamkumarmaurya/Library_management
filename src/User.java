import java.util.ArrayList;
import java.util.List;

public class User {
    private int userId;
    private String name;
    private List<Book> borrowedBooks = new ArrayList<>();

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(name + " borrowed: " + book.getBookId());
        } else {
            System.out.println("Book not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(name + " returned: " + book.getBookId());
        } else {
            System.out.println("This user didn't borrow that book.");
        }
    }
}


