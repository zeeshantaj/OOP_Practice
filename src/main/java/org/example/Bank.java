package org.example;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private ArrayList < Account > accounts;

    public Bank(){
        accounts = new ArrayList<Account>();
    }
    public  void addAccount(Account account){
        accounts.add(account);
    }
    public void removeAccount(Account account){
        accounts.remove(account);
    }
    public void deposit(Account account,double amount){
        account.deposit(amount);
    }
    public void widthDraw(Account account,double amount){
        account.widthDraw(amount);
    }
    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account2 = new Account("zee", 123412, 3214.23);
        Account account1 = new Account("zohaib", 1232112, 1276.22);
        Account account3 = new Account("zohaib", 1232112, 1276.22);

        bank.addAccount(account2);
        bank.addAccount(account1);
        bank.addAccount(account3);

        ArrayList < Account > accounts = bank.getAccounts();

        for (Account account: accounts) {
            System.out.println(account.getAccountInfo());
        }

        System.out.println("\nAfter depositing 1000 into account1:");
        bank.deposit(account1, 1000);
        System.out.println(account1.getAccountInfo());
        System.out.println("No transaction in account2:");
        System.out.println(account2.getAccountInfo());
        System.out.println("After withdrawing 5000 from account3:");
        bank.widthDraw(account3, 5000);
        System.out.println(account3.getAccountInfo());
    }

}

class Account{

    String name;
    int accountNumber;
    double balance;



    public Account(String name, int accountNumber,double balance){
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void widthDraw(double amount){
        balance -= amount;
    }
    public String getAccountInfo() {
        return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
    }
}
