public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    class VehicleDetails {
        public void display() {
            System.out.println("Vehicle Details:");
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
        }
    }

    public void performAction() {
        Runnable action = new Runnable() {
            @Override
            public void run() {
                System.out.println("The vehicle is now running smoothly!");
            }
        };
        action.run();
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("Toyota", "Corolla", 2022);
        Vehicle.VehicleDetails details = car.new VehicleDetails();
        details.display();
        car.performAction();
    }
}
