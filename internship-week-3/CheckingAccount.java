public class CheckingAccount extends BankAccount {
    private double withdrawalLimit;

    public CheckingAccount(String ownerName, String accountNumber, double balance, double withdrawalLimit) {
        super(ownerName, accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > withdrawalLimit) {
            System.out.println("Withdrawal failed. Limit is $" + withdrawalLimit);
        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void accountTypeInfo() {
        System.out.println("Account Type: Checking Account");
        System.out.println("This account is used for daily spending.");
    }

    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}