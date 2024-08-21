package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;

public class Customer {

    private String Customername;

    private String CustomerID;

    private ArrayList<Order> orders;    //    주문 리스트이므로 리스트 명령어!!

    public Customer(String customername, String customerID) {
        this.Customername = customername;
        this.CustomerID = customerID;
        orders = new ArrayList<>();
    }

    public String getCustomername() {
        return Customername;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Customername='" + Customername + '\'' +
                ", CustomerID='" + CustomerID + '\'' +
                ", orders=" + orders +
                '}';
    }

    //주문 추가하는 메소드

        public void addOrder(Order order){
            orders.add(order);
        }

    //주문 내역을 조회하는 메소드

        public void showorderlist(){

        for(Order order : orders){
            System.out.println(order);
        }

    }

}
