package com.massawe.service;

import com.massawe.models.Order;
import com.massawe.models.ShoppingCart;

import java.util.List;

public interface OrderService {
    Order save(ShoppingCart cart);

    List<Order> findAll(String username);

    List<Order> findALlOrders();

    Order acceptOrder(Long id);

    void cancelOrder(Long id);
}
