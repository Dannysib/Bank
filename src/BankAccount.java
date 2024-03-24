public class BankAccount {
    protected String firstName;
    protected String lastName;
    protected int accountID;
    protected double balance = 0.0;

    // default constructor
    public BankAccount() {
    }

   // deposit method
    public void deposit(double amount) {
        this.balance += amount;
    }
    //withdrawal method
    public void withdrawal(double amount) {
        this.balance -= amount;
    }
    //set first name method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    // get first name method
    public String getFirstName() {
        return this.firstName;
    }
    // set last name method
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    // get last name method
    public String getLastName() {
        return this.lastName;
    }
    // set id method
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }
    // get id method
    public int getAccountID() {
        return this.accountID;
    }
    // get balance method
    public double getBalance() {
        return this.balance;
    }
    // account summary method
    public void accountSummary() {
        System.out.println("First name: " + this.firstName);
        System.out.println("Last name: " + this.lastName);
        System.out.println("Account ID: " + this.accountID);
        System.out.println("Balance: " + this.balance);
    }
}

