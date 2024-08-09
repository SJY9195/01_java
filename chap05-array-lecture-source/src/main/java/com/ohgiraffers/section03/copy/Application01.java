package main.java.com.ohgiraffers.section03.copy;

public class Application01 {
    public static void main(String[] args) {
        /*
        * 배열의 복사는 크게 두 종류가 있다.
        * 1. 얕은 복사 (shallow copy) : stack의 주소 값만 복사     //기존 배열을 유지 (복사를 해도 기존배열에서 수정 된다.) (형태가 여러개여도 데이터는 같아서 하나 수정하면 다 수정된다.)
        * 2. 깊은 복사 (deep copy) : heap의 배열에 저장된 값을 복사  //새로운 배열을 생성   //ex) 메이플 슬라임 → 슬라임 형태는 같으나 수가 여러개이다. (하나가 죽어도 다른 것들은 살아있듯이)
        *
        *
        * */

        /*
        * 얕은 복사
        * stack 에 저장되어 있는 배열의 주소값만 복사한다는 것이다.
        * 따라서 두 개의 레퍼런스 변수는 동일한 배열의 주소값을 가지고 있다.
        * 하나의 레퍼런스 변수에 저장된 주소값을 가지고 배열의 내용을
        * 수정하게 되면 다른 레퍼런스 변수의 배열에 접근했을 때도 동일한
        * 배열을 가리키고 있기 때문에 변경된 값이 반영되어있다.
        *
        * */

        int[] originArr = {1,2,3,4,5};
        int[] copyArr = originArr;

        System.out.println(originArr.hashCode());
        System.out.println(copyArr.hashCode());

        for (int x : originArr){      // int originArr에 있는 인덱스를 반복해서 하나씩 뽑는 명령문
            System.out.print(x + " ");
        }
        for (int y : copyArr){
            System.out.print(y + " ");
        }

        copyArr[0] = 99;      //이렇게 copyArr을 바꿔도 originArr 값도 같게 출력된다!

        for (int x : originArr){
            System.out.print(x + " ");
        }
        for (int y : copyArr){
            System.out.print(y + " ");
        }

    }
}
