package OOP.SchoolSystem.Entities;
import java.util.List;

public class Library {
   public List<Book> books;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<Book> getBooks() {
      return books;
   }

   public void setBooks(List<Book> books) {

      this.books = books;
   }

   private String name;
}
