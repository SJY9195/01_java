package main.java.com.ohgiraffers.section01.object.run;

import main.java.com.ohgiraffers.section01.object.book.Book;

public class Application01 {
    public static void main(String[] args) {

        /*
        * 모든 클래스는 Object 클래스의 후손이다.
        * 따라서 Object 클래스가 가진 메소드를
        * 자신의 것 처럼 사용할 수 있다.
        * 또한 부모 클래스가 가지는 메소드를 오버라이딩 해서
        * 사용하는 것도 가능하다.
        *
        * Objcet 클래스의 메소드 중 관례상 많이 오버라이딩 해서 사용하는 메소드 들이 있다.
        * toString(), equals(), hashCode() 이다.
        *
        * */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);

        System.out.println("book1.toString(): " + book1);   //toString은 16진수 주소값을 찍어주는 명령어이다.
        System.out.println("book2.toString(): " + book2);   //toString은 따로 입력하지 않아도 안에 들어있는 내용을 한번에 확인할 수 있게 보여주는게 장점이다.
        System.out.println("book3.toString(): " + book3);


    }
}
