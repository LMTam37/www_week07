package vn.edu.iuh.fit.week_07.services.impl;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.week_07.models.OrderDetail;
import vn.edu.iuh.fit.week_07.repositories.OrderDetailRepository;
import vn.edu.iuh.fit.week_07.services.OrderDetailService;

import java.util.List;

@Service
public class OrderDetailServiceImpl implements OrderDetailService {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Override
    public List<OrderDetail> getAllOrderDetails() {
        return orderDetailRepository.findAll();
    }

    @Override
    public OrderDetail getOrderDetailById(Long orderDetailId) {
        return orderDetailRepository.findById(orderDetailId)
                .orElseThrow(() -> new EntityNotFoundException("OrderDetail not found with id: " + orderDetailId));
    }

    @Override
    public OrderDetail createOrderDetail(OrderDetail orderDetail) {
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public OrderDetail updateOrderDetail(Long orderDetailId, OrderDetail orderDetail) {
        if (!orderDetailRepository.existsById(orderDetailId)) {
            throw new EntityNotFoundException("OrderDetail not found with id: " + orderDetailId);
        }
        orderDetail.setOrderDetailId(orderDetailId);
        return orderDetailRepository.save(orderDetail);
    }

    @Override
    public void deleteOrderDetail(Long orderDetailId) {
        if (!orderDetailRepository.existsById(orderDetailId)) {
            throw new EntityNotFoundException("OrderDetail not found with id: " + orderDetailId);
        }
        orderDetailRepository.deleteById(orderDetailId);
    }

    @Override
    public List<OrderDetail> getAllOrderDetailsByOrderId(Long orderId) {
        return orderDetailRepository.findAllByOrder_OrderId(orderId);
    }
}