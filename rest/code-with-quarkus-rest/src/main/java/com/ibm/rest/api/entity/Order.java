package com.ibm.rest.api.entity;

public class Order {
    private Integer orderId;
    private String orderStauts;
    private Double orderValue;

    public Order() {
    }

    public Order(Integer orderId, String orderStauts, Double orderValue) {
        this.orderId = orderId;
        this.orderStauts = orderStauts;
        this.orderValue = orderValue;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderStauts() {
        return orderStauts;
    }

    public void setOrderStauts(String orderStauts) {
        this.orderStauts = orderStauts;
    }

    public Double getOrderValue() {
        return orderValue;
    }

    public void setOrderValue(Double orderValue) {
        this.orderValue = orderValue;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderStauts='" + orderStauts + '\'' +
                ", orderValue=" + orderValue +
                '}';
    }
}
