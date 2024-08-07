package main.java.com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application01 {
    public static void main(String[] args) {

        /*
         * java.util.scanner
         * 콘솔 화면에 값을 입력 받는 기능을 제공한다.
         *
         * */

        Scanner scr = new Scanner(System.in);  //System.in을 입력해서 Scanner가 작동하도록 허가를 준다! 없으면 작동 x

        System.out.println("이름을 입력 해주세요 : ");

        String name = scr.nextLine();   // Scanner 클래스의 method를 받음!

        System.out.println("안녕하세요 " + name + "님!");

        System.out.println("나이를 입력 해주세요 : ");

        int age = scr.nextInt();

        System.out.println("입력하신 나이가 " + age + "세가 맞으세요?");

        System.out.println("금액을 입력 해주세요 : ");

        long lnum = scr.nextLong();

        System.out.println("입력하신 long : " + lnum);

        // 실수

        System.out.println("원하는 실수를 입력 해주세요 : ");

        double number = scr.nextDouble();

        System.out.println("입력하신 실수는 " + number + " 입니다.");

        // 논리형

        System.out.println("true or false 입력");

        boolean isTrue = scr.nextBoolean();

        if (isTrue) {
            System.out.println("참이다.");
        } else {
            System.out.println("거짓이다.");
        }

        scr.nextLine(); /// 위의 src.nextBoolean(); 에서 True or False를 입력하고 엔터를 누르면 엔터가 입력이 되므로 문자열 scanner 쓸때는 꼭 빈 nextline()을 넣어줘야한다!!

        // 문자형 값 입력

        System.out.println("아무 문자나 입력 해주세요 : ");
        char charValue = scr.nextLine().charAt(2);   ///(0)의 의미 : 문자중 순서가 0번째인 것을 읽는다는뜻, 문자 수를 넘게 입력하거나 적게 입력하면 에러가뜬다.    cf) 문자는 0,1,2,3,... 순으로 읽는다. ex) '문자'를 스캔하면 '문'이 '0', '자'가 '1' 이므로 charAt(1)은 '자'를 읽는다.
        System.out.println(charValue);

    }
}



