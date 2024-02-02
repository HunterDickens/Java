import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private HashMap<String, Set<Book>> categories;

    public Library() {
        categories = new HashMap<>();
    }

    public void addBook(String category, Book book) {
        categories.computeIfAbsent(category, k -> new HashSet<>()).add(book);
    }

    public Set<Book> getBooksInCategory(String category) {
        return categories.getOrDefault(category, new HashSet<>());
    }

    public void displayAllBooks() {
        for (String category : categories.keySet()) {
            System.out.println("Category: " + category);
            for (Book book : categories.get(category)) {
                System.out.println(book);
            }
        }
    }
}
