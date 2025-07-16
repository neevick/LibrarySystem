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
        bookController.updateBook(bookId, bookNumber);
    }
}
