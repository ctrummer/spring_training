package com.training.spring.demo.data;

import com.training.spring.demo.Order;

public interface OrderRepository {

  Order save(Order order);
  
}
