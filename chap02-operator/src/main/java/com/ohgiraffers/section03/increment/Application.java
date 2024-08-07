package main.java.com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {

        // 증감 연산자
        // '++X' , 'X++' : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 증가시킨다.
        // '--X' , 'X--' : 앞 또는 뒤에 있는 피연산자의 값을 1만큼 뺀다.

        int num = 10;
        int num2 = 20;
        int result = 0;

        result = result * ++num; // num = num + 1
        System.out.println(result);
        System.out.println(num);    //연산결과 상관없이 1을 증가 시키므로 결과값이 11이 나온다.

        result = 1;
        result = result * num++;   // 뒤에 ++ 가 있으면 연산후에 대입한 다음에 +1을 해준다.
        System.out.println(result);
        System.out.println(num);

        System.out.println("------------------------");

        result = 1;
        result = result * ++num;  // 앞에 ++가 있으면 num에 먼저 +1을 해준다.  이때 num의 값은 위의 결과값인 12이다.
        System.out.println(result);
        System.out.println(num);

    }
}