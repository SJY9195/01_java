package main.java.com.ohgiraffers.understand.chap01;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        //계좌 만들기
        System.out.println("계좌번호를 입력해주세요 : ");
        String accountnumber = scr.nextLine();

        System.out.println("계좌소유자 이름을 입력해주세요 : ");
        String accountholder = scr.nextLine();

        System.out.println("초기잔액을 입력해주세요 : ");
        int initBalance = scr.nextInt();

        BankAccount account = new BankAccount(initBalance, accountnumber, accountholder);

        while (true) {
            System.out.println("===은행 시스템 프로그램===");
            System.out.println(" 1. 입금 ");
            System.out.println(" 2. 출금 ");
            System.out.println(" 3. 잔액 조회 ");
            System.out.println(" 4. 종료 ");
            System.out.println(" 원하는 번호를 선택해주세요 : ");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("입금할 금액을 입력해주세요 : ");
                    int money = scr.nextInt();
                    account.deposit(money);
                    break;
                case 2:
                    System.out.println("출금할 금액을 입력해주세요 : ");
                    int money2 = scr.nextInt();
                    account.withdraw(money2);
                    break;
                case 3:
                    account.Balanceinquiry();
                    break;
                case 4:
                    System.out.println("프로그램을 종료합니다");
                    return;
            }
        }

    }
}
