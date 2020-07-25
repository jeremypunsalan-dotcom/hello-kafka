package tech.appscale.apps.service.kafka.hellokafka.svc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import tech.appscale.apps.service.kafka.hellokafka.view.ServiceProvider;

@Service
public class Consumer {
	private final Logger logger = LoggerFactory.getLogger(Consumer.class);

	@KafkaListener(topics = "providers", groupId = "group_id")
	public void consume(ServiceProvider provider) {
		logger.info(String.format("Consumed object --> %s", provider));
		
	}
}
