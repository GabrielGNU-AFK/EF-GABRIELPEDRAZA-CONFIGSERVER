package com.idat.ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class EfGabrielPedrazaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfGabrielPedrazaConfigServerApplication.class, args);
	}

}
