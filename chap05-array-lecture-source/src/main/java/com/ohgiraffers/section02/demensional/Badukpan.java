package main.java.com.ohgiraffers.section02.demensional;

import java.util.Scanner;

public class Badukpan {
    public static void main(String[] args) {
    /*
    * 19 * 19 크기의 바둑판을 생성
    * 사용자로부터 입력을 받아 번갈아 바둑돌을 놓는 간단한 게임 구현
    *
    *
    * */

    // 바둑판 배열 만들기
    char[][] badukBoard = new char[19][19];

    for (int i = 0; i < 19; i++) {
        for (int j = 0; j < 19; j++){
            badukBoard[i][j] = '.';
         }
      }

    // 바둑판을 출력
    print(badukBoard);

    Scanner scr = new Scanner(System.in);

    char currentPlayer = '●';

    while(true){
        System.out.println("행을 입력 해주세요 (1~19) : ");
        int row = scr.nextInt();
        System.out.println("열을 입력 해주세요 (1~19) : ");
        int col = scr.nextInt();

        // 위치 유효성 확인
        if(row >= 1 && row <= 19 && col >= 1 && col <= 19 && badukBoard[row-1][col-1] == '.'){    //배열은 0부터 시작하므로 [row-1][col-1]로 두는것임  배열을 둘 때는 범위가 0부터 시작하는것을 잘 생각해야함!
            badukBoard[row-1][col-1] = currentPlayer;

            // 다음 플레이어에게 넘김
            if(currentPlayer == '●'){
                currentPlayer = '○';
            }else{
                currentPlayer = '●';
            }
        }else{
            System.out.println("잘못된 위치입니다.");
            continue;   // 끊고 while문으로 다시돌아가서 반복
        }
        print(badukBoard);
    }


    }

    public static void print(char[][] board) {

        for (int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }

}