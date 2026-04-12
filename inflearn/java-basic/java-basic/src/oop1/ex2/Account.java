package oop1.ex2;

public class Account {
    int balance; // 잔액

    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited "+amount);
    }

    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawing " + amount );
        } else {
            System.out.println("잔액부족");
        }
    }

    void printBalance() {
        System.out.println("Balance: " + balance);
    }
}
