package section05.typecasting;

public class Question {
    public static void main(String[] args) {

        /*
        * 5명의 반 학생이 있으며 키는 각각
        * 178.5 / 170.3 / 190.7 / 188.67 / 160.8 이다.
        * 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다.
        * 소수자리는 절삭한다.
        *
        * */

        float num1 = 178.5f;
        float num2 = 170.3f;
        float num3 = 190.7f;
        float num4 = 188.67f;
        float num5 = 160.8f;

        System.out.println((int)((num1 + num2 + num3 + num4 + num5)/5));

        System.out.println("----------------------");

        long lnum = 10L;
        int num = 190;

        int sum = (int)lnum + num;      // 둘의 차이 위는 lnum을 int형으로 변환, 아래는 num + lnum이 long형으로 변환된 걸 int형으로 변환시킨것이다.
        int sum2 = (int)(num + lnum);

        System.out.println(sum + sum2);

        System.out.println("----------------------");

        /*
        * 사업을 시작한 홍길동은 이번 달 매출에서 부가세(10%)를 제외한 소득을 알고싶다.
        *
        * 매출은 다음과 같다.
        * 150400원
        * 1400원
        * 25000원
        * 30000원
        * 총합 = 매출
        *
        * 다음과 같이 출력 해주세요
        * 홍길동의 총 매출은 --원 입니다.
        * 부가세 제외 소득은 --원 이고 부가세는 --원 입니다.
        * */

        int a = 150400;
        int b = 1400;
        int c = 25000;
        int d = 30000;
        int tax = (int)((a + b + c + d) * 0.1);

        System.out.println("홍길동의 총 매출은 " + (a + b + c + d) + "원 입니다.");
        System.out.println("부가세 제외 소득은 " + (a + b + c + d - tax) + "원 이고 부가세는 " + tax + "원 입니다.");

        


    }
}
