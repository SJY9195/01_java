package main.java.com.ohgiraffers.understand.chap02;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        MovieTheater theater = new MovieTheater();

        //영화 추가

        System.out.println("추가할 영화의 수를 입력해주세요 : ");
        int moviecount = scr.nextInt();

        for (int i = 0; i < moviecount; i++) {     //원하는 moviecount(정수) 만큼 반복해서 추가할것이다.
            System.out.print("영화제목을 입력해주세요 : ");
            String title = scr.next();

            System.out.print("영화 상영시간을 입력해주세요 : ");
            String runningtime = scr.next();

            System.out.print("영화의 좌석 수를 입력해주세요 : ");
            int numberoftotalseats = scr.nextInt();

            theater.addMovie(new Movie(title, runningtime, numberoftotalseats));   //thearter의 arraylist에 새로운 Movie 객체를 생성해서 넣는뜻!
        }

       /* System.out.println(theater.toString());  // 이렇게 할 필요없이 메소드를 하나 더 만들면 된다. */

        theater.movielist();


        //영화 예매 프로그램 (사용자와 상호작용)

        while (true) {
            System.out.println("====영화 예매 프로그램====");
            System.out.println("1. 좌석 예매");
            System.out.println("2. 현재 상영중인 영화 목록");
            System.out.println("3. 종료");
            System.out.println("원하는 번호를 선택해주세요 : ");
            int choice = scr.nextInt();

            switch (choice) {
                case 1 :
                    System.out.println("예매할 영화 번호를 선택해주세요 : ");
                    int movieindex = scr.nextInt() - 1 ;
                    theater.reserveSeat(movieindex); break;

                case 2 : theater.showmovielist(); break;

                case 3 :
                    System.out.println("프로그램을 종료 합니다.");
                    return;

                default :
                    System.out.println("잘못 입력하셨습니다. 다시 선택해주세요!");
                    break;
            }

        }


    }
}
