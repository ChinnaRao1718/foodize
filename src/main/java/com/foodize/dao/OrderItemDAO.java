package com.foodize.dao;

import java.util.List;

import com.foodize.model.OrderItem;

public interface OrderItemDAO {
	
	void addOrderItem(OrderItem orderItem);
	OrderItem getOrder(int orderItemId);
	void updateOrder(OrderItem orderItem);
	void deleteOrder(int orderItemId);
	List<OrderItem> getAllOrderItems();
}
