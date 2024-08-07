package section05.typecasting;

public class Application03 {
    public static void main(String[] args) {

        /*
        * 자동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 계산
        * 다른 자료형끼리의 연산은 큰 자료형으로 자동 형변환 후 연산처리 된다.
        *
        * */

        int inum = 10;
        long lnum = 10L;

        System.out.println(inum + lnum);

        long result = inum + lnum;
        int result2 = inum + (int)lnum;
        int result3 = (int)(inum + lnum);
        System.out.println(result2);

        byte bnum = 1;
        short snum = 2;

        // short result4 = bnum + snum; 다른 자료형이 형변환 될때 대표형이 int 아므로 int로 바뀌어서 short에 넣을 수 없다.

        int result4 = bnum + snum;
        System.out.println(result4);

        long lnum3 = 3L;
        // int result5 = bnum + lnum3;  long은 int보다 크기가 크므로 자동형변환이 안된다.



    }
}
