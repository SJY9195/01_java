package main.java.com.ohgiraffers.section01.exception;

public class Application02 {
    public static void main(String[] args) {         // throws exception 있는거 없는거랑 차이 : 있을 때는 오류나면 그때 바로 종료 (던져버려서)
                                                                                           //  없을 때는 오류나도 끝까지 실행시키고 종료
        // try-catch 를 이용한 예외처리

        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(10000, 50000);
            et.checkEnoughMoney(10000,5000);
            System.out.println("== 상품 구입 가능 ==");
        }catch (Exception e){
            System.out.println("money 가 price 보다 작습니다.");       //try로 받고, catch로 오류를 받는 다는 느낌!!
            e.printStackTrace();   //무슨 오류인지 알아내는것
        }

        System.out.println("프로그램 종료");

    }
}
