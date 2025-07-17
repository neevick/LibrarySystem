package View;

import Controller.BookController;
import Model.Book;

import java.util.ArrayList;

public class AvailableBooksView {

    public static void showAvailableBooks() {
        BookController bookController = new BookController();
        ArrayList<Book> booklist = bookController.showBooks();
        System.out.println("Available Books...........\n");
        for(Book Book0: booklist){
            System.out.println( "BookNumber: "+Book0.getBookNumber()+"\n"+"BookName: "+Book0.getBookName()+"\n"+"Book author: "+Book0.getBookAuthor()+"\n"+"BookQuantity: "+Book0.getBookQuantity()+"\n");
        }
    }
}
