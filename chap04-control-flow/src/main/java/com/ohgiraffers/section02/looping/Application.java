package main.java.com.ohgiraffers.section02.looping;

public class Application {
    public static void main(String[] args) {
//알고리즘 참고 사이트 : 백준
        A_for a = new A_for();
        //a.testSimpleForStatement();
        //a.testForExample();
        //a.printGugudan();
        //a.testForExample2();
        //a.testForExample3();

        B_nestedFor b = new B_nestedFor();
        //b.printUpgradeGugudan();
        //b.printStars();
        //b.printStars2();

        C_while c = new C_while();
        //c.testSimpleWhileStatement();
        //c.testWhileExample1();
        //c.testWhileExample2();
        //c.testWhileExample3();

        D_doWhile d = new D_doWhile();
        //d.testSimpleDoWhileStatement();
        d.testDoWhileExample();
    }

}
