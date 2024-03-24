public class CheckingAccount extends BankAccount {
    private double interestRate;

    public CheckingAccount() {
    }
    //process withdrawal method
    public void processWithdrawal(double amount) {
        if (amount > this.getBalance()) {
            System.out.println("Insufficient funds. You will be charged a $30 overdraft fee.");
            super.withdrawal(30.0);
            super.withdrawal(amount);
        } else {
            super.withdrawal(amount);
        }

    }
    //display account method
    public void displayAccount() {
        super.accountSummary();
        System.out.println("Interest Rate: " + this.interestRate);
    }
    // get interest method
    public double getInterestRate() {
        return this.interestRate;
    }
    // set interest method
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}
