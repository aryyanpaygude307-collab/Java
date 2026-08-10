class Vehicle {
    String brand;
    String model;

    Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    void showInfo() {
        System.out.println("Vehicle Brand: " + brand);
        System.out.println("Vehicle Model: " + model);
    }
}

class CarInsurance extends Vehicle {
    double premium;

    CarInsurance(String brand, String model, double premium) {
        super(brand, model);
        this.premium = premium;
    }

    void showInsuranceDetails() {
        super.showInfo();
        System.out.println("Car Insurance Premium: " + premium);
    }
}

class BikeInsurance extends Vehicle {
    double premium;

    BikeInsurance(String brand, String model, double premium) {
        super(brand, model);
        this.premium = premium;
    }

    void showInsuranceDetails() {
        super.showInfo();
        System.out.println("Bike Insurance Premium: " + premium);
    }
}

public class VehicleInsuranceApp {
    public static void main(String[] args) {
        CarInsurance car = new CarInsurance("Toyota", "Corolla", 15000);
        BikeInsurance bike = new BikeInsurance("Honda", "CBR", 8000);

        car.showInsuranceDetails();
        bike.showInsuranceDetails();
    }
}
