package org.example;

public class Inheritance_Con {

}
class BankAccount{
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void WidthDraw(double amount){
        if (amount > 0 && amount <= balance){
            balance -= amount;
        }
        System.out.println("you can not widthDraw balance is 0");
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(10);
        System.out.println("Balance."+account.getBalance());
        account.WidthDraw(400);
        System.out.println("Balance. "+account.getBalance());
    }
}

