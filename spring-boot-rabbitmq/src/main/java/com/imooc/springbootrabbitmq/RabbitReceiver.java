package com.imooc.springbootrabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消息队列接收
 */
@Component
public class RabbitReceiver {
	/**
	 * lisi负责监听apple-queue
	 */
	@RabbitListener(queues = "apple-queue")
	public void lisi(String msg) {
		System.out.println("李四知道:" + msg);
	}

	/**
	 * zhaowu负责监听banana-queue
	 */
	@RabbitListener(queues = "banana-queue")
	public void zhaowu(String msg) {
		System.out.println("赵五知道:" + msg);
	}
}
