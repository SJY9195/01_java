package section04.overflow;

public class Application01 {
    public static void main(String[] args) {

        // 자료형 별 최대 범위를 벗어나는 경우

        /*
        * 1byte는 8개의 bit를 갖고 있음.
        * 127을 2진수로 변환하면 01111111
        * -128은 2진수로 변환하면 10000000
        *
        * */

        byte num1 = 127;
        System.out.println("num1 : " + num1);
        num1++;   //자신에게 +1 해줌    num1 = num1 + 1; 과 같다.
        System.out.println("num1 : " + num1);

        //언더 플로우
        // 오버플로우와 반대되는 개념

        byte num2 = -128;
        System.out.println("num2 : " + num2);
        num2--; //자신에게 -1 해줌 num1 = num1 -1; 과 같다.
        System.out.println("num2 : " + num2);


        int firstNum = 10000000;
        int secondNum = 700000;
        int multi = firstNum * secondNum;      //논리적에러 (실행은 되나 원하는 값이 안나올 경우)
        System.out.println(multi);

        long multi2 = (long)firstNum * secondNum;  //int type 끼리 계산이기 때문에 (long)을 넣어 long으로 변환해준다.
        // 숫자가 길어 int로 인식 안될시 long으로 변환해주면 된다.
        System.out.println(multi2);


    }
}
