import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public class Library {

    Set<Book> books=new HashSet<>();

    public void addBook (Book book){   //Додати книгу до колекції.
        books.add(book);
    }

    //Видалити книгу за ідентифікатором.
    public void removeBook (int number){
            books.removeIf();
    }
}
