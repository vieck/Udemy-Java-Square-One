import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mvieck on 12/28/16.
 */
public class Inventory implements InventoryActions, Categories {
    private ArrayList<Product> inventory;

    public Inventory() {
        inventory = new ArrayList<>();
        generateFakeProducts();
    }

    @Override
    public ArrayList<Product> getAllProducts() {
        return inventory;
    }

    @Override
    public void takeInventory() {
        System.out.println("Inventory");
        Product product;
        for (int i = 0; i < inventory.size(); i++) {
            product = inventory.get(i);
            System.out.printf("%d. uuid:%s, name:%s, category:%s, price:%.2f, quantity:%d\n",
                    i, product.getUuid().toString(), product.getName(), product.getCategory(), product.getPrice(), product.getQuantity());
        }
        System.out.println("-----------------------------------------------------------------------------------");
    }

    @Override
    public Product getProductByUUID(UUID id) {
        for (Product product : inventory) {
            if (product.getUuid() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public double getTotalCategoryInventoryValue(String category) {
        double total = 0.0;
        for (Product product: inventory) {
            if (product.getCategory().equals(category)) {
                total += product.getPrice() * product.getQuantity();
            }
        }
        return total;
    }

    @Override
    public double getTotalInventoryValue() {
        int items = 0;
        double value = 0.0;
        for(Product product : inventory) {
            items += product.getQuantity();
            value += product.getPrice() * product.getQuantity();
        }
        System.out.printf("%d items with a total value of %.2f\n", items, value);
        return value;
    }

    public void generateFakeProducts() {
        Product computer = new Product(UUID.randomUUID(), 300.99, 5, Categories.ELECTRONIC, "Computer");
        Product noodles = new Product(UUID.randomUUID(), 5.99, 20, Categories.FOOD,"Noodles");
        Product jacket = new Product(UUID.randomUUID(), 99.99, 10, Categories.CLOTHING, "Jacket");
        inventory.add(computer);
        inventory.add(noodles);
        inventory.add(jacket);
    }

    public static void main(String[] args) {
        Inventory inventoryTaker = new Inventory();
        inventoryTaker.takeInventory();
        inventoryTaker.getTotalInventoryValue();
        System.out.printf("Total Value of %s: %.2f\n",CLOTHING,inventoryTaker.getTotalCategoryInventoryValue(CLOTHING));
        UUID uuid = inventoryTaker.inventory.get(0).getUuid();
        System.out.printf("Find Product By UUID: %s", inventoryTaker.getProductByUUID(uuid).getName());
    }
}
