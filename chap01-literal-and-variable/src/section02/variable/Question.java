package section02.variable;

public class Question {
    public static void main(String[] args) {

        /*
        * 김경리가 4명의 직원의 월급을 입금해줘야 하는 날이다.
        * 각각 직책은 대리/ 과장/ 차장/ 부장 이며,
        * 대리는 100만원, 과장은 120만원, 차장은 130만원, 부장은 150만원의 월급을 받는다.
        * 보너스는 각 월급 * 0.5 만큼을 줘야 한다.
        *
        *
        *  화면에 다음과 같이 출력되게 해주세요
        * ex) 김대리의 월급은 100만원 + 보너스 50 만원으로 총 150만원 입금 되었습니다.
        *
        * 4명 다 출력
        *
        * */
        int salary1 = 100;
        int salary2 = 120;
        int salary3 = 130;
        int salary4 = 150;
        double bonus = 0.5;
        int a = (int)(salary1 * bonus);    // int a = (int)(100 *0.5); 실수를 정수형으로 변환하는 방법
        int a1 = (int)(salary1+salary1*bonus);
        int b = (int)(salary2 * bonus);
        int b1 = (int)(salary2+salary2*bonus);
        int c = (int)(salary3 * bonus);
        int c1 = (int)(salary3+salary3*bonus);
        int d = (int)(salary4 * bonus);
        int d1 = (int)(salary4+salary4*bonus);

        System.out.println("김대리의 월급은 " + salary1 + "만원" + " + 보너스 " + (a)
        + " 만원으로 총 " + (a1) + "만원 입금 되었습니다.") ;
        System.out.println("박과장의 월급은 " + salary2 + "만원" + " + 보너스 " + (b)
                + " 만원으로 총 " + (b1) + "만원 입금 되었습니다.") ;
        System.out.println("이차장의 월급은 " + salary3 + "만원" + " + 보너스 " + (c)
                + " 만원으로 총 " + (c1) + "만원 입금 되었습니다.") ;
        System.out.println("윤부장의 월급은 " + salary4 + "만원" + " + 보너스 " + (d)
                + " 만원으로 총 " + (d1) + "만원 입금 되었습니다.") ;
        /* System.out.println("김대리의 월급은 " + salary1 + "만원" + " + 보너스 " + (int)(salary1*bonus)
                + " 만원으로 총 " + (int)(salary1+salary1*bonus) + "만원 입금 되었습니다.") ; 이렇게 할수도 있다. */

    }
}
