package com.vp.order_service.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDao {
    private int userId;
    private int orderId;
    private String productName;
    private int price;
    private String orderDescription;
}
