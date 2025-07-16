package View;

import Controller.BookController;
import Model.Book;

import java.util.Scanner;

public class AddBookView {
    public static void showAddBookView (){
        Scanner input = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Please enter book details to add book");
        System.out.println("Enter book name: ");
        String bookName = input.next();
        System.out.println("Enter book number: ");
        int bookNumber = input.nextInt();
        System.out.println("Enter author name: ");
        String bookAuthor = input.next();
        System.out.println("Enter book quantity: ");
        int bookQuantity = input.nextInt();
        Book book = new Book(bookNumber,bookName,bookQuantity,bookAuthor);
        bookController.storeBook(book);
    }
}
