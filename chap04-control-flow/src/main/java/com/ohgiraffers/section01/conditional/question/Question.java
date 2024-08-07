package main.java.com.ohgiraffers.section01.conditional.question;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
        * a, b, c 세 과목의 점수를 스캐너로 입력 받고 세 과목의 점수를
        * 메소드를 생성해 매개변수로 전달해 평균을 계산하고,
        * 평균과 점수를 이용하여 합격 / 불합격 처리하는 기능을 구현 해주세요.
        * (합격 조건 : 세 과목의 점수가 각각 40점 이상이면서, 평균이 60점을 넘어야함.)
        * 합격 했을 경우에는 평균 점수와 "합격입니다" 를 출력하고,
        * 불합격인 경우에는 "불합격입니다." 라고 출력 해주세요.
        *
        * */
        // ---------------- 심화 문제------------------ 못푼다고 걱정하지 말자
                /* 피보나치 수열(An = An-1 + An-2)을 화면에 출력하라.
                (첫째 및 둘째 항이 1이며 그 뒤의 모든 항은 바로 앞 두항의 합인 수열)
                1. 결과값 : 1 1 2 3 5 8 13 21 34
                2. for문과 배열을 이용해 코드를 간소화하여 작성해야 한다.
                3. 9개 까지 출력한다.
                */

        Question avg = new Question();
        avg.number();
                //cf) 다른메소드의 변수를 받을 수 없으므로 별도로 입력을 해줘야 한다.
        }

    public void number(){

        Scanner scr = new Scanner(System.in);
        System.out.println("a 과목의 점수를 입력해주세요");
        int a = scr.nextInt();
        System.out.println("b 과목의 점수를 입력해주세요");
        int b = scr.nextInt();
        System.out.println("c 과목의 점수를 입력해주세요");
        int c = scr.nextInt();

        double average1 = average(a, b, c);

        if(a>=40 && b>=40 && c>=40 && average1>=60) {
            System.out.println("합격입니다.");
        }

        System.out.println("불합격입니다.");

    }

    public double average(int a, int b, int c){

        return (a+b+c) / 3.0;

    }



}
