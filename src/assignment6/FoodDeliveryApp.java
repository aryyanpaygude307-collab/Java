public class FoodDeliveryApp {

    private String customerName;
    private String foodItem;

    public FoodDeliveryApp(String customerName, String foodItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
    }

    class OrderDetails {

        public void showOrder() {
            System.out.println("Order Details:");
            System.out.println("Customer: " + customerName);
            System.out.println("Food Item: " + foodItem);
        }
    }

    public void updateDeliveryStatus(String status) {

        Runnable deliveryUpdate = new Runnable() {

            @Override
            public void run() {
                System.out.println("Delivery Status: " + status);
            }
        };

        deliveryUpdate.run();
    }

    public static void main(String[] args) {

        FoodDeliveryApp order =
                new FoodDeliveryApp("Aryyan", "Pizza");

        FoodDeliveryApp.OrderDetails details =
                order.new OrderDetails();

        details.showOrder();

        order.updateDeliveryStatus("Order Confirmed");
        order.updateDeliveryStatus("Out for Delivery");
        order.updateDeliveryStatus("Delivered Successfully");
    }
}