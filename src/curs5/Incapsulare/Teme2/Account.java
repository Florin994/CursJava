package curs5.Incapsulare.Teme2;

public class Account {
    private double balance;

    public Account(double balance) {
        setBalance(balance);
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            throw new RuntimeException("Balance can not be set as negative!");
        } else {
            this.balance = balance;
        }
    }

    public void debit(double debitSum) {
        if (debitSum > balance || debitSum <= 0) {
            throw new RuntimeException("The debit amount exceeded the account balance!");
        } else {
            balance -= debitSum;
        }
    }

    public void addBalance(double balance) {
        if (balance > 0) {
            this.balance += balance;
        } else {
            throw new RuntimeException("You can not add a negative balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
