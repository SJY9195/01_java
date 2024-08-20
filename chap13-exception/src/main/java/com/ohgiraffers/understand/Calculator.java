package main.java.com.ohgiraffers.understand;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        /*
         * 사용자에게 숫자 두 개와 연산자를 입력 받습니다.
         * 입력된 연산을 수행하여 결과를 출력합니다.
         * / 는 0로 할 수 없기 때문에 예외처리 해주시고
         * 사용자가 잘못된 연산자를 입력하면 예외처리 해주세요.
         *
         * */

        /*
        try {
            throw new Exception("에러발생");
        } catch (Exception e) {
            System.out.println("오류 발생");
        }
        */ //예시


        Scanner scr = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요 : ");
        int a = scr.nextInt();
        System.out.println("연산자를 입력해주세요 : ");
        char c = scr.next().charAt(0);
        System.out.println("숫자를 입력해주세요 : ");
        int b = scr.nextInt();

        scr.nextLine();
        try {
            if (c == '+') {
                System.out.println(a + b);
            } else if (c == '-') {
                System.out.println(a - b);
            } else if (c == '*') {
                System.out.println(a * b);
            } else if (c == '/') {
                if (b == 0) {
                    throw new Exception("0으로 나눌수없습니다.");
                }
                System.out.println(a / b);
            } else {
                throw new Exception("연산자를 잘못입력하셨습니다. 다시 실행시켜주세요!");
            }
        }catch(Exception e){
                e.printStackTrace();
            }
    }
}