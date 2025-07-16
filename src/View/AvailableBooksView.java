package View;

import Controller.BookController;

public class AvailableBooksView {

    public static void showAvailableBooks() {
        BookController bookController = new BookController();
        bookController.showBooks();
    }
}
