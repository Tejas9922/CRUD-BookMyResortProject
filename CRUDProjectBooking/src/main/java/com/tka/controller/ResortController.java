package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Customers;
import com.tka.service.resortService;

@RestController
@RequestMapping("api/resort")
public class ResortController {

	@Autowired
	resortService rs;

	@PostMapping("/addbooking")
	public String addBooking(@RequestBody Customers customer) {

		return rs.addBooking(customer);
	}

	@PostMapping("/addallbooking")
	public String addAllBooking(@RequestBody List<Customers> customer) {

		return rs.addAllBooking(customer);
	}

	@GetMapping("/getbooking")
	public List<Customers> getAllBookings() {
		return rs.getAllBookings();

	}

	@GetMapping("/byname/{rt}")
	public List<Customers> getBookingByRoomType(@PathVariable("rt") String rt) {
		return rs.getBookingByRoomType(rt);

	}

	@DeleteMapping("/delete/{id}")
	public String deleteBooking(@PathVariable("id") int id) {
		return rs.deleteBooking(id);

	}

	
	@PutMapping("/update")
	public String updateBooking(@RequestBody Customers customer) {

		return rs.updateBooking(customer);
	}

}
