package com.capg.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import java.util.*;
import com.capg.Bean.BookDTO;
import com.capg.Bean.Order;
import com.capg.FeignClient.BookClient;
import com.capg.Repository.OrderRepository;

@Service
public class OrderService {
	 @Autowired
	    private OrderRepository repository;

	    @Autowired
	    private BookClient bookClient;

	    public Order createOrder(Order order) {

	        BookDTO book = bookClient.getBookById(order.getBookId());

	        double total = book.getPrice() * order.getQuantity();

	        order.setTotalPrice(total);
	        order.setStatus("PLACED");

	        return repository.save(order);
	    }

	    public List<Order> getAllOrders() {
	        List<Order> orders = new ArrayList<Order>();
	        
	        repository.findAll().forEach(o1 -> orders.add(o1));
	        
	        return orders;
	    }

	    public Order getOrderById(Long id) {
	        return repository.findById(id).orElse(null);
	    }

	    public Order updateStatus(Long id, Order order) {
	        Order existing = repository.findById(id).orElse(null);

	        if(existing != null) {
	            existing.setStatus(order.getStatus());
	            return repository.save(existing);
	        }
	        return null;
	    }

	    public void deleteOrder(Long id) {
	        repository.deleteById(id);
	    }
}
