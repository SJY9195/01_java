package main.java.com.ohgiraffers.section01.array;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. //(잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다." 출력
         * */

        // 변수의 두 값 변경하기
        /* int num1 = 10;
        int num2 = 20;

        int temp;

        temp = num1;
        num1 = num2;
        num2 = temp; */

        // 배열의 길이를 스캐너를 통해 입력 받게 한다. 배열의 요소를 어떻게 스캐너를 통해 입력할까? 반복문을 이용해 각 인덱스칸에 요소를 넣어준다!
        // 첫 번째로 큰값 출력 = 반복문을 통해서 큰값을 받을 변수를 만들고, 그 변수에다가 인덱스를 비교해서 제일 큰값을 남기면된다.

        //cf) ctl + z 도 스택영역에서 빠져나가서 되돌려주는 개념이다. 수업시간에서 팁


        Scanner scr = new Scanner(System.in);
        System.out.println("배열의 길이를 입력해주세요 : ");
        int arraylength = scr.nextInt();

        int[] array = new int[arraylength];

        if (arraylength > 1) {

            for (int i = 0; i < arraylength; i++) {
                System.out.println("배열의 요소를 입력해주세요 : ");
                array[i] = scr.nextInt();


            }

            int maxnum = array[0];    //가장 큰 값을 찾을 변수 설정
            int maxnum2 = array[0];    //두번째로 큰 값을 찾을 변수 설정


            for (int i = 1; i < arraylength; i++) {

                if (array[i] > maxnum) {
                    maxnum = array[i];
                }     // if가 false면 for문으로 되돌아가서 조건만족 할 때까지 i++

                for (int j = i; j>=0 && j < arraylength; j--) {
                    if (array[j] < maxnum && array[j] > maxnum2) {
                        maxnum2 = array[j];
                    }
                }
            }
            System.out.println("배열의 첫 번째로 큰 값은 : " + maxnum + "입니다.");
            System.out.println("배열의 두 번째로 큰 값은 : " + maxnum2 + "입니다.");
        }else{
            System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없습니다.");
        }

        /*
         *  배열의 길이와 배열의 요소들을 스캐너를 통해 입력받아 정수형 배열을 만들고,
         *  첫 번째로 큰 값을 출력하는 프로그램을 만들어 주세요. // (잘하면 두번째로 큰 값도)
         *  만약 배열의 길이가 1 이하면 "1보다 짧은 길이의 배열은 두번쨰로 큰 수를 찾을 수 없습니다." 출력
         *

        Scanner scr = new Scanner(System.in);

        //배열의 길이 입력 받기
        System.out.println("배열의 길이를 입력 해주세요 : ");
        int length = scr.nextInt();

        // 1보다 짧을 때 처리
        if(length <= 1){
            System.out.println("1보다 짧은 길이의 배열은 두번째로 큰 수를 찾을 수 없음.");
            return;
        }
        // 배열 생성 및 요소 입력 받기
        int[] arr = new int[length];
        System.out.println("배열의 요소를 입력 해주세요 : ");
        for (int i = 0; i < length; i++) {
            arr[i] = scr.nextInt();
        }

        //최댓값과 두 번째로 큰 값을 위한 변수
        int max = arr[0];
        int secondMax = arr[0];

        // 반복문을 이용해 값 찾기
        for (int i = 1; i < length; i++) {
            if(arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else if(arr[i] > secondMax || secondMax == max){
                secondMax = arr[i];
            }
        }

        // 모두 같은 값이 입력되면
        if(max == secondMax){
            System.out.println("두번째로 큰 값을 찾을 수 없습니다.");
            return;
        }

        // 결과 출력
        System.out.println("제일 큰 값 : " + max);
        System.out.println("두 번째로 큰 값 : " + secondMax); */ //강사님의 답

    }
}
