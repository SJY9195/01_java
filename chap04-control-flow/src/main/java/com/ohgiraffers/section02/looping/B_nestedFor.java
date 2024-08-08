package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {

    public void printGugudanFromTwoToNine(){

        // for문 안에서 for문을 이용할 수 있다.

        // 2~9단까지 쭉 출력
        for (int dan = 2; dan < 10; dan++) {

            for (int su = 1; su < 10; su++) {
                System.out.println(dan + " * " + su + " = " + (dan*su));
            }

            System.out.println();

        }




    }

      public void printUpgradeGugudan(){

        // 단을 2부터 9까지 증가시킨다.
          for (int dan = 2; dan < 10; dan++) {  //for 문에는 변수선언과 초기화는 왼쪽과 같이 한번만 해주면 된다. int dan, dan, dan

              printGugudan(dan);

              System.out.println();


          }

      }

      public void printGugudan(int dan){

        for (int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan*su));
        }




    }

    public void printStars(){

        /*
         * 키보드로 정수를 입력 받아 해당 정수 만큼 한 행에 "*"을 행의 번호개씩 출력 해주세요
         *
         * 예시 ) 정수를 입력하세요 : 5
         *
         * *
         * **
         * ***
         * ****
         * *****
         *
         * */

        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 주의) println을 쓰면 안된다. println을 쓰게 되면 줄을 넘기므로 print를 써서 줄을 넘기지 않게 해야 한다.
            }

            System.out.println();

        }


    }

    public void printStars2(){
        //별 역순

        Scanner scr = new Scanner(System.in);
        System.out.println("줄 수를 입력 해주세요 : ");
        int row = scr.nextInt();

       for (int i = row; i >= 1; i--) {    //// ex) 5를 입력하면 i = 5 이고 5가 1보다 크거나 같으면 true 이므로 안의 for 문에 들어감
                                            /// 안의 for문에 들어가면 j 가 1 부터 5까지 1씩 증가하여 *이 증가하고, 5까지 되면 false 이므로 다시 위의 for문으로 들어가서 위의 for문이 false가 될 때 까지 roop발동
           for (int j = 1; j <= i; j++) {
               System.out.print("*");
           }

           System.out.println();

       }

    }

}
