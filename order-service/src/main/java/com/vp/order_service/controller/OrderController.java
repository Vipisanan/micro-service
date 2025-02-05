package com.vp.order_service.controller;

import com.vp.order_service.dto.OrderDto;
import com.vp.order_service.service.OrderService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")
@AllArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping({"/{userId}"})  // This is the correct endpoint
    public ResponseEntity<List<OrderDto>> getOrdersByUserId(@PathVariable int userId) {
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(orderService.getOrderByUserId(userId));
    }

}
