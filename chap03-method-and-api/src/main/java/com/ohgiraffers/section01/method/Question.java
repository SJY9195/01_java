package main.java.com.ohgiraffers.section01.method;

public class Question {
    public static void main(String[] args){

        /*
        * 만들어보자
        * 두 수를 매개변수로 받아 더한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 뺀 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 곱한 값을 반환하는 메소드
        * 두 수를 매개변수로 받아 앞의 수에서 뒤의 수를 나눈 값을 반환하는 메소드
        *
        * */
        Question question = new Question();
        question.testmethod(10, 30);
        System.out.println(question.testmethod(10, 30)); /// 이것이 testmethod에서 반환(return)해서 메인메소드에서 프린트ln한것
       /* int sum = question.testmethod(10, 30);
        System.out.println("두수의 합은 " + sum + "이다."); */
        question.testmethod2(20, 40);
        question.testmethod3(30, 60);
        question.testmethod4(80, 40);

    }

    public int testmethod(int a, int b){
        System.out.println("두수의 합은 " + (a + b) + "이다.");  // 이건 return값이 아닌 testmethod에서의 println이다. 반환된건 main method에서 출력된다.
        return a+b;
    }

    public int testmethod2(int c, int d){
        System.out.println("두수의 차는 " + (c - d) + "이다.");
        return c - d;
    }

    public int testmethod3(int e, int f){
        System.out.println("두수의 곱은 " + (e * f) + "이다.");
        return e * f;
    }

    public int testmethod4(int g, int h){
        System.out.println("두수의 나누기는 " + (g / h) + "이다.");
        return g % h;
    }
}
