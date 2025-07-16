package Controller;

import Dao.BookDao;
import Model.Book;

public class BookController {
    public void storeBook(Book book) {
        BookDao bookDao = new BookDao();
        bookDao.insertBook(book);
    }

    public void updateBook(int bookId, int bookNumber) {
        BookDao bookDao = new BookDao();
        bookDao.update_Book(bookId, bookNumber);
    }

    public void deleteBook(int bookId) {
        BookDao bookDao = new BookDao();
        bookDao.delete_Book(bookId);
    }

    public void showBooks() {
        BookDao bookDao = new BookDao();
        bookDao.show_Book();
    }
}
