package com.example.micro2demo;

public class Order {

    public Order(int id, String name) {
        this.orderId = id;
        this.orderName = name;
    }
    private int orderId;
    private String orderName;

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public String getOrderName() {
        return orderName;
    }
    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    
}
