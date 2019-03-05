package com.greenfox.bankofsimba.model;

public class BankAccount {
    private int balance;
    private String name;
    private String animalType;

    public BankAccount () {

    }

    public BankAccount(String name,int balance,String animalType) {
        this.name = name;
        this.balance = balance;
        this.animalType = animalType;

    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setBalancePlus(int plusDella) {
        balance = balance + plusDella ;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAnimalType (String animalType) {
        this.animalType = animalType;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
