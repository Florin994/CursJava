package curs5.Incapsulare.Teme2;

public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account(100.50);
        myAccount.debit(35.0);
        System.out.println(myAccount.getBalance());
        myAccount.addBalance(250);
        System.out.println(myAccount.getBalance());
    }
}
