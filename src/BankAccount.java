public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public void generateAccountNumber() {
        accountNumber = "BA00" + (Main.totalAccounts + 1);
    }

    public BankAccount(String accountHolderName, double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        generateAccountNumber();
        Main.totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: $" + balance);
    }

    public void deposit(double amount){
        balance += amount;
        System.out.print(accountHolderName + " deposited $" + amount + ". ");
        System.out.println("New balance: $" + balance);
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.print(accountHolderName + " withdrew $" + amount + ". ");
        System.out.println("New balance: $" + balance);
    }

    public void calculateInterest(){
        double interest = balance * Main.interestRate;
        System.out.println(accountHolderName + "'s Interest: $" + interest);
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
