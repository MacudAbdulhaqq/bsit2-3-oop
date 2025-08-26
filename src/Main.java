public class Main {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;

    public static void main(String[] args) {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
        System.out.println();

        BankAccount ba1 = new BankAccount("Adam Smith", 1000);
        BankAccount ba2 = new BankAccount("John Grayson", 100);
        BankAccount ba3 = new BankAccount("Anna Williams", 500);
        System.out.println();

        System.out.println("===Account Operations===");
        ba1.withdraw(250);
        ba2.deposit(250);
        System.out.println();

        System.out.println("===Interest Calculation===");
        ba1.calculateInterest();
        ba2.calculateInterest();
        ba3.calculateInterest();
        System.out.println();

        System.out.println("Total Accounts Created: " + totalAccounts);
    }
}