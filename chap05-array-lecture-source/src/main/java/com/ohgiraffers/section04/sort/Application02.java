package main.java.com.ohgiraffers.section04.sort;

public class Application02 {
    public static void main(String[] args) {

        // 순차정렬

        int[] iarr = {2,5,4,6,1,3};

        for (int i = 0; i < iarr.length; i++) {

            for (int j = 0; j < i; j++){     // i 문 안에 j문이 포함된것임을 잊으면 안된다!! i문 가기전에 j문의 조건 꼭 봐야한다!!

                if(iarr[i] < iarr[j]){
                    int temp;
                    temp = iarr[i];
                    iarr[i] = iarr[j];
                    iarr[j] = temp;

                }
            }

        }

        for (int i = 0; i < iarr.length; i++) {   //배열의 요소를 보여주기 위한식
            System.out.println(iarr[i] + " ");
        }
    }
}
