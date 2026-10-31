import java.util.Scanner;

class BankAccount {
    int accNo;
    double balance;

    BankAccount(int n, double b) {
        accNo = n;
        balance = b;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient Balance");
    }

    void display() {
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankManagement {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(101, 5000);

        b.deposit(1000);
        b.withdraw(500);
        b.display();
    }
}
