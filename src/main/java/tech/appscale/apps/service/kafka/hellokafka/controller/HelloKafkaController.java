package tech.appscale.apps.service.kafka.hellokafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.appscale.apps.service.kafka.hellokafka.svc.Producer;
import tech.appscale.apps.service.kafka.hellokafka.view.ServiceProvider;

@RestController
@CrossOrigin
@RequestMapping(value = "/rest/hellokafka")
public class HelloKafkaController {

	private final Producer producer;

	@Autowired
	public HelloKafkaController(Producer producer) {
		this.producer = producer;
	}

	@PostMapping(value = "/publish_provider")
	public void sendMessageToKafkaTopic(@RequestBody final ServiceProvider provider) {
		this.producer.sendMessage(provider);
	}

}
