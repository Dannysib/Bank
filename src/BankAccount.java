public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance = 0.0;

    public BankAccount() {
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    public int getAccountID() {
        return this.accountID;
    }

    public double getBalance() {
        return this.balance;
    }

    public void accountSummary() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Account ID: " + this.accountID);
        System.out.println("Balance: " + this.balance);
    }
}

