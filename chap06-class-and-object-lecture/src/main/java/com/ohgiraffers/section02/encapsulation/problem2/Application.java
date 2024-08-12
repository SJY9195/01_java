package main.java.com.ohgiraffers.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근하는 경우 생기는 문제점 (2)   -  한쪽을 수정 했을 때 다른 쪽도 수정해 줘야 한다. 즉,  결합도가 높다.- 유지보수가 불편하다 - 비싸진다 - 안좋다.
        // 하지만 객체를 만들어 수정하기 쉽게 만들어 줬다.
        /*
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미라"
        monster3.hp = 400;

        System.out.println("monster1 = " + monster1.name);
        System.out.println("monster2 = " + monster2.name);
        System.out.println("monster3 = " + monster3.name);
        */
    }
}
