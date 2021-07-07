package guru.qa;

import static guru.qa.BankAccount.transferMoney;

public class Main {
    public static void main(String[] args) {
        BankAccount bA1 = new BankAccount(1, "Pavel", 14835);
        BankAccount bA2 = new BankAccount(2, "Anton", 9674.4);
        bA1.TopUpBalance(5000);
        bA2.RemoveBalance(3500);
        transferMoney(bA1, bA2, 3695);
    }
}
