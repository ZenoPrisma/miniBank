public class Account {
    private int id;
    private String accountNumber;
    private double balance;
    private String accountType;

    public Account(int id, String accountNumber, double initialBalance, String accountType) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountType = accountType;
    }

    public int id() {
        return id;
    }

    public void id(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void payIn(double amount) {
        balance += amount;
    }

    public boolean payOut(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}