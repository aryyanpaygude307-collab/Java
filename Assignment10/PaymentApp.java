abstract class Payment {
    abstract void makePayment(double amount);
}

class CreditCardPayment extends Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}

class UPIPayment extends Payment {
    private String upiId;

    public UPIPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void makePayment(double amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("1234-5678-9876-5432");
        Payment upi = new UPIPayment("aryyan@upi");

        creditCard.makePayment(2500.0);
        upi.makePayment(1200.0);
    }
}
