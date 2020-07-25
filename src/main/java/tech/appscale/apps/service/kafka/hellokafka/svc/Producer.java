package tech.appscale.apps.service.kafka.hellokafka.svc;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import tech.appscale.apps.service.kafka.hellokafka.view.ServiceProvider;

@Service
public class Producer {
	private static final Logger logger = LoggerFactory.getLogger(Producer.class);
	private static final String TOPIC = "providers";
	
	@Autowired
	private KafkaTemplate<String, ServiceProvider> kafkaTemplate;

	public void sendMessage(ServiceProvider provider) {
		logger.info(String.format("Producing object --> %s", provider));
		this.kafkaTemplate.send(TOPIC, provider);
	}
}
