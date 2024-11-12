package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BookService {
    static Scanner scanner = new Scanner(System.in);

    public static Book addBook() {

        Book book = new Book();
        System.out.println("Enter Book Name: ");
        book.name = scanner.nextLine();

        System.out.println("Enter Book Author: ");
        book.author = scanner.nextLine();

        System.out.println("Enter Book Id: ");
        book.id = scanner.nextInt();

        System.out.println("Enter year Of Publishing: ");
        book.yearOfPublishing = scanner.nextLine();

        System.out.println("Is Available? ");
        book.isAvailable = scanner.nextBoolean();

        return book;
    }

    public static List<Book> addBooks() {
        Boolean flag = true;
        List<Book> books = new ArrayList<>();
        while (flag) {
            books.add(BookService.addBook());
            System.out.println("Enter N to exit , Enter Any Key to continue");
            scanner.nextLine();
            if (scanner.nextLine().equalsIgnoreCase("N")) {
                flag = false;

            }
        }

        return books;
    }
}


