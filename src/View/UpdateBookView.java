package View;

import Controller.BookController;

import java.util.Scanner;

public class UpdateBookView {
    public static void showUpdateView() {
        Scanner scan = new Scanner(System.in);
        BookController bookController = new BookController();
        System.out.println("Enter bookNumber");
        int bookNumber = scan.nextInt();
        System.out.println("Enter bookId");
        int bookId = scan.nextInt();
        if (bookController.updateBook(bookId, bookNumber)) {
            System.out.println("Book updated successfully");
        } else {
            System.out.println("Book not updated");
        }
    }
}
