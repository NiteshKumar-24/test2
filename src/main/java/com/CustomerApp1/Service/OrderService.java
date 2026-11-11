package com.CustomerApp1.Service;

import com.CustomerApp1.Constant.AppConstant;
import com.CustomerApp1.Entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private KafkaTemplate<String , Order>kafkaTemplate;

    public String addMsg(Order order){
        kafkaTemplate.send(AppConstant.TOPIC,order.getId(),order);
        return "Msg Published To Kafka Topic";
    }
}
