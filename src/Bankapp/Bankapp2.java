package Bankapp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bankapp2 {
    public static void main(String[] args) {
        Account a1=new Account("Joe Pass", 5);
        Account a2=new Account("Jimmy Hendrix", 7);

        a1.deposit(100);
        a1.withdraw(50);

        a1.anualInterest();
        a2.anualInterest();


        a1.printTransaction();
        a2.printTransaction();
    }
}

class Account {
    protected static int noOfAccounts=0;
    protected int accountNo;
    protected String owner;
    protected double balance;         // Indestående
    protected double interestRate;    // Årlig rente i %
    protected ArrayList<Transaction> transactions=new ArrayList<Transaction>();


    Account(String ow, double ir){
        noOfAccounts++;
        accountNo=noOfAccounts;
        owner=ow;
        interestRate=ir;
        balance=0;
    }

    void setOwner(String newName){
        owner=newName;
    }

    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new Transaction("Indsat", amount, balance));

    }

    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new Transaction("Hævet", amount, balance));

    }

    void anualInterest(){
        double amount=balance*interestRate/100;
        balance=balance+amount;
        transactions.add(new Transaction("Renter", amount, balance));
    }

    void printTransaction() {
        System.out.println(this);
        System.out.println("Tekst   Dato    Beløb   Saldo");
        for (Transaction t: transactions)
        System.out.println(t);
        System.out.println();

    }
    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }

}

class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newbalance;

    Transaction(String text, double amount, double newbalance){
        this.text=text;
        this.amount=amount;
        this.newbalance=newbalance;
        date=LocalDate.now();
    }
    @Override
    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newbalance;
    }

}
