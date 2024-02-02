public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Widget", 19.99);
        Inventory inventory1 = new Inventory(100, "Warehouse 1");

        InventoryManager manager = new InventoryManager();
        manager.addProduct(product1, inventory1);

        // Testing the functionality
        Inventory foundInventory = manager.getInventory(product1);
        if (foundInventory != null) {
            System.out.println("Product: " + product1.getName());
            System.out.println("Inventory Quantity: " + foundInventory.getQuantity());
            System.out.println("Location: " + foundInventory.getLocation());
        }
    }
}
