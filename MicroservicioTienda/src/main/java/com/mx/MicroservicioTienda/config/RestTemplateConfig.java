package com.mx.MicroservicioTienda.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
	//@Bean--Es una clase que se encarga de realizar una instancia en este caso de la clase RestTemplate
	//RestTemplate---Es una clase de spring que nos indica o ayuda a trabajar con servicios rest

	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}
