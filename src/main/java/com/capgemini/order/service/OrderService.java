package com.capgemini.order.service;

import java.util.List;

import com.capgemini.order.entity.Order;
import com.capgemini.order.exceptions.OrderAllReadyPresentException;

public interface OrderService {
	public Order addOrder(Order order) throws OrderAllReadyPresentException;

	public void cancelOrder(Order order);

	public Order getOrderById(int orderId);

	public List<Order> getOrders();

	public List<Order> getOrdersById(int orderId);
}
