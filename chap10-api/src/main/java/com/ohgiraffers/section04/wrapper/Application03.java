package main.java.com.ohgiraffers.section04.wrapper;

public class Application03 {
    public static void main(String[] args) {
        // 기본자료형 값을 문자열로 변경할 수 있다.

        /*
        * valueof() : 기본자료형 값을 Wrapper 클래스로 변환시키는 메소드
        * toString() : 문자열로 반환하는 메소드
        * */

        String b = Byte.valueOf((byte)1).toString();  // 큰쪽에서 작은쪽으로 자동형변환이 안되므로 강제형변환을 시켜줘야한다! cf) 정수의 기본형은 int
        String s = Short.valueOf((short)2).toString();
        String i = Integer.valueOf(4).toString();
        String l = Long.valueOf(8L).toString();
        String f = Float.valueOf(4.0f).toString();
        String d = Double.valueOf(8.0).toString();
        String bl = Boolean.valueOf(true).toString();
        String c = Character.valueOf('a').toString();

        String str = String.valueOf(10);

        String str2 = 123 + "";


    }
}
