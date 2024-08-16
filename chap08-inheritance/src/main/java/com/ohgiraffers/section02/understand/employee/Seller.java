package main.java.com.ohgiraffers.section02.understand.employee;

import main.java.com.ohgiraffers.section02.understand.car.Car;
import main.java.com.ohgiraffers.section02.understand.car.ElectricCar;

public class Seller {

    private String name;

    private double result; // 판매 수당

    public Seller(String name) {
        this.name = name;
    }

    public void sale(Car[] cars){
        for (Car car : cars){

            if(car instanceof ElectricCar) {             //부모든 자식이든 같은 메소드로 실행 시킬 수 있다. 하나의 메소드로 다양한 클래스를 실행 시킬 수 있는데, 어떤 클래스 인지는 실행 될때 결정되는데, 이걸 동적바인딩!! 알아두자!!
                System.out.println(car.getBrand() + "사의" + car.getName() + "를 판매 하였습니다.");
                result += car.getPrice();
            }else{
                System.out.println(car.getBrand() + "사의" + car.getName() + "를 판매 하였습니다.");
                result += car.getPrice();
            }

            }

        }
    @Override
    public String toString() {
        return "Seller{" +
                "name='" + name + '\'' +
                ", result=" + result +
                '}';

    }

}


