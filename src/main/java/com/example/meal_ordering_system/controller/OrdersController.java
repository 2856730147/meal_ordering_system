package com.example.meal_ordering_system.controller;

import com.example.meal_ordering_system.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.dc.pr.PRError;

@Controller
@RequestMapping("orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
}
