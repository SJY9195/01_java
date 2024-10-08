package main.java.com.ohgiraffers.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        // 필드에 직접 접근시 생기는 문제점 (3)

        Monster monster1 = new Monster();
        monster1.setInfo("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setInfo("프랑켄");
        monster2.setHp(200);

        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());

        Monster monster3 = new Monster();     //여전히 필드에 직접접근이 가능하다.
        monster3.kind = "두치";
        monster3.setHp(-500);

        System.out.println("monster3.kind = " + monster3.kind);
        System.out.println("monster3.hp = " + monster3.hp);

    }
}
