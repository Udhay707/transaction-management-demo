package com.transaction.management.demo;

import com.transaction.management.demo.dto.BookingAcknowledgement;
import com.transaction.management.demo.dto.BookingRequest;
import com.transaction.management.demo.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TxApplication {

	public static void main(String[] args) {
		SpringApplication.run(TxApplication.class, args);
	}

	@Autowired
	private FlightBookingService service;

	@PostMapping("/book")
	public BookingAcknowledgement bookFlightTicket(@RequestBody BookingRequest request){
		return service.flightBookingService(request);
	}

}
