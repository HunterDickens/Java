public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding items
        manager.addItem(new Item("101", "Apple", 0.99));
        manager.addItem(new Item("102", "Banana", 0.59));
        manager.addItem(new Item("103", "cat", 1.99));

        // Searching for an item
        Item searchedItem = manager.getItem("103");
        if (searchedItem != null) {
            System.out.println("Found item: " + searchedItem.getName());
        } else {
            System.out.println("Item not found.");
        }

        // Removing an item
        manager.removeItem("102");
    }
}
