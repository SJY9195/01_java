package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application02 {
    public static void main(String[] args) {

        /*
        * java.util.scanner
        * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
        * nextLine() : 공백(스페이스바)을 포함한 한 줄을 입력. 개행문자(Enter키) 전까지 읽어서 반환
        * next() : 공백문자나 개행문자 전 까지를 읽어서 반환 (공백문자 포함하지 않음)
        * */

        Scanner scr = new Scanner(System.in);
        System.out.println("값을 입력 해주세요 : ");
        String greeting = scr.nextLine();
        System.out.println(greeting);

        System.out.println("두번째 값을 입력 해주세요 : ");
        String greeting2 = scr.next();
        System.out.println(greeting2);

    }
}
