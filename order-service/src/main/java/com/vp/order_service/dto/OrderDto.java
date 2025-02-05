package com.vp.order_service.dto;

import com.vp.order_service.dao.OrderDao;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {
    private int userId;
    private String orderId;
    private String productName;
    private String orderDescription;

    public static List<OrderDto> from(List<OrderDao> allOrders) {
        return allOrders.stream()
                .map(orderDao -> new OrderDto(orderDao.getUserId(), String.valueOf(orderDao.getOrderId()), orderDao.getProductName(), orderDao.getOrderDescription()))
                .toList();
    }
}
