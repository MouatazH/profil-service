package com.microservices.projet.profilservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker
public class ProfilServiceApplication {

    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate(){return new RestTemplate();}
	public static void main(String[] args) {
		SpringApplication.run(ProfilServiceApplication.class, args);
	}

}
