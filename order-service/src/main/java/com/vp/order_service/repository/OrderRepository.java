package com.vp.order_service.repository;

import com.vp.order_service.dao.OrderDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrderRepository {

    public List<OrderDao> getAllOrders(int userId) {
        OrderDao orderDao = new OrderDao();
        orderDao.setUserId(userId);
        orderDao.setOrderId(1);
        orderDao.setProductName("Laptop");
        orderDao.setPrice(1000);

        OrderDao orderDao2 = new OrderDao();
        orderDao2.setUserId(userId);
        orderDao.setOrderId(2);
        orderDao2.setProductName("Mobile");
        orderDao2.setPrice(500);

        return List.of(orderDao, orderDao2);
    }
}
