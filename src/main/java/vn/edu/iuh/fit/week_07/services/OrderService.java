package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.Order;

import java.sql.Date;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrders();

    Order getOrderById(Long orderId);

    Order createOrder(Order order);

    Order updateOrder(Long orderId, Order order);

    void deleteOrder(Long orderId);

    List<Order> getAllOrdersByEmployeeId(Long empId);

    List<Order> getOrdersByDateRange(Date startDate, Date endDate);
}