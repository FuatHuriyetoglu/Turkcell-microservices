package com.turkcell.orderservice.repositories;

import com.turkcell.orderservice.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order,Integer> {

    @Query(value = "SELECT new " +
            "com.turkcell.orderservice.entities.Order" +
            "(o.orderId,o.orderDate,o.requiredDate,o.freight,o.address) FROM Order o")
    List<Order> getForListing();

}
