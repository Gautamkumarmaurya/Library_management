import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample data
        library.addBook(new Book(1, "Java Basics", "James Gosling"));
        library.addBook(new Book(2, "OOPS Concepts", "Bjarne Stroustrup"));

        library.registerUser(new User(1001, "Gautam"));
        library.registerUser(new User(1002, "Raunak"));

        while (true) {
            System.out.println("\n==== Library Menu ====");
            System.out.println("1. View Available Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    library.displayAvailableBooks();
                    break;
                case 2:
                    System.out.print("Enter User ID: ");
                    int uid = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bid = scanner.nextInt();
                    library.issueBook(bid, uid);
                    break;
                case 3:
                    System.out.print("Enter User ID: ");
                    int uidr = scanner.nextInt();
                    System.out.print("Enter Book ID: ");
                    int bidr = scanner.nextInt();
                    library.returnBook(bidr, uidr);
                    break;
                case 4:
                    System.out.println("Exiting Library System...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
