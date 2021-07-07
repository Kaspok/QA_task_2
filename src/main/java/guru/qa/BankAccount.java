package guru.qa;

public class BankAccount {
    int id;
    String name;
    double balance;

    public BankAccount(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    void TopUpBalance(double count) {
        balance += count;
        System.out.printf("After the deposit, the balance on the account - %s\n", balance);
    }

    void RemoveBalance(double count) {
        balance -= count;
        System.out.printf("After withdrawal, the balance on the account - %s\n", balance);
    }

    public static void transferMoney(BankAccount ba1, BankAccount ba2, double count) {
        ba1.balance -= count;
        ba2.balance += count;
        System.out.printf("Sending money to another account was completed successfully. Balance ba1 = %s, Balance ba2 = %s", ba1.balance, ba2.balance);
    }
}
