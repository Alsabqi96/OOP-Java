package OOP.SchoolSystem.Services;
import OOP.SchoolSystem.Entities.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryService {
    static Scanner scanner = new Scanner(System.in);
    public static Library addLibrary() {

        Library library = new Library();
        System.out.println("Enter Library Name: ");
        String libraryName = scanner.nextLine();
        library.setName(libraryName);
        library.books = BookService.addBooks();


        return library;
    }

}
