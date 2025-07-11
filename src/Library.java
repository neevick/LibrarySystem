import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book book1 = new Book(1, "Rich Dad Poor Dad", 15, "Vijan Rana");

        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookQuantity, bookAuthor) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,book1.getBookNumber());
            ps.setString(2,book1.getBookName());
            ps.setInt(3,book1.getBookQuantity());
            ps.setString(4,book1.getBookAuthor());
            int row = ps.executeUpdate();

            if (row>0){
                System.out.println("Successfully inserted");;
            }else {
                System.out.println("Not inserted");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }


//        Book book2 = new Book(2, "Motivation to Youths", 25, "Barun Thapa Magar");
//        Book book3 = new Book(3, "Think like Smaurai", 5, "Rishav Basnet");
//        Book book4 = new Book(4, "Guitar Chords and Lessons", 20, "Aashish Gyawali");
//        Book book5 = new Book(5, "Dropshipping Business Lessons", 30, "Suprim Gurung");
//
        User user1 = new User("Bijaya Khanal", 983090090);
        try {
            Connection conn = DatabaseConnection.connect();
            String query = "INSERT INTO user(userName, userContact) VALUES (?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,user1.getUserName());
            ps.setInt(2,user1.getUserContact());
            int row = ps.executeUpdate();

            if (row>0){
                System.out.println("Successfully inserted");;
            }else {
                System.out.println("Not inserted");
            }

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }




        try {
            Connection conn = DatabaseConnection.connect();
            String query = "SELECT * FROM book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookset = ps.executeQuery();
            ArrayList<Book> booklist = new ArrayList<>();

            while (bookset.next()){
                int bookNumber = bookset.getInt("bookNumber");
                String bookName = bookset.getString("bookName");
                int bookQuantity = bookset.getInt("bookQuantity");
                String authorName = bookset.getString("bookAuthor");
                Book book = new Book(bookNumber,bookName,bookQuantity,authorName);
                booklist.add(book);

            }
            for (Book book : booklist){
                System.out.println("Book number: "+ book.getBookNumber());
                System.out.println("Book Name: "+ book.getBookName());
                System.out.println("Book Quantity: "+ book.getBookQuantity());
                System.out.println("Book Author: " + book.getBookAuthor());
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
//        User user2 = new User("Neevik Thapa", 98000000);
//        while (true) {
//            System.out.println("Welcome to the library..");
//            System.out.println("Enter 1 to show available books");
//            System.out.println("Enter 2 to borrow book.");
//            System.out.println("Enter 3 to return book");
//            System.out.println("Enter 4 to exit.");
//            System.out.println("Choose an option: ");
//            int option = scan.nextInt();
//
//            if (option == 1) {
//                System.out.println("Show books");
//            } else if (option == 2) {
//                user1.borrowBook(user1,book1);
//                user2.borrowBook(user2,book3);
//            } else if (option == 3) {
//                System.out.println("Returning books");
//            } else if (option == 4) {
//                break;
//            } else {
//                System.out.println("Invalid options choose between given options.");
//            }
//        }
    }
}
