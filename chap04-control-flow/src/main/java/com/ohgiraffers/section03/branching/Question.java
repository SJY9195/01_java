package main.java.com.ohgiraffers.section03.branching;

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {

        /*
         *
         *  자판기를 만들어보자.
         *  자판기가 파는 음료는 사이다(500), 콜라(600), 환타(700), 박카스(1000), 핫식스(1500)
         *  잘못된 음료수가 선택되면 다시 받아야 한다.
         *
         *  음료수를 선택하면 계산 여부를 물어본 후
         *  계산을 고르면 총 금액과 고른 음료수를 출력 해 주어야 한다.
         *
         *  예시 )
         *   음료를 선택 해주세요 :
         *   사이다
         *   사이다를 선택 하셨습니다.
         *   계산 하시겠습니까?
         *   네                           아니오
         *   총 상품은 사이다               음료를 더 선택 해주세요
         *   총 금액은 500원 입니다.         콜라
         *                                콜라를 선택 하셨습니다.
         *                               계산 하시겠습니까?
         *                                네
         *
         *
         *
         *
         * */
            /* 내가 이 문제를 처음 보고 풀었을 때 if문을 활용했다.


            Scanner scr = new Scanner(System.in);
            System.out.println("------- vending machine -------");
            System.out.println("사이다(500), 콜라(600), 환타(700), 박카스(1000)");
            System.out.println("-------------------------------");
            System.out.println("음료를 선택 해주세요 :");


            String selectedDrink = scr.nextLine();


            int price1 = 500;
            int price2 = 600;
            int price3 = 700;
            int price4 = 1000;

            if (selectedDrink.equals("사이다")){
                System.out.println("사이다를 선택 하셨습니다.");
                System.out.println("계산하시겠습니까?");
                String answer = scr.nextLine();

                if (answer.equals("네")){

                    System.out.println("총 상품은 사이다");
                    System.out.println("총 금액은 " + price1 + "원 입니다.");
                } else if(answer.equals("아니오")){
                    System.out.println("음료를 더 선택 해주세요");
                    String selectedDrink2 = scr.nextLine();

                    if (selectedDrink2.equals("콜라")){   ///사이다 아니오 - 콜라 case  이렇게 하게되면 사이다 아니오 - 환타 , 사이다 아니오 - 박카스 case도 따로 입력해야 줘야 하고, 순서를 다 줘야하므로 너무 복잡해지므로 딴걸 추천
                        System.out.println("콜라를 선택 하셨습니다.");
                        System.out.println("계산하시겠습니까?");
                        String answer2 = scr.nextLine();

                        if (answer2.equals("네")){
                            System.out.println("총 상품은 사이다, 콜라");
                            System.out.println("총 금액은 " + (price1 + price2) + "원 입니다.");
                        } else if(answer2.equals("아니오")){
                            System.out.println("음료를 더 선택 해주세요");
                            String selectedDrink3 = scr.nextLine();

                            if (selectedDrink3.equals("환타")){                          //사이다, 콜라, 환타 case
                                System.out.println("환타를 선택 하셨습니다.");
                                System.out.println("계산하시겠습니까?");
                                String answer3 = scr.nextLine();

                                if (answer3.equals("네")){
                                    System.out.println("총 상품은 사이다, 콜라, 환타");
                                    System.out.println("총 금액은 " + (price1 + price2 + price3) + "원 입니다.");
                                } else if(answer3.equals("아니오")){
                                    System.out.println("음료를 더 선택 해주세요");
                                    String selectedDrink4 = scr.nextLine();

                                    if (selectedDrink4.equals("박카스")){      ////사이다, 콜라 환타, 박카스 case
                                        System.out.println("환타를 선택 하셨습니다.");
                                        System.out.println("계산하시겠습니까?");
                                        String answer4 = scr.nextLine();

                                        if (answer4.equals("네")){
                                        System.out.println("총 상품은 사이다, 콜라, 환타, 박카스");
                                        System.out.println("총 금액은 " + (price1 + price2 + price3 + price4) + "원 입니다.");
                                    } else if(answer4.equals("아니오")){
                                            System.out.println("더 이상 선택할 음료가 없습니다.");
                                        }
                                    }

                                }


                            }
                    }

                }
                System.out.println("네, 아니오로만 대답해주세요");
            }
            System.out.println("메뉴만 골라주세요");

        } */

        /*  // 총 금액과 총 상품을 받을 변수 선언해놓기
         *  // 무한루프 반복문 만들기
         *  // 스캐너를 이용해 원하는 음료를 입력 받기
         *  // 스위치를 이용해 해당 음료의 가격과 상품 명을 총 금액, 상품 변수에 추가하기 +=
         *  // 계산여부 물어보기
         *  // 계산할거면 break를 이용해 무한루프를 끊어주며 총 금액, 총 상품 출력
         *  // 안할거면 음료를 더 선택 해주세요 출력 후
         *  // 반복문 다시 반복 */

        Scanner scr = new Scanner(System.in);
        String total = "";
        int totalPrice = 0;
        System.out.println("음료를 선택 해주세요 ");
        loop :for (;;){
            System.out.println("사이다 500 , 콜라 600, 환타 700, 박카스 1000, 핫식스 1500");
            String name = scr.nextLine();

            if(name.equals("사이다")){
                totalPrice += 500;
                total += "사이다 ";
            } else if (name.equals("콜라")) {
                totalPrice += 600;
                total += "콜라 ";
            }else if (name.equals("환타")) {
                totalPrice += 700;
                total += "환타 ";
            }else if (name.equals("박카스")) {
                totalPrice += 1000;
                total += "박카스 ";
            }else if (name.equals("핫식스")) {
                totalPrice += 1500;
                total += "핫식스 ";
            }else{
                System.out.println("잘못된 음료입니다.");
                continue;
            }


            System.out.println("계산 하시겠습니까?");
            String ans = scr.nextLine();
            for (;;) {


                if (ans.equals("네")) {
                    System.out.println("총 상품은 " + total);
                    System.out.println("총 금액은 " + totalPrice + "원 입니다.");
                    break loop;
                } else if(ans.equals("아니오")){
                    System.out.println("음료를 더 선택 해주세요");
                    break;
                }else {
                    System.out.println("다시 입력 해주세요");

                }
            }


        }

    }
}
