public class BankAccountApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, "Aryyan", 5000.0);
        account.showDetails();
    }
}

class BankAccount {
    private final int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void showDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}
