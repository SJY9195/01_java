package main.java.com.ohgiraffers.section03.abstraction;

public class CarRacer {
    
    private final Car car = new Car();   //final을 쓴 이유가 한 번 설정한 다음에 바뀌지 않게 하기위해서 씀 (상수)
    
    public void startUp(){
        car.startUp();
    }
    
    /*
    * this.car go 메소드를 호출하여 앞으로 가는 메소드
    * */
    
    public void stepAccelator(){
        car.go();
    }
    
    /*
    * this.car 를 멈추는 메소드
    * */
    
    public void stepBreak(){
        car.stop();
    }
    
    /*
    * this.car의 시동을 끄는 메소드
    * */
    
    public void turnOff(){
        car.turnOff();
    }
    
}
