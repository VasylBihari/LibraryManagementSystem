import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    //Пошук книги за автором
    public void findBookAuthor (String author){
        List<Book> a = books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
        for (Book s:a){
            System.out.println(s);
        }
    }

    //Пошук книг за роком видання
    public void findBookYear (int year){
        List<Book> y = books.stream()
                .filter(book -> book.getYear()==year)
                .collect(Collectors.toList());
        for (Book s:y){
            System.out.println(s);
        }
    }

    //Пошук книг за жанром
    public void findBookGenre (String genre){
        List<Book> g = books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
        for (Book s:g){
            System.out.println(s);
        }
    }

    //Перегляд усіх книг у бібліотеці в порядку додавання
    public void revisionBooks (){
        Set <Book> bookSet = new LinkedHashSet<>(books);
        for (Book r:bookSet){
            System.out.println(r);
        }
    }
}
