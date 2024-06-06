import java.util.HashSet;
import java.util.Set;

public class Library {

    Set<Book> books=new HashSet<>();

//    public Library() {
//        this.library = new HashSet<>();
//    }

    public void addBook (Book book){                   //Додати книгу до колекції.
        books.add(book);
    }
}
