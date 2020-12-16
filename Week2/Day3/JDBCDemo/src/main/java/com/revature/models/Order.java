package com.revature.models;

public class Order {
	
	private int orderId;
	private double orderPrice;
	
	
	public int getOrderId() {
		return orderId;
	}
	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Order(int orderId, double orderPrice) {
		super();
		this.orderId = orderId;
		this.orderPrice = orderPrice;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderPrice=" + orderPrice + "]";
	}
	
	

}
