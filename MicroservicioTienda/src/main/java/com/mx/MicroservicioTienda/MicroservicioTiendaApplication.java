package com.mx.MicroservicioTienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients //Esta es la biblioteca de java que permite a los desarrolladores crear facilmente con el protocolo HTTP
public class MicroservicioTiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioTiendaApplication.class, args);
	}

}
