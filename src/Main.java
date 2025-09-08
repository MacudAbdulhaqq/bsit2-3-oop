public class Main {
    public static void main(String[] args) {
        Order o1 = new Order("jane");
        System.out.println("=== Food Ordering System===");
        o1.addItem("Pizza", 12.99);
        o1.addItem(" ", 5.00);
        o1.addItem("Burger", -5.00);
        o1.displayOrder();
    }
}