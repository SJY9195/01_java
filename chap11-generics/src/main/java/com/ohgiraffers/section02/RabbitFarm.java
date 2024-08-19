package main.java.com.ohgiraffers.section02;


public class RabbitFarm<T extends Rabbit & Animal> {

    private T animal;

//public class RabbitFarm<T extends Rabbit & Animal> {    //interface는 안된다!


    public RabbitFarm() {
    }

    public RabbitFarm(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

}


