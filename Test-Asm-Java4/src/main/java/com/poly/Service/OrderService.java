package com.poly.Service;

import java.math.BigInteger;
import java.util.List;

import com.poly.Entity.Order;

public interface OrderService {
    Order findByID(BigInteger id);
    List<Order> findAll();
    List<Order> findAll(int pageNumber, int pageSize);
    Order create(String string,int id);
    Order update(Order entity);
    Order delete(BigInteger id);

}
