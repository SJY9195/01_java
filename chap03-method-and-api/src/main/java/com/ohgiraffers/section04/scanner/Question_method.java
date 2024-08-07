package main.java.com.ohgiraffers.section04.scanner;

import java.util.Random;



public class Question_method {

    /*
     * -100 ~ 100 사이의 난수를 발생 시켜서 인자로 전달하면
     * 매개변수가 양수면서 짝수면 X는 양수이면서 짝수입니다. 양수면서 홀수면 X는 양수면서 홀수입니다.
     *          음수면서 짝수면 X는 음수면서 짝수입니다. 음수면서 홀수면 X는 음수면서 홀수입니다.
     * 를 반환하는 메소드를 다른 클래스에 생성해 메인메소드에서 호출한 후 화면에 출력해보자
     * (static / non-static 한번씩)  cf) if문 대신 삼항으로 풀어야 한다.
     * */

    public String method1() {

        Random random = new Random();

        int randomnumber = random.nextInt(201) - 100;
        System.out.println("X는" + randomnumber + "입니다.");
        String result1 = (randomnumber > 0 && randomnumber % 2 == 0) ? (randomnumber + "는 양수이면서 짝수입니다.") : (randomnumber > 0 && randomnumber % 2 == 0)? (randomnumber + "는 양수면서 홀수입니다.") : (randomnumber < 0 && randomnumber % 2 == 0) ? (randomnumber + "는 음수면서 짝수입니다.") : (randomnumber + "는 음수면서 홀수입니다.");

        return result1 ;
    }

    public static String method2() {

        Random random2 = new Random();

        int randomnumber2 = random2.nextInt(201) - 100;
        System.out.println("X는" + randomnumber2 + "입니다.");
        /* 나의 답
         * String result1 = (randomnumber > 0 && randomnumber % 2 == 0) ? (randomnumber + "는 양수이면서 짝수입니다.") : (randomnumber > 0 && randomnumber % 2 == 0)? (randomnumber + "는 양수면서 홀수입니다.");
         * String result2 = (randomnumber2 < 0 && randomnumber2 % 2 == 0) ? (randomnumber2 + "는 음수면서 짝수입니다.") : (randomnumber2 < 0 && randomnumber2 % 2 != 0)? (randomnumber2 + "는 음수면서 홀수입니다.") : "";
         * 이렇게 썼지만 삼항문은 나머지 경우의 수를 다 생각해서 남지 않게 만들어 줘야 한다!*/
        String result2 = (randomnumber2 > 0 && randomnumber2 % 2 == 0) ? (randomnumber2 + "는 양수이면서 짝수입니다.") : (randomnumber2 > 0 && randomnumber2 % 2 == 0)? (randomnumber2 + "는 양수면서 홀수입니다.") : (randomnumber2 < 0 && randomnumber2 % 2 == 0) ? (randomnumber2 + "는 음수면서 짝수입니다.") : (randomnumber2 + "는 음수면서 홀수입니다.");

        return result2;
    }

    }
