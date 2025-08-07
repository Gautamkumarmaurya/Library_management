
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Book findBookById(int bookId) {
        for (Book b : books) {
            if (b.getBookId() == bookId) return b;
        }
        return null;
    }

    public User findUserById(int userId) {
        for (User u : users) {
            if (u.getUserId() == userId) return u;
        }
        return null;
    }

    public void issueBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.borrowBook(book);
        } else {
            System.out.println("User or Book not found.");
        }
    }

    public void returnBook(int bookId, int userId) {
        Book book = findBookById(bookId);
        User user = findUserById(userId);
        if (book != null && user != null) {
            user.returnBook(book);
        } else {
            System.out.println("User or Book not found.");
        }
    }

    public void displayAvailableBooks() {
        for (Book b : books) {
            if (b.isAvailable()) {
                b.displayDetails();
            }
        }
    }
}


