package main.java.com.ohgiraffers.understand.chap03;

public class OrderItem {

        private Product Orderedproduct;
        private int OrderedQuantity;

    public OrderItem(Product orderedproduct, int orderedQuantity) {
        Orderedproduct = orderedproduct;
        OrderedQuantity = orderedQuantity;
    }

    public Product getOrderedproduct() {
        return Orderedproduct;
    }

    public void setOrderedproduct(Product orderedproduct) {
        Orderedproduct = orderedproduct;
    }

    public int getOrderedQuantity() {
        return OrderedQuantity;
    }

    public void setOrderedQuantity(int orderedQuantity) {
        OrderedQuantity = orderedQuantity;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "Orderedproduct=" + Orderedproduct +
                ", OrderedQuantity=" + OrderedQuantity +
                '}';
    }

    public int getTotalPrice(){
       return Orderedproduct.getPrice() * OrderedQuantity;
    }   // 여기서 int는 메소드에서 반환타입!!  void는 아무값도 반환하지 않는다는것!!!
}
