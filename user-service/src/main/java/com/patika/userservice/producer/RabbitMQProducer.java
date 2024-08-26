package com.patika.userservice.producer;

import com.patika.userservice.config.RabbitMQProducerConfig;
import com.patika.userservice.producer.dto.NotificationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQProducer {

    private final AmqpTemplate rabbitTemplate;

    private final RabbitMQProducerConfig rabbitMQProducerConfig;

    public void sendNotification(NotificationRequest notificationRequest) {
        rabbitTemplate.convertAndSend(rabbitMQProducerConfig.getExchange(), rabbitMQProducerConfig.getRoutingkey(), notificationRequest);

        log.info("notification kuyruğa gönderildi. kuyruk:{}, message: {}", rabbitMQProducerConfig.getQueueName(), notificationRequest);

    }

}
