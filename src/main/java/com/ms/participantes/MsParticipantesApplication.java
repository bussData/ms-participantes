package com.ms.participantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.ms.participantes.client") 
public class MsParticipantesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsParticipantesApplication.class, args);
	}

}
