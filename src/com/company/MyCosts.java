package com.company;

public class MyCosts {
    String username;
    int balance;

    void showInfo(){
        System.out.println("Username:"+username);
        System.out.println("Balans:"+balance);
    }
    int getNowMoney(){
        return balance;
    }
    void spendMoney(int spending_sum){
        balance-=spending_sum;
        System.out.println(balance);
    }
    void addMoney(int adding_sum){
        balance+=adding_sum;
        System.out.println(balance);
    }
}
