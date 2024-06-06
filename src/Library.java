import java.util.HashSet;
import java.util.Set;

public class Library {

    private Set<Book> library;

    public Library() {
        this.library = new HashSet<>();
    }

    public void addBook (Book book){                   //Додати книгу до колекції.
        library.add(book);
    }
}
