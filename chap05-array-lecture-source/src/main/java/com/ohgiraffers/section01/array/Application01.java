package main.java.com.ohgiraffers.section01.array;

public class Application01 {
    public static void main(String[] args) {

     /*
     * 배열이란?
     * 동일한 자료형의 묶음(연속된 메모리 공간에 값을 저장하고 사용하기 위한 용도) 이다.
     * 배열은 heap 영역에 new 연산자를 이용하여 할당한다.
     *
     *
     * 배열을 사용하는 이유?
     * 만약 배열을 사용하지 않는다면 변수를 여러 개 사용해야 한다.
     * 1. 연속된 메모리 공간으로 관리할 수 없다.   //모든 변수의 이름을 사용자가 관리해야 한다는 뜻   ,또한 어레이의 번호로 관리가 가능하다.
     * 2. 반복문을 이용한 연속 처리가 불가능하다.
     *
     *
     * */

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;

        int sum = 0;

        sum += num1;
        sum += num2;
        sum += num3;
        sum += num4;
        sum += num5;
        System.out.println(sum);

        int[] array = new int[5];
        // 하나의 이름으로 관리되는 연속된 메모리 공간. 인덱스를 이용해 접근
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        // array[5] = 50; 어레이 5칸 짜리를 만들었는데 5칸을 넘어가므로 에러가 난다.

        int sum2 = 0;
        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
        }
        System.out.println(sum2);
    }
}
