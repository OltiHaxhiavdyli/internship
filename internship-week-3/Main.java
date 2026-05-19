public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("Olti", "S001", 500, 5);
        CheckingAccount checking = new CheckingAccount("Arta", "C001", 300, 150);

        System.out.println("===== Savings Account =====");
        savings.accountTypeInfo();
        savings.displayAccountInfo();

        System.out.println();

        savings.deposit(200);
        savings.withdraw(100);
        savings.applyInterest();

        System.out.println();

        savings.displayAccountInfo();

        System.out.println();
        System.out.println("===== Checking Account =====");

        checking.accountTypeInfo();
        checking.displayAccountInfo();

        System.out.println();

        checking.deposit(100);
        checking.withdraw(200);
        checking.withdraw(100);

        System.out.println();

        checking.displayAccountInfo();

        System.out.println();
        System.out.println("===== Polymorphism Example =====");

        BankAccount account1 = new SavingsAccount("Ben", "S002", 1000, 3);
        BankAccount account2 = new CheckingAccount("Dion", "C002", 700, 250);

        account1.accountTypeInfo();
        account2.accountTypeInfo();
    }
}