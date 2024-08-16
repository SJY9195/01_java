package main.java.com.ohgiraffers.section04.wrapper;

public class Application02 {
    public static void main(String[] args) {

        // parsing : 문자열 값을 기본자료형으로 변경하는 것

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("4");      // 웹 개발할때 정말 많이 쓴다.
        long l = Long.parseLong("8");    //cf) long 에 인자의 끝에 L을 붙이면 안된다. ex)"8L"로 명령하면 오류뜬다!
        float f = Float.parseFloat("4.0");
        double d = Double.parseDouble("8.0");
        boolean bl = Boolean.parseBoolean("true");  //cf) char는 문자열로 받아서 배열로 끊어주면 되므로 안한다.


    }
}
