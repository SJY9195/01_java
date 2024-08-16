package main.java.com.ohgiraffers.section02.uses;

import java.util.Scanner;

public class Application { // 프로그램 실행부
    public static void main(String[] args) {

        /*
        * 여러 명의 회원 정보를 한번에 등록
        * 전체 회원 조회 시 여러 명의 회우너 정보를 한번에 반환
        *
        * MemberRepository - static 필드로 회원 정보들을 저장 (최대 10명까지)
        *
        * */

        Scanner scr = new Scanner(System.in);  // 사용자의 입력을 받기 위함

        MemberService memberService = new MemberService();
        // 객체를 heap 에 생성하여 메소드를 실행할 준비.

        while(true){
            System.out.println("==== 회원 관리 프로그램 ====");
            System.out.println("1. 회원 등록");
            System.out.println("2. 회원 전체 조회");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            int no = scr.nextInt();

            switch(no){

                case 1 : memberService.signUpMembers(); /*service 에게 내릴 1번 명령*/break; // break 니까 여기로 오면 여기서 끊기면 반복문 반복
                case 2 : memberService.showAllMembers(); /*service 에게 내릴 2번 명령*/break;
                case 9 :
                    System.out.println("프로그램을 종료합니다."); return;
                default:
                    System.out.println("잘못된 번호입니다."); break;

            }

        }


    }
}
