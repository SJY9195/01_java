package main.java.com.ohgiraffers.section02.run;

import main.java.com.ohgiraffers.section02.*;

public class Application {
    public static void main(String[] args) {

        /*
        * 제네릭 클래스 작성 시 extends 키워드를 사용하면
        * 특정 타입만 사용하도록 제한을 걸 수 있다.
        * */

       // RabbitFarm<Animal> farm1 = new RabbitFarm<Animal>();
       // RabbitFarm<Mammal> = new RabbitFarm(Mammal);
       // RabbitFarm<Snake> farm3 = new RabbitFarm<Snake>();


       RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
       RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
       RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();

       farm4.setAnimal(new Rabbit());
       farm4.getAnimal().cry();           //따로 형변환을 해줄 필요가 없다! (원래는 자식이 부모의 메소드를 사용할 때 형변환을 해줘야한다)

       farm5.setAnimal(new Bunny());
       farm5.getAnimal().cry();

       farm6.setAnimal(new DrunkenBunny());
       farm6.getAnimal().cry();



    }
}
