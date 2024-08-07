package main.java.com.ohgiraffers.section05.logical;

public class Application02 {
    public static void main(String[] args) {

        /*
        * 논리 연산자의 우선순위 활용
        * 논리 and 연산자와 or 연산자의 우선 순위
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자가 or 연산자보다 우선순위가 높다.
        *
        * */

        // (1 <= 변수 <= 100 ) 불가

        int num1 = 55;
        System.out.println("1부터 100 사이 인지 확인 : " + ((num1 < 1) && (num1 <= 100)));
        // System.out.println(1 <= num1 <= 100);

        // 영어 대문자인지 확인
        char ch1 = 'G';
        System.out.println("영어 대문자인지 확인 : " + ((ch1 >= 'A') && (ch1 <= 'Z'))); //아스키코드를 활용함
        char ch2 = 'g';
        System.out.println("영어 대문자인지 확인 : " + ((ch2 >= 'A') && (ch2 <= 'Z')));

        // 대소문자 상관 없이 영문자 y 인지를 확인

        char a1 = 'y';
        char a2 = 'Y';
        System.out.println("영문자 y 인지를 확인 : " + ((a1 == 'y') || (a1 == 'Y')));
        System.out.println("영문자 y 인지를 확인 : " + ((a2 == 'y') || (a2 == 'Y')));

        // 영문자인지 확인
        // 아스키코드 이용해서 확인 a = 97, z = 122, A = 65, Z = 90

        /* 내오답char b1 = 'a';
        *char b2 = 'z';
        *char b3 = 'A';
        *char b4 = 'Z';
        *System.out.println(( b1 >= 97 && (b1 <= 122)));
        *System.out.println(( b2 >= 97 && (b2 <= 122)));
        *System.out.println(( b3 >= 65 && (b1 <= 90)));
        *System.out.println(( b4 >= 65 && (b1 <= 90)));
        * */
        char b1 = 'f';
        System.out.println("영문자인지 확인 : " + ((b1 >= 65 && b1 <= 90) || (b1 >= 97 && b1 <= 122)));

    }
}
