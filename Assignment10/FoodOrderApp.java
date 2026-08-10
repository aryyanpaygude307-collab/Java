abstract class FoodOrder {
    abstract double calculateBill(double pricePerItem, int quantity);
}

class DineInOrder extends FoodOrder {
    @Override
    double calculateBill(double pricePerItem, int quantity) {
        double bill = pricePerItem * quantity;
        System.out.println("Dine-In Order Bill: " + bill);
        return bill;
    }
}

class TakeAwayOrder extends FoodOrder {
    @Override
    double calculateBill(double pricePerItem, int quantity) {
        double bill = (pricePerItem * quantity) + 50; // extra packing charge
        System.out.println("Take-Away Order Bill: " + bill);
        return bill;
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodOrder dineIn = new DineInOrder();
        FoodOrder takeAway = new TakeAwayOrder();

        dineIn.calculateBill(200.0, 3);
        takeAway.calculateBill(150.0, 2);
    }
}
