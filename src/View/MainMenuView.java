package View;

import Controller.ViewController;

import java.util.Scanner;

public class MainMenuView {
    public static void showMainView() {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Welcome to the Library");
            System.out.println("Enter 1: Add Book ");
            System.out.println("Enter 2: Borrow Book");
            System.out.println("Enter 3: Return Book");
            System.out.println("Enter 4: Update Book");
            System.out.println("Enter 5: Delete Book");
            System.out.println("Enter 6: Show available Books");
            System.out.println("Enter 7: Exit");
            System.out.println("Choose an option: ");
            int option = input.nextInt();
            if (option == 1) {
                ViewController.getAddBookView();
            } else if (option == 2) {
                // TODO BorrowBook
            } else if (option == 3) {
                // TODO Return Book
            } else if (option == 4) {
                ViewController.getUpdateBookView();
            } else if (option == 5) {
                ViewController.getDeleteBookView();
            } else if (option == 6) {
                ViewController.getAvailableBooksView();
            } else if (option == 7) {
                break;
            } else {
                System.out.println("Invalid input choose between the given options");
            }
        }
    }
}
