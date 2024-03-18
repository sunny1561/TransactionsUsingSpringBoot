package com.Flight_service.Transactions_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Application;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class TransactionsDemoApplication {
	@Autowired
//	private ApiService apiService;

//	@PostMapping("/FlightTicket")
//	public Confirmation bookTicket(@RequestBody FlightBookingRequest request) throws IllegalAccessException {
//           return apiService.BookFlight(request);
//	}


		public static void main(String[] args) {
			ApplicationContext applicationContext=SpringApplication.run(Application.class,args);
			String [] allbeans=applicationContext.getBeanDefinitionNames();
			for(String str:allbeans){
				System.out.println(str);
			}
		}





}
