package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends Car{   //extends Car "Car라는 부모(클래스)한테 상속받는 다는 뜻"

    public FireCar() {
        super();     //super(); 는 상속받으면 자동으로 추가해준다!! 보여주기 위해 작성한것
    }

    @Override
    public void soundHorn() {
        if(isRunning()){
            System.out.println("빠아아아아아아앙");
        }else{
            System.out.println("소방차가 멈춰있습니다.");
        }
    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다.");

    }
}
