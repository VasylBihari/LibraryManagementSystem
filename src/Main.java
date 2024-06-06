public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        library.addBook(new Book(1000, "To Kill a Mockingbird", "Harper Lee",   1960, "Fiction"));
        library.addBook(new Book(1001, "1984 ", "George Orwell",   1949, "Science Fiction"));
        library.addBook(new Book(1002, "The Great Gatsby", "F. Scott Fitzgerald",   1925, "Fiction"));
        library.addBook(new Book(1003, "Pride and Prejudice", "Jane Austen",   1813, "Romance"));
        library.addBook(new Book(1004, "Moby-Dick", "Herman Melville",   1851, "Adventure"));

        for (Book b: library.books){
            System.out.println(b);
        }
    }
}
