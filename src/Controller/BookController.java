package Controller;

import Dao.BookDao;
import Model.Book;

import java.util.ArrayList;

public class BookController {
    private BookDao bookDao;
    public boolean storeBook(Book book) {
        return bookDao.insertBook(book);
    }

    public boolean updateBook(int bookId, int bookNumber) {
        return bookDao.update_Book(bookId, bookNumber);
    }

    public boolean deleteBook(int bookId) {
        return bookDao.delete_Book(bookId);
    }

    public ArrayList<Book> showBooks() {
        return bookDao.show_Book();
    }
}
