package main.java.com.ohgiraffers.section02.understand.car;

public class OldCar extends Car {

    private String oilType;

    public OldCar(String brand, int price, String name, String oilType) {
        super(brand, price, name);
        this.oilType = oilType;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
