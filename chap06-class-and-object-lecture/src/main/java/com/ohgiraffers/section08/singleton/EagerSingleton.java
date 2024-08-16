package main.java.com.ohgiraffers.section08.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();  //하나를 만들어 놓고 돌려쓰는덧  //static은 메모리에 올려두고 호출만해서 쓰기위해 쓰는것.

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eager;
    }


}
