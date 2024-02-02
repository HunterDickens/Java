public class Main {
    public static void main(String[] args) {
        Library myLibrary = new Library();

        myLibrary.addBook("Science Fiction", new Book("Dune", "Frank Herbert", "12345"));
        myLibrary.addBook("Science Fiction", new Book("Neuromancer", "William Gibson", "23456"));
        myLibrary.addBook("Fantasy", new Book("The Hobbit", "J.R.R. Tolkien", "34567"));

        myLibrary.displayAllBooks();

        System.out.println("Books in Science Fiction: " + myLibrary.getBooksInCategory("Science Fiction"));
    }
}
