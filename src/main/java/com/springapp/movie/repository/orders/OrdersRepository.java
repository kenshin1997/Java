package com.springapp.movie.repository.orders;

import com.springapp.movie.models.orders.Orders;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {
    @Query(value = "select MAX(commandOrder) from orders", nativeQuery = true)
    Long getLastCommandOrder();
}
