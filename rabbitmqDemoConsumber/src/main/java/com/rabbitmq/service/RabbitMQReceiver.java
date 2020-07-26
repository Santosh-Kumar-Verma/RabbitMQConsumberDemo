package com.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;

@Component
public class RabbitMQReceiver {

	@RabbitListener(queues = "${rabbitmq.queue}")
	public void recievedMessage(Object employee) throws JsonProcessingException {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Recieved Message From RabbitMQ: " +employee );
	}
	
	@RabbitListener(queues = "${rabbitmq.queue}")
	public void recievedMessage2(Object employee) throws JsonProcessingException {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Recieved Message From RabbitMQ: " +employee );
	}
	
	@RabbitListener(queues = "${rabbitmq.queue}")
	public void recievedMessage3(Object employee) throws JsonProcessingException {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Recieved Message From RabbitMQ: " +employee );
	}
	
	@RabbitListener(queues = "${rabbitmq.queue}")
	public void recievedMessage4(Object employee) throws JsonProcessingException {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Recieved Message From RabbitMQ: " +employee );
	}

}