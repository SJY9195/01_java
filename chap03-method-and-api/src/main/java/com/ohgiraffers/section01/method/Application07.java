package main.java.com.ohgiraffers.section01.method;

public class Application07 {
    public static void main(String[] args) {

        /*
        * static 메소드 호출
        *
        * static 메소드를 호출하는 방법
        * 클래스명.메소드명()
        *
        *
        * */

        System.out.println("10과 20의 합 : " + Application07.sumTwoNumbers(10, 20));

        Application07 app7 = new Application07();            //이런 식으로 사용하는걸 권장하지 않는다. static은 이미 메모리에 올라가 있는데 굳이 다시 메모리에 올릴 필요가 없으므로
        System.out.println(app7.sumTwoNumbers(10, 20));


        // 동일한 클래스 내에 작성된 static 메소드는 클래스명 생략이 가능하다.
        System.out.println(sumTwoNumbers(10,20));

    }

    public static int sumTwoNumbers(int num1, int num2){
        return num1 + num2;
    }

}
