package com.microservices.projet.profilservice.proxy;

import com.microservices.projet.profilservice.models.Compte;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CompteProxy {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getFallBackCompte", commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold", value = "5"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage", value = "50"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "5000")

    })
    public Long getProfilId(){
        //Compte compte = restTemplate.getForObject("http://compte-service/compte", Compte.class);
        Compte compte = new Compte(1L,"nomprenom","****",1L);
        Long profilId = compte.getProfilId();
        return profilId;
    }

    public Long getFallBackCompte(){
        Compte compteF = new Compte(0L," "," ",0L);
        return compteF.getProfilId();
    }


}
