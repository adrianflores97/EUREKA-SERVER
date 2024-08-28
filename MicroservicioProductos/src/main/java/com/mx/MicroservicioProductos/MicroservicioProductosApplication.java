package com.mx.MicroservicioProductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient //Para descubrir las instancias de servicios con eureka

public class MicroservicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioProductosApplication.class, args);
	}

}
