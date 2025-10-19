public class Product {
    // Attributes
    private String id;
    private String name;
    private double price;
    private double discount; // discount percentage (e.g., 10 means 10%)

    // Constructor
    public Product(String id, String name, double price, double discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = discount;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    // Method to calculate price after discount
    public double priceAfterDiscount() {
        return price - (price * (discount / 100));
    }

    // Method to calculate final price with 5% VAT on the original price
    public double finalPrice() {
        double priceAfterDiscount = priceAfterDiscount();
        double vat = price * 0.05; // VAT on the original price
        return priceAfterDiscount + vat;
    }

    // Main method
    public static void main(String[] args) {
        Product p1 = new Product("P001", "Laptop", 500.0, 10);
        Product p2 = new Product("P002", "Phone", 300.0, 5);

        System.out.println("Detailed Calculation:");
        System.out.println(p1.getName() + " original: " + p1.getPrice()
                + ", after discount: " + p1.priceAfterDiscount()
                + ", final with VAT: " + p1.finalPrice());

        System.out.println(p2.getName() + " original: " + p2.getPrice()
                + ", after discount: " + p2.priceAfterDiscount()
                + ", final with VAT: " + p2.finalPrice());
    }
}