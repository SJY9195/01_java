package main.java.com.ohgiraffers.section02.assignment;

public class Application {
    public static void main(String[] args) {

        /*
        * 대입 연산자와 산술 복합 대입 연산자
        *
        * '=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 대입한다.
        * '+=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 더한 결과를 대입한다.
        * '-=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 뺀 값을 대입한다.
        * '*=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 곱한 결과를 대입한다.
        * '/=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 결과를 대입한다.
        * '%=' : 왼쪽의 피 연산자에 오른쪽의 피 연산자를 나눈 나머지 결과를 대입한다.
        *
        * */
        
        int num = 12;

        System.out.println("num = " + num);  ///soutv 만든 변수를 가지고 틀을 만들어줌 (팁)
        
        // 3 증가
        num = num + 3;
        System.out.println("num = " + num);
        
        num += 3;
        System.out.println("num = " + num);
        
        // 5로 나눈 나머지 값
        num %= 5;
        System.out.println("num = " + num);
        
        
        num = 12;
        //num = num * 4.1; (정수 * 실수 출력x) (실수를 정수로 바꿔야 되므로 실행x)
        
        num *= 4.1; // 연산 후에 형변환이 일어난다. 복합대입 연산자는 알아서 형변환을 해준다.
        System.out.println("num = " + num);

        
    }
}
