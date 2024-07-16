package oop1.ex;

public class Account {
    int balence;

    void deposit(int amount){
        balence += amount;
    }

    void withdraw(int amount){
        if(balence >= amount){
            balence -= amount;
        }else{
            System.out.println("잔액 부족");
        }
    }
}

