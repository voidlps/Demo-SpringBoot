package com.example.security.oauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * The main program.
 *
 * @author Brad Chen
 *
 */
@SpringBootApplication
public class PasswordCredentialsServerApp {
	public static void main( String[] args ) {
		SpringApplication.run( PasswordCredentialsServerApp.class, args );
	}
}
