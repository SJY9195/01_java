package main.java.com.ohgiraffers.section01.arithmetic;

public class Application {
    public static void main(String[] args) {

        /*
        * 산술 연산자
        * 산술 연산자는 주로 사칙연산과 관련된 연산자로 가장 기본적이면서
        * 가장 많이 사용되는 연산자이다.
        * 연산의 실행이 가능하기 위해 필요한 값이나 변수가
        * 두 개인 이항 연산자로 분류되며
        * 피 연산자들의 연산 방향은 왼쪽에서 오른쪽이다.
        *
        * 산술 연산자의 종류
        * +
        * -
        * *
        * /
        * %
        *
        * 우선순위는 알고 있는 수학과 동일하다.
        *
        *
        * */

        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + num1 + num2); //이렇게 입력하면 문자열로 인식하기때문에 결과값이 207로 나온다. 그러므로 정수형에 괄호쳐줘야한다.
        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + num1 * num2); //수학과 같이 * 나 /,%(나머지연산) 는 먼저 연산되기 때문에 이렇게 입력이 가능하다.
        System.out.println("num1 / num2 = " + num1 / num2);
        System.out.println("num1 % num2 = " + num1 % num2);

    }
}
