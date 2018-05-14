package com.example.Kafka;


import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.stereotype.Component;

@Component
public class KafkaService {
	
	public void send(String message) {
		// create instance for properties to access producer configs   
		Properties props = new Properties();
	      
	      //Assign localhost id. by default 9092 is present in producer.properties in kafka installation folder hence the port #.
	      props.put("bootstrap.servers", "localhost:9092");
	      
	      //Set acknowledgements for producer requests.      
	      props.put("acks", "all");

	      
	      props.put("key.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	         
	      props.put("value.serializer", 
	         "org.apache.kafka.common.serialization.StringSerializer");
	      
	      Producer<String, String> producer = new KafkaProducer
	         <String, String>(props);
	            
         producer.send(new ProducerRecord<String, String>("rahultopic", 
	            Integer.toString(message.length()), message));
	               System.out.println("Message sent successfully");
	               producer.close();
		
	}

}
