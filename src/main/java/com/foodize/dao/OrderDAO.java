package com.foodize.dao;

import java.util.List;

import com.foodize.model.Order;

public interface OrderDAO {
	
	void addOrder(Order order);
	Order getOrder(int orderId);
	void updateOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> getAllOrders();
	
}
