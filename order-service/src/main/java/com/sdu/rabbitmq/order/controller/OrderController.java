package com.sdu.rabbitmq.order.controller;

import com.sdu.rabbitmq.order.entity.vo.CreateOrderVO;
import com.sdu.rabbitmq.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

@Slf4j
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void createOrder(@RequestBody CreateOrderVO orderCreateDTO) throws IOException, TimeoutException {
        log.info("createOrder:orderCreateDTO:{}", orderCreateDTO);
        orderService.createOrder(orderCreateDTO);
    }
}
