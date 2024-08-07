package main.java.com.ohgiraffers.section04.scanner;

public class Question {

    /*
    * -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
    * 매개변수가 양수면서 짝수면 X는 양수이면서 짝수입니다. 양수면서 홀수면 X는 양수면서 홀수입니다.
    *          음수면서 짝수면 X는 음수면서 짝수입니다. 음수면서 홀수면 X는 음수면서 홀수입니다.
    * 를 반환하는 메소드를 다른 클래스에 생성해 메인메소드에서 호출한 후 화면에 출력해보자
    * (static / non-static 한번씩)  cf) if문 대신 삼항으로 풀어야 한다.
    * */


    public static void main(String[] args) {

       Question_method method11 = new Question_method();
        String mthd = method11.method1();

        System.out.println(mthd);

        System.out.println(Question_method.method2());


    }

}
