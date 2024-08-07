package section01.literal;

public class Application02 {
    public static void main(String[] args) {   // main 메소드

        // 정수 리터럴 연산 형식의 값을 연산 한다.


        /*
        * 123 + 123
        * 123 - 456
        * 123 * 456
        *  40 / 10
        *  10 % 2
        *
        * */
        System.out.println(123 + 123);
        System.out.println(123 - 456);
        System.out.println(123 * 456);
        System.out.println(40 / 10);
        System.out.println(10 % 2);

        System.out.println("------------------------");
        // 실수와 정수 연산

        System.out.println(1+0.5);
        System.out.println(1-0.5);
        System.out.println(1*0.5);
        System.out.println(1/0.5);
        System.out.println(1%0.5);

        System.out.println("------------------------");
        // 문자와 문자의 연산
        // 컴퓨터는 문자를 인식하지 못하기 때문에 대응되는 숫자들이 있다 (문자로 입력할시)
        // (아스키코드(영어), 유니코드(전세계언어))
        System.out.println('a' + 'b');   // 각각의 문자들은 0,1으로 컴퓨터가 읽을 수 있게 아스키코드에 대응 되어있음.
        System.out.println('ㄱ' + 'ㄴ');

        // 문자열은 + 연산만 가능하다.
        // 데이터 값이 다를 때는 자동 형변환을 통해 최상위 타입으로 변경된다.
        // (문자열이 최상위 타입)

        System.out.println("------ 문자 열과 다른 형태의 값 연산 -------");

        System.out.println("hello" + 1004);
        System.out.println("hello" + true);

        System.out.println("hello " + ( 123 + 456) + " world");


        System.out.println("------------------------");

        // 논리값 연산

        // System.out.println(true + 1); 불가능
        // System.out.println(true + false); 불가능
        System.out.println(true + "false");

//  컨트롤 슬래쉬 (한줄주석)      /**/ 컨트롤 쉬프트 슬래쉬 (여러줄 주석)
        // 변수(값을 미리 담아두는 공간) - 값을 쉽게 쓰기 위하여 씀.
    }
}
