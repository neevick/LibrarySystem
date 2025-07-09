import java.time.LocalDate;
import java.util.ArrayList;

public class Records {
    private User user;
    private Book book;
    private LocalDate dateTime;
    private int borrowedQuantity;
    private boolean returnStatus;

    static ArrayList<Records> recordList = new ArrayList<>();

    public Records(User user, Book book, int borrowedQuantity, boolean returnStatus) {
        this.user = user;
        this.book = book;
        this.dateTime = dateTime;
        this.borrowedQuantity = borrowedQuantity;
        this.returnStatus = false;
    }


}
