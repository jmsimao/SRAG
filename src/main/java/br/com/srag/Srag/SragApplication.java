package br.com.srag.Srag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SragApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SragApplication.class, args);
	}

}
