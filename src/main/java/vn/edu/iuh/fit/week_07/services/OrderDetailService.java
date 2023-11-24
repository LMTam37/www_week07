package vn.edu.iuh.fit.week_07.services;

import vn.edu.iuh.fit.week_07.models.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> getAllOrderDetails();

    OrderDetail getOrderDetailById(Long orderDetailId);

    OrderDetail createOrderDetail(OrderDetail orderDetail);

    OrderDetail updateOrderDetail(Long orderDetailId, OrderDetail orderDetail);

    void deleteOrderDetail(Long orderDetailId);

    List<OrderDetail> getAllOrderDetailsByOrderId(Long orderId);
}