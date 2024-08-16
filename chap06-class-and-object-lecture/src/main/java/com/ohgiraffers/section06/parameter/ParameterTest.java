package main.java.com.ohgiraffers.section06.parameter;

public class ParameterTest {

    public void testPrimaryTypeParameter(int num){    // int num은 매개변수
        System.out.println("매개변수로 전달 받은 값 : " + num);  //여기서 Application안에 있는 전달인자를 통해 num으로 넘겨 받는다.
    }

    public void testPrimaryTypeParameter(int[] iarr){  //오버로딩
        System.out.println("매개변수로 전달 받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i] + " ");
        }
        System.out.println();
                iarr[0] = 99;
                for (int i = 0; i < iarr.length; i++){
                    System.out.println(iarr[i] + " ");
                }
        System.out.println();
    }

    public void testClassTypeParameter(RectAngle rectAngle){
        /*
        * 인스턴스도 주소가 전달된다.
        * 즉, 인자로 전달하는 인스턴스와 매개변수로 전달 받은 인스턴스는
        * 서로 동일한 인스턴스를 가리킨다. (얕은복사)
        * */
        System.out.println("매개변수로 전달받은 값 : " + rectAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 =====");
        rectAngle.calcArea();
        rectAngle.calcRound();
        System.out.println("변경 후 사각형의 넓이와 둘레 =====");
        rectAngle.setWidth(100);
        rectAngle.setHeight(100);
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariableLengthArrayParameter(String name, String... hobby){  //...가 가변배열이다.
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.println("취미 : ");
        for (String hobbys : hobby){  // for each문 hobby 배열의 인덱스가 끝날때 까지 반복시켜준다.
            System.out.print(hobbys + " ");
        }
        System.out.println();
    }


}
