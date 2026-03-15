package com.capg.Repository;

import org.springframework.data.repository.CrudRepository;

import com.capg.Bean.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
