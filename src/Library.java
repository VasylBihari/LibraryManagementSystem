import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class Library {

    Set<Book> books=new HashSet<>();

    //Додати книгу до колекції
    public void addBook (Book book){
        books.add(book);
    }

    //Видалити книгу за ідентифікатором.
    public void removeBook (int num){
        Predicate<Book> filter = book -> book.getId()==num;
            books.removeIf(filter);
    }
//  //Оновити інформацію про книгу (за ідентифікатором).
//    public void replaceBook (Book book){
//
//    }

     //Пошук книги за назвою
    public void findBookTitle (String title){
        Optional <Book> b = books.stream()
                .filter(book -> title== book.getTitle())
                .findFirst();
        System.out.println(b);
    }
}
