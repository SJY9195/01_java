package main.java.com.ohgiraffers.section08.variable;

public class KindsOfVariable {

    // 전역변수 - 필드

    private int globalNum;

    // 클래스변수(정적필드)   // 프로그램 사용시에 메모리에 넣어둔걸 바로 사용할 수 있다.

    private static int staticNum;

    public void testMethod(int num){ // 매개변수도 일종의 지역변수다.

        // 메소드 영역 안에서 작성한 변수 = 지역변수
        int localNum;

        // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
        System.out.println(num);

        System.out.println(globalNum);
        System.out.println(staticNum);
    }

    public void testMethod2(){
        System.out.println(globalNum);
        System.out.println(staticNum);
        // System.out.println(num); //지역 변수는 다른 메소드에선 사용 못한다.

    }

}
