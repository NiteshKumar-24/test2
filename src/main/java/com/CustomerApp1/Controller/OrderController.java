package com.CustomerApp1.Controller;

import com.CustomerApp1.Entity.Order;
import com.CustomerApp1.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Api/v1/Order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    @PostMapping("/create")
    public String createOrder(@RequestBody Order order){
       String response= orderService.addMsg(order);
       return response;
    }
}


