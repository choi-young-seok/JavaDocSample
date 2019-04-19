package kr.co.noel.javadoc.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerTest {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	
	@KafkaListener(topics = {"test-topic"})
	public void kafkaConsumerTest(ConsumerRecord<String, String> consumerRecord) {
		
	}
}
