package com.training.spring.demo.data;

import com.training.spring.demo.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository
        extends CrudRepository<Order, Long> {

}
