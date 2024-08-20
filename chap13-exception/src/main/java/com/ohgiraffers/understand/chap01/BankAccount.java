package main.java.com.ohgiraffers.understand.chap01;

public class BankAccount {

    private int balance;

    private String accountNumber;

    private String name;

    public BankAccount(int balance, String accountNumber, String name) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", name='" + name + '\'' +
                '}';
    }

    public void deposit(int amount) {       //입금 메소드   amount가 입금금액

        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " 만큼 입금되셨습니다.");
        } else {
            System.out.println("입금금액을 제대로 입력해주세요.");
        }

    }

    public void withdraw(int amount) {     //출금 메소드   amount가 출금금액
        try {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
                System.out.println(amount + " 만큼 출금하셨습니다.");
            } else if (amount > 0 && balance < amount) {
                throw new Exception("잔액이 부족합니다.");
            } else {
                System.out.println("출금금액을 제대로 입력해주세요.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void Balanceinquiry (){
        System.out.println("현재 잔액은 : " + balance + "원 입니다.");
    }

}
