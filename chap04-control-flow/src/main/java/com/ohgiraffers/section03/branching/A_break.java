package main.java.com.ohgiraffers.section03.branching;

public class A_break {

    public void testSimpleBreakStatement(){

        /*
        * break 문은 반복문 내에서 사용한다.
        * 해당 반복문을 빠져 나올 때 사용하며, 반복문의 조건문 판단 결과와
        * 상관 없이 반복문을 빠져나올 때 사용한다.
        * 단, switch 는 반복문이 아니지만 예외적으로 사용한다.
        *
        * */


        // break 문을 활용하여 무한루프를 만들어 1~100까지의 합계 구하기
        int sum = 0;
        int i = 1;

        while(true){
            sum += i;    //100 되면 여기가 실행되고 아래 if문으로 넘어감!!!!

            if(i == 100){
                break;    //100까지 올려두고 와서 실행하니까 101 되려고 실행하는걸 끊음
            }

            i++;

        }
        System.out.println("1부터 100까지의 합은 : " + sum);
    }

    public void testSimpleBreakStatement2(){

        // break 는 모든 반복문을 종료하는 것이 아닌, 자신에게 가장 인접한
        // 반복문 실행만 멈춘다.

        // 구구단 2~9 단까지 출력
        // 수가 5보다 크면 생략

        for (int dan = 2; dan < 10; dan++){

            for (int su = 1; su < 10; su++) {

                if (su > 5){
                    break;
                }
                System.out.println(dan + " * " + su + " = " + (dan * su));
            }
            System.out.println(); //줄넘김
        }

    }

}
