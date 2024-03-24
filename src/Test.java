public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setFirstName("Daniel");
        account.setAccountID(1995);
        account.setLastName("Sibrian");
        account.deposit(1000.0);
        account.accountSummary();
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Daniel");
        checkingAccount.setLastName("Sibrian");
        checkingAccount.setAccountID(1995);
        checkingAccount.deposit(1000.0);
        checkingAccount.setInterestRate(0.02);
        checkingAccount.accountSummary();
        checkingAccount.processWithdrawal(1500.0);
        checkingAccount.displayAccount();
    }
}
