package br.com.tiagoobastos.exemplofeignlombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Startup {
	public static void main(String[] args) {
		SpringApplication.run(Startup.class, args);
	}

}
