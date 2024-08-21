package main.java.com.ohgiraffers.understand.chap03;

import java.util.ArrayList;


public class Order {
    //주문된 아이템 리스트를 관리하는 메소드
    /*private ArrayList<OrderItem> items;    //객체배열 필드 추가 */
    private ArrayList<OrderItem> items;

    public Order() {   // 기본 생성자!!
        items = new ArrayList<>();
    }

    //주문 아이템 추가 메소드
    public void addOrderItem(OrderItem item) {   ///OrderItem 의 item이라는 객체를 매개변수로 쓰겠다.
        items.add(item);   //item 매개변수를 쓰고 items에 인자받은 객체를 리스트에 추가시키겠다!!
    }

    //전체 주문 금액 계산 메소드

    public int getTotalPrice(){
        int total = 0 ;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
return total;
        }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

/* public ArrayList<OrderItem> getItems() {
        return items;
    } */

    @Override
    public String toString() {
        return "Order{" +
                "items=" + items +
                '}';
    }
}



