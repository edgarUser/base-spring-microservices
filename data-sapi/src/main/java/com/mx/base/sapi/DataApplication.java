package com.mx.base.sapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mx.base.sapi.repository.DataRepository;
import com.mx.base.sapi.service.DataService;
import com.mx.base.sapi.service.DataServiceImpl;

@SpringBootApplication
public class DataApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataApplication.class, args);
	}

	@Bean
	public DataRepository getDataRepository() {
		return new DataRepository();
	}

	@Bean
	public DataService getDataService() {
		return new DataServiceImpl(getDataRepository());
	}

}
