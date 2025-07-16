package Dao;

import Model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDao {
    public void insertBook(Book book) {
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "INSERT INTO book(bookNumber, bookName, bookQuantity, bookAuthor) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1,book.getBookNumber());
            ps.setString(2,book.getBookName());
            ps.setInt(3,book.getBookQuantity());
            ps.setString(4,book.getBookAuthor());
            int row = ps.executeUpdate();
            if (row>0){
                System.out.println("Successfully inserted");;
            }else {
                System.out.println("Not inserted");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void update_Book(int bookId, int bookNumber) {
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "UPDATE book SET bookNumber = ? WHERE bookid = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookNumber);
            ps.setInt(2, bookId);
            if (ps.executeUpdate() > 0) {
                System.out.println("book updated");
            } else {
                System.out.println("Failed to update");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void delete_Book(int bookId) {
        try {
            Connection conn = Dao.DatabaseConnection.connect();
            String query = "DELETE FROM book WHERE BookId = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, bookId);
            if (ps.executeUpdate() > 0) {
                System.out.println("Book deleted Successfully");
            } else {
                System.out.println("Book delete Failed");
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);

        }
    }

    public void show_Book() {
        try{
            Connection conn= DatabaseConnection.connect();
            ArrayList<Book> booklist = new ArrayList<>();
            String query = "SELECT BookNumber, BookName, BookAuthor, BookQuantity FROM book";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet bookSet = ps.executeQuery();//select gareesi execute vako
            while(bookSet.next()){
                Book Book0 = new Book(bookSet.getInt("BookNumber"), bookSet.getString("BookName"), bookSet.getInt("BookQuantity"), bookSet.getString("BookAuthor"));
                booklist.add(Book0);
            }
            for(Book Book0: booklist){
                System.out.println( "BookNumber"+"\n"+Book0.getBookNumber()+"\n"+"BookName"+"\n"+Book0.getBookName()+"\n"+"Book author"+"\n"+Book0.getBookAuthor()+"\n"+"BookQuantity"+"\n"+Book0.getBookQuantity());
            }
        }
        catch (SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
