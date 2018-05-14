package com.example.Kafka;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaResource {
	
	
	@Autowired
	KafkaService kafkaService;
	
	@POST
	@RequestMapping("/sendMessage")
	public void sendMessage(@RequestBody String message){
		System.out.println(message);
		kafkaService.send(message);
	}

}
