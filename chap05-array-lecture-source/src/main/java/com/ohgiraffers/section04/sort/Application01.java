package main.java.com.ohgiraffers.section04.sort;

public class Application01 {
    public static void main(String[] args) {

        // 변수와 배열의 값을 바꾸는 방법

        // 변수의 두 값 변경하기     //이걸 이해해야 한다.  실린더 3개를 두고 1개 1개에 각각 든 액체를 나머지 빈병 1개에 옮겨서 두 실린더의 액체를 바꾸는것과 같다!!
        int num1 = 10;                                   //빈 액체를 담을 실린더를 temp에 두는것.
        int num2 = 20;

        int temp;
        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);
        System.out.println(num2);


        // 배열의 인덱스 값 서로 변경하기

        int[] arr = {2,1,3};

        int temp2;
        temp2 = arr[0];
        arr[0] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }



    }
}
