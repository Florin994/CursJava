package curs5.Incapsulare.Teme2;

public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public void debit(double debitSum) {
        if (debitSum > balance || debitSum <= 0) {
            System.out.println("The debit amount exceeded the account balance!");
        } else {
            balance -= debitSum;
        }
    }

    public void addBalance(double balance) {
        if (balance > 0) {
            this.balance += balance;
        } else {
            System.out.println("You can not add a negative balance!");
        }
    }

    public double getBalance() {
        return balance;
    }
}
