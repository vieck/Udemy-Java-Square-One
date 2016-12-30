import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mvieck on 12/28/16.
 */
public interface InventoryActions {
    ArrayList<Product> getAllProducts();
    void takeInventory();
    Product getProductByUUID(UUID id);
    double getTotalCategoryInventoryValue(String category);
    double getTotalInventoryValue();
}
