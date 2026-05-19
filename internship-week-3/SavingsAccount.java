public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String ownerName, String accountNumber, double balance, double interestRate) {
        super(ownerName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }

    @Override
    public void accountTypeInfo() {
        System.out.println("Account Type: Savings Account");
        System.out.println("This account earns interest.");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}