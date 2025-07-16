package Controller;

import View.AddBookView;
import View.AvailableBooksView;
import View.DeleteBookView;
import View.UpdateBookView;

public class ViewController {
    public static void getAddBookView() {
        AddBookView.showAddBookView();
    }

    public static void getUpdateBookView() {
        UpdateBookView.showUpdateView();
    }

    public static void getDeleteBookView() {
        DeleteBookView.showDeleteView();
    }

    public static void getAvailableBooksView() {
        AvailableBooksView.showAvailableBooks();
    }
}
