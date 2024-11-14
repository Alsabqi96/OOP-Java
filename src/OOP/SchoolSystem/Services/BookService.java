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
        book.setName(scanner.nextLine());

        System.out.println("Enter Book Author: ");
        book.setAuthor(scanner.nextLine());

        System.out.println("Enter Book Id: ");
        book.setId(scanner.nextInt());

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



