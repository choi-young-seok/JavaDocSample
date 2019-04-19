package kr.co.noel.javadoc.kafka;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class KafkaProducerTest {

	@Scheduled(fixedRate = 10000)
	public void kafkaProducerTest() {
		log.info("Send Topic");
	}
}
