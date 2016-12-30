import java.util.UUID;

/**
 * Created by mvieck on 12/28/16.
 */
public class Product {
    private UUID uuid;
    private double price;
    private int quantity;
    private String category;
    private String name;

    public Product() {
        this.uuid = UUID.randomUUID();
        this.price = 0.0;
        this.quantity = 0;
        this.category = "";
        this.name = "";
    }

    public Product(UUID uuid, double price, int quantity, String category, String name) {
        this.uuid = uuid;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.name = name;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
