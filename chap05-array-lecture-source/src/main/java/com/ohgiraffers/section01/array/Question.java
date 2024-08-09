package main.java.com.ohgiraffers.section01.array;

public class Question {
    public static void main(String[] args) {

        // 트럼프 카드를 핸덤으로 한장 출력해보자

        String[] shapes = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] number = {"ACE", "2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING"};

        int shapesNumber = (int) (Math.random() * shapes.length);                 /*Math.random(): 0.0 (포함) 이상 1.0 (미포함)의 범위에서 실수 난수를 생성합니다.
                                                                                 Math.random() * shapes.length: 생성된 난수에 shapes.length를 곱하여 0.0 이상 shapes.length 미만의 실수 값을 만듭니다.
                                                                                (int): 이 실수 값을 정수로 변환합니다. 정수로 변환할 때는 소수점 이하가 버려지므로, 결과는 0부터 shapes.length - 1 사이의 정수입니다. */
        int chNumber = (int) (Math.random() * number.length);

        System.out.println(shapes[shapesNumber] + " " + number[chNumber]);


    }
}
