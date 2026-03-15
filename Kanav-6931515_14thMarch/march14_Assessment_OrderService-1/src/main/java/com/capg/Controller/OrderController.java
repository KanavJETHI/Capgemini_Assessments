package com.capg.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Bean.Order;
import com.capg.Service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	@Autowired
	OrderService service;
	
	@PostMapping("/create")
    public Order createOrder(@RequestBody Order order) {
        return service.createOrder(order);
    }

    @GetMapping("/getallorders")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/getorderbyid/{id}")
    public Order getOrderById(@PathVariable Long id) {
        return service.getOrderById(id);
    }

    @PutMapping("/updateorder/{id}")
    public Order updateStatus(@PathVariable Long id, @RequestBody Order order) {
        return service.updateStatus(id, order);
    }

    @DeleteMapping("/deleteorder/{id}")
    public void deleteOrder(@PathVariable Long id) {
        service.deleteOrder(id);
    }
	
}
