package main.java.com.ohgiraffers.section02;

public abstract class Product {    //추상화 클래스

    private int nonStaticField;

    private static int staticField;

    public Product() {
    }

    public void nonStaticMethod() {
        System.out.println("Product 클래스의 nonStaticMethod 를 호출함");
    }

    public static void staticMethod() {
        System.out.println("Product 클래스의 staticMethod 를 호출함");
    }

    public abstract void abstractMethod();

}
