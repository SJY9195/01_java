package main.java.com.ohgiraffers.section06.parameter;

public class RectAngle {


    private double width;

    private double height;

    public RectAngle(){

    }

    public RectAngle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void calcArea(){
        double area = width * height;
        System.out.println("사각형의 넓이는 : " + area);
    }

    public void calcRound(){
        double round = (width+height) * 2;
        System.out.println("사각형의 둘레는 : " + round);
    }

    @Override
    public String toString() {
        return "RectAngle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
