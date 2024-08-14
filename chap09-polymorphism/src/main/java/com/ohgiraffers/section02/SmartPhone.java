package main.java.com.ohgiraffers.section02;

public class SmartPhone extends Product {   // abstractmethod를 오버라이드 해주면 빨간줄이 없어진다!


    public SmartPhone() {
    }

    @Override
    public void abstractMethod() {
        System.out.println("Product 클래스의 추상메소드를 호출함");
    }

    public void printSmartPhone(){
        System.out.println("smartPhone 의 print 메소드를 호출함");
    }

}
