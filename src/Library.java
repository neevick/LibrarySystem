import java.util.Scanner;

public class Library {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Book book1 = new Book(1, "Rich Dad Poor Dad", 15, "Vijan Rana");
        Book book2 = new Book(2, "Motivation to Youths", 25, "Barun Thapa Magar");
        Book book3 = new Book(3, "Think like Smaurai", 5, "Rishav Basnet");
        Book book4 = new Book(4, "Guitar Chords and Lessons", 20, "Aashish Gyawali");
        Book book5 = new Book(5, "Dropshipping Business Lessons", 30, "Suprim Gurung");

        User user1 = new User("Bijaya Khanal", 983090090);
        User user2 = new User("Neevik Thapa", 98000000);
        while (true) {
            System.out.println("Welcome to the library..");
            System.out.println("Enter 1 to show available books");
            System.out.println("Enter 2 to borrow book.");
            System.out.println("Enter 3 to return book");
            System.out.println("Enter 4 to exit.");
            System.out.println("Choose an option: ");
            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("Show books");
            } else if (option == 2) {
                System.out.println("Enter username: ");
                String userName = scan.nextLine();
                System.out.println("Enter book name: ");
                String bookName = scan.nextLine();
                user1.borrowBook(user1,book1);
                user2.borrowBook(user2,book3);
            } else if (option == 3) {
                System.out.println("Returning books");
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid options choose between given options.");
            }
        }
    }
}
