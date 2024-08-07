package main.java.com.ohgiraffers.section06.temary;

public class Question {
    public static void main(String[] args) {
//1번문제
        int student1 = 90;
        int student2 = 95;
        int student3 = 81;
        int average = (student1 + student2 + student3) / 3;

        String result = (average >= 90 && average <= 100) ? "합격" : "불합격";
        System.out.println(result);
        System.out.println((average >= 90 && average <= 100) ? "합격" : "불합격";);
//2번문제
        int people_height = 111;

        String result2 = (people_height >= 120) ? "탑승 가능" : "탑승 불가능";
        System.out.println(result2);

    }
}
