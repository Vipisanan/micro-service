package com.vp.order_service.service;

import com.vp.order_service.dto.OrderDto;
import com.vp.order_service.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public List<OrderDto> getOrderByUserId(int userId) {

        return OrderDto.from(orderRepository.getAllOrders(userId));
    }


}
