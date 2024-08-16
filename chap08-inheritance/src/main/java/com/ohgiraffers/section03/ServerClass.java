package main.java.com.ohgiraffers.section03;

public class ServerClass extends SuperClass {


    // 메소드 이름을 변경하면 에러가 발생한다.

   /* @Override
    public void method2(int num) {
        super.method(num);
    } */

    // 메소드의 리턴타입이 변경되면 에러가 발생한다.

    /* @Override
    public int method(int num) {
        super.method(num);
    } */


    // 시그니처가 달라도 오류가 발생한다.
    /*@Override
    public void method(int , int num2) {
        super.method(num);
    }*/

    /* @Override
    public void privateMethod(){
    } */

    // private 접근자는 접근할 수 없다.

    /* @Override
    public final void finalMethod() {} */

    // 접근제어자는 같거나 더 넓은 범위로만 가능하다.
    @Override
    public void protectedMethod() {} // public 과 protected 는 가능하다.
    // default, private 는 불가능하다.



    /*
    * 오버라이딩?
    * 부모 클래스에서 상속받은 메소드를 자식 클래스에서 재정의 하여 사용하는 것.
    *
    * 오버라이딩 성립 요건
    * 1. 메소드의 이름이 동일해야 한다.
    * 2. 메소드의 리턴 타입이 동일해야 한다.
    * 3. 매개변수의 타입, 갯수, 순서가 동일해야 한다.
    * 4. private 메소드는 접근이 불가능하기 때문에 오버라이딩이 불가능하다.
    * 5. final 키워드가 사용된 메소드는 불가능하다.
    * 6. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 한다.
    * 7. 예외 처리는 같은 예외이거나 더 구체적인 예외를 처리해야 한다. (예외는 chap 13)
    *
    *   오버로딩과 오버라이딩의 차이는 알아두는게 좋다.
    *
    * */

}
