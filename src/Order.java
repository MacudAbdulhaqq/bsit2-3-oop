import java.util.*;

public class Order {
    private String customerName;
    private ArrayList<String> items = new ArrayList<>();
    private ArrayList<Double> prices = new ArrayList<>();
    private static int totalOrders = 0;

    public Order(String customerName) {
        String name = customerName;
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        totalOrders++;
    }

    public void addItem(String item, double price) throws IllegalArgumentException {
        try {
            if (price <= 0) {
                throw new IllegalArgumentException("Invalid price: must be greater than 0");
            }
            if (item.isBlank()) {
                throw new IllegalArgumentException("Invalid item: cannot be empty");
            }
            items.add(item);
            prices.add(price);
            System.out.println("Item '" + item + "' added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public double getTotalAmount(){
        double totalAmount = 0;
        for (double price : prices){
            price += totalAmount;
        }
        return totalAmount;
    }

    public String getOrderSize(){
        String orderSize = "";
        int totalItems = 0;
        for (String item : items){
            totalItems++;
        }
        if (totalItems >= 7){
            orderSize = "Large";
        } else if (totalItems >= 4){
            orderSize = "Medium";
        } else if (totalItems >= 1){
            orderSize = "Small";
        } else {
            System.out.println("Empty Order");
        }
        return orderSize;
    }

    public String displayOrder(){
        System.out.println("Order for " + customerName + ": " + items.toArray().length + " items, Total: $" + getTotalAmount() + ", Size: " + getOrderSize());
        return customerName;
    }
}
