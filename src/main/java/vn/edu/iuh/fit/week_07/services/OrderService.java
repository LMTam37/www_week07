package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();
    Order getOrderById(Long orderId);
    Order createOrder(Order order);
    Order updateOrder(Long orderId, Order order);
    void deleteOrder(Long orderId);
}