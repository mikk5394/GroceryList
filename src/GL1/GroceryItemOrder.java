package GL1;

public class GroceryItemOrder {

    private String itemName;
    private double price;
    private int quantity;

    public GroceryItemOrder(String itemName, double price, int quantity){

        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public GroceryItemOrder(String itemName) {
        this.itemName = itemName;
        this.quantity = 1;
    }

    public double getCost(){
        return quantity*price;
    }

    @Override
    public String toString() {
        return  "\n" + itemName  +
                ", price: " + price +
                ", quantity: " + quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
