package View;

import Controller.BookController;

import java.util.Scanner;

public class DeleteBookView {
    public static void showDeleteView() {
        Scanner scan = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter a book id");
        int bookId = scan.nextInt();
        if (bookController.deleteBook(bookId)) {
            System.out.println("Book deleted successfully");
        } else {
            System.out.println("Book not deleted");
        }
    }
}
