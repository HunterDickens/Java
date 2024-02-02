import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Item> inventory;

    public InventoryManager() {
        inventory = new HashMap<>();
    }

    public void addItem(Item item) {
        inventory.put(item.getId(), item);
    }

    public void removeItem(String itemId) {
        inventory.remove(itemId);
    }

    public Item getItem(String itemId) {
        return inventory.get(itemId);
    }
    

    // Additional methods like displayInventory, updateItem, etc. can be added
}
