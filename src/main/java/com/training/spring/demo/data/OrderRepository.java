package com.training.spring.demo.data;

import com.training.spring.demo.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {

// Only some DSL examples ....
//    List<Order> findByDeliveryZip(String deliveryZip);
//    List<Order> readOrdersByDeliveryZipAndPlacedAtBetween(String deliveryZip, Date startDate, Date endDate);
//    List<Order> findByDeliveryToAndDeliveryCityAllIgnoresCase(String deliveryTo, String deliveryCity);
//    List<Order> findByDeliveryCityOrderByDeliveryTo(String city);
//
//    @Query("Order o where o.deliveryCity='Seattle'")
//    List<Order> readOrdersDelieveredInSeattle();

/*
  Order save(Order order);
*/
}
