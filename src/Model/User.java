package Model;

import java.util.Scanner;

public class User {
    private String userName;
    private int userContact;

    public User(String userName, int userContact) {
        this.userName = userName;
        this.userContact = userContact;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserContact() {
        return userContact;
    }

    public void setUserContact(int userContact) {
        this.userContact = userContact;
    }
    Scanner scanner = new Scanner(System.in);

    public void isRegistered(){
        // TODO.................
    }
    public void borrowBook(User user, Book book){
        if(book.getBookQuantity()>0) {
            Records record = new Records(user, book, false);
            book.decreaseQuantity();
        }else {
            System.out.println("Model.Book not available");
        }
    }

    public void returnBook(){

    }


}
