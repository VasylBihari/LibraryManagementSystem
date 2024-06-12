public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book(1000, "To Kill a Mockingbird", "Harper Lee",   1960, "Fiction"));
        library.addBook(new Book(1001, "1984", "George Orwell",   1949, "Science Fiction"));
        library.addBook(new Book(1002, "The Great Gatsby", "F. Scott Fitzgerald",   1925, "Fiction"));
        library.addBook(new Book(1003, "Pride and Prejudice", "Jane Austen",   1813, "Romance"));
        library.addBook(new Book(1004, "Moby-Dick", "Herman Melville",   1851, "Adventure"));
        library.addBook(new Book(1005, "The Hobbit ", "J.R.R. Tolkien",   1937, "Fantasy"));
        library.addBook(new Book(1006, "The Lord of the Rings", "J.R.R. Tolkien",   1954, "Fantasy"));
        System.out.println("Всі книги: ");
        for (Book b: library.books){
            System.out.println(b);
        }
        System.out.println("-----------------------");

        library.removeBook(1001);
        System.out.println("Книги після видалення: ");
        for (Book b: library.books){
            System.out.println(b);
        }
        System.out.println("-------------------------");

        library.findBookTitle("Pride and Prejudice");
        library.findBookTitle("Moby-Dick");

        System.out.println("--------------------------");

        library.findBookAuthor("J.R.R. Tolkien");

        System.out.println("----------------------------");

        library.findBookYear(1813);

        System.out.println("-----------------------------");
        library.findBookGenre("Fiction");
        System.out.println("------------------------------");

        library.revisionBooks();
        System.out.println("-----------------------------");

        library.sortTitleBooks();
        System.out.println("-----------------------------");

        library.sortYearBooks();
        System.out.println("-----------------------------");

        library.countBooks();
        System.out.println("--------------------------------");

        library.replaceBook(new Book(1000, "The Lord of the Rings", "J.R.R. Tolkien", 1954, "Fantasy"));

        System.out.println("Всі книги: ");
        for (Book b: library.books){
            System.out.println(b);
        }
    }
}
