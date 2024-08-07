package main.java.com.ohgiraffers.section01.method;

public class Application01 {
    public static void main(String[] args) { //메소드  static 호출 전에 ram에 이미 할당 되어 있다는 뜻


        /*
        * 메소드란?
        * 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        *
        * */

        System.out.println("main() 메소드 시작됨...");

        Application01 app1 = new Application01();
         app1.methodA();  //static 메소드에서 static이 없는 메소드를 호출 할 때 이렇게 작성을 해줘야 한다는 규칙.
        //methodA 호출
        int a = app1.plus( 1, 2 );
        System.out.println(a);
        System.out.println("main() 메소드 종료됨...");
    }

    public void methodA(){    //public 접근제어자 (어느곳에서나 호출 할수 있게 해준다.)(class시간에 자세히 다룸)  void (호출해서 반환되는 자료형의 자리) void는 return이 생략되어 있다.( 아무것도 호출해서 반환하지 않겠다는 뜻)
        System.out.println("methodA() 호출됨.");

        methodB(); //소괄호까지 닫아야 메소드 호출이다.

        System.out.println("methodA() 종료됨.");
    }

    public void methodB(){
        System.out.println("methodB() 호출됨.");
        System.out.println("methodB() 종료됨.");
    }


    public int plus(int a, int b){
        return a + b;
    }

}