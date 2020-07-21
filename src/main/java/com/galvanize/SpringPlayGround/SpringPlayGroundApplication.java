package com.galvanize.SpringPlayGround;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringPlayGroundApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringPlayGroundApplication.class, args);
	}

	@GetMapping ("/flights/flight")
	public Flight getFlight () {
		Flight flight = new Flight ();
		flight.addTicket("test", "test");
		return flight;
	}

	@GetMapping ("/flights")
	public ArrayList<Flight> getFlights () {
		ArrayList<Flight> response = new ArrayList<Flight> ();
		Flight flight = new Flight ();
		flight.addTicket("test", "test");
		response.add(flight);
		Flight flight2 = new Flight ();
		flight2.addTicket("test2", "test2");
		response.add(flight2);
		return response;
	}
}