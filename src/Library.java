import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Library {

    Set<Book> books = new HashSet<>();

    //Додати книгу до колекції
    public void addBook(Book book) {
        if (books.contains(book)){
            System.out.println("Книга вже є в бібліотеці");
        } else {
            books.add(book);
        }
    }

    //Видалити книгу за ідентифікатором.
    public void removeBook(int num) {
        Predicate<Book> filter = book -> book.getId() == num;
        books.removeIf(filter);
    }

    //  //Оновити інформацію про книгу (за ідентифікатором).
    public void replaceBook(Book updatedBook) {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getId() == updatedBook.getId()) {
                iterator.remove();
                books.add(updatedBook);
                break;
            }
        }
        System.out.println("книга змінена");
    }

    //Пошук книги за назвою
    public void findBookTitle(String title) {
        Optional<Book> b = books.stream()
                .filter(book -> title.equals(book.getTitle()))
                .findFirst();
        System.out.println(b);
    }

    //Пошук книги за автором
    public void findBookAuthor(String author) {
        List<Book> a = books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .collect(Collectors.toList());
        for (Book s : a) {
            System.out.println(s);
        }
    }

    //Пошук книг за роком видання
    public void findBookYear(int year) {
        List<Book> y = books.stream()
                .filter(book -> book.getYear() == year)
                .collect(Collectors.toList());
        for (Book s : y) {
            System.out.println(s);
        }
    }

    //Пошук книг за жанром
    public void findBookGenre(String genre) {
        List<Book> g = books.stream()
                .filter(book -> book.getGenre().equals(genre))
                .collect(Collectors.toList());
        for (Book s : g) {
            System.out.println(s);
        }
    }

    //Перегляд усіх книг у бібліотеці в порядку додавання
    public void revisionBooks() {
        Set<Book> bookSet = new LinkedHashSet<>(books);
        for (Book r : bookSet) {
            System.out.println(r);
        }
    }

    //Перегляд усіх книг у бібліотеці за назвою в алфавітному порядку
    public void sortTitleBooks() {
        Comparator<Book> titleComparator = Comparator.comparing(Book::getTitle);

        Set<Book> treeSet = new TreeSet<>(titleComparator);
        treeSet.addAll(books);

        System.out.println("Відсортований за назвою:");
        treeSet.forEach(System.out::println);
    }

    //Перегляд усіх книг у бібліотеці за роком видання
    public void sortYearBooks() {
        Comparator<Book> yearComparator = Comparator.comparing(Book::getYear);
        Set<Book> treeSetYear = new TreeSet<>(yearComparator);
        treeSetYear.addAll(books);
        System.out.println("Відсортований за роком:");
        treeSetYear.forEach(System.out::println);
    }

    //Кількість книг у бібліотеці
    public void countBooks() {
        System.out.println("В бібліотеці є " + books.size() + " книг");
    }

    //Кількість книг кожного жанру
    public void countGenreBooks(String genre) {
        int count = 0;
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getGenre() == genre) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println("В бібліотеці є " + count + " книга з жанром " + genre);
        } else if (count >= 2 && count <= 4) {
            System.out.println("В бібліотеці є " + count + " книги з жанром " + genre);
        } else {
            System.out.println("В бібліотеці є " + count + " книг з жанром " + genre);
        }
    }

    public void printFormattedBooks (){
        String format = " %-4s  %-25s  %-20s  %-4s  %-15s %n";
        for (Book book : books) {
            System.out.format(format, book.getId(), book.getTitle(), book.getAuthor(), book.getYear(), book.getGenre());
        }
    }

}
