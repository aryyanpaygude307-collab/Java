public class ECommerceApp {
    public static void main(String[] args) {
        Product laptop = new ElectronicProduct("Laptop", 55000, "Dell");
        Product shirt = new ClothingProduct("Shirt", 1200, "M");
        Product rice = new GroceryProduct("Rice", 800, "Grains");

        laptop.showDetails();
        shirt.showDetails();
        rice.showDetails();
    }
}


interface Product {
    void showDetails();
}

abstract class BaseProduct implements Product {
    protected String name;
    protected double price;

    public BaseProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ElectronicProduct extends BaseProduct {
    private String brand;

    public ElectronicProduct(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void showDetails() {
        System.out.println("Electronic Product: " + name + ", Brand: " + brand + ", Price: " + price);
    }
}

class ClothingProduct extends BaseProduct {
    private String size;

    public ClothingProduct(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Clothing Product: " + name + ", Size: " + size + ", Price: " + price);
    }
}

class GroceryProduct extends BaseProduct {
    private String category;

    public GroceryProduct(String name, double price, String category) {
        super(name, price);
        this.category = category;
    }

    @Override
    public void showDetails() {
        System.out.println("Grocery Product: " + name + ", Category: " + category + ", Price: " + price);
    }
}
