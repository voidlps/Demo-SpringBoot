package com.example.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The main program.
 *
 * @author Brad Chen
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaClusterApplication {
	public static void main( String[] args ) {
		SpringApplication.run( EurekaClusterApplication.class, args);
	}
}
