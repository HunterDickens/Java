import java.util.HashMap;
import java.util.Map;

public class InventoryManager{
    private Map <Product, Inventory> inventoryMap;

    public InventoryManager() {
        inventoryMap = new HashMap<>();
    }

    public void addProduction(Product product, Inventory inventory){
        inventoryMap.put(product, inventory);

    }
    public Inventory GetInventory(Product product){
        return inventoryMap.get(product);
    }
}