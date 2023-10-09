package Bankapp;

import Bankapp.Account;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.SortedMap;

public class BankApp3 {
    public static void main(String[] args) {
        Account a1=new Indlaan("Joe Pass", 5);
        Account a2=new Hojrente("Jimmy Hendrix", 10, 10000, LocalDate.of(2023, 9, 25));
        Account a3=new MillionKonto("Alexander Larsen", 0, 500);
        Account a4=new MillionKonto("Frank Hvam", 0, 400);


        ArrayList<Account> list=new ArrayList<Account>();
        list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a4);

        ArrayList<Account> millionliste=new ArrayList<Account>();
        millionliste.add(a3);
        millionliste.add(a4);


        for (Account a: list) a.printTransaction();
        for (Account a: list) a.deposit(100);

        for (Account a: list) a.anualInterest();






    }
}

class Indlaan extends Account {
    Indlaan(String ow, double ir){
        super(ow, ir);


    }

    void withdraw(double amount){
        if (balance>=amount){
            super.withdraw(amount);
        }
        else
            System.out.println("Du kan højst hæve "+balance+ "kr.");

    }
}

class Hojrente extends Account {
    LocalDate releasedate;

    Hojrente(String ow, double ir, double startBalance, LocalDate rd){
        super(ow, ir);
        super.deposit(startBalance);
        releasedate=rd;

    }
    void deposit(double amount) {
        System.out.println("Du kan ikke sætte penge ind på denne konto");
    }
    void withdraw(double amount){
        if (releasedate.isAfter(LocalDate.now()))
            System.out.println("Du kan først hæve efter "+releasedate);
        else
            super.withdraw(amount);


    }

}
class MillionKonto extends Account {
    static ArrayList<Account> millionliste=new ArrayList<Account>();


    MillionKonto(String ow, double ir, double StartKapital){
        super(ow, 0);
        deposit(StartKapital);
        millionliste.add(this);
    }

    void anualInterest(double amount){
        Random lotteri = new Random();
        int vindernr= lotteri.nextInt(millionliste.size());
        Account vinder=millionliste.get(vindernr);
        System.out.println(vinder);
        vinder.deposit(1000000);
    }



}