package com.tka.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ResortDAO;
import com.tka.entity.Customers;

@Service
public class resortService implements ResortServiceInterface {

	@Autowired
	ResortDAO rd;

	public String addBooking(Customers customer) {
		return rd.addBooking(customer);
	}

	@Override
	public String addAllBooking(List<Customers> customer) {
		return rd.addAllBooking(customer);
	}

	public List<Customers> getAllBookings() {
		return rd.getAllBookings();
	}

	public List<Customers> getBookingByRoomType(String nm) {
		return rd.getBookingByRoomType(nm);
	}

	public String deleteBooking(int id) {
		return rd.deleteBooking(id);
	}

	
	public String updateBooking(Customers customer) {
		return rd.updateBooking(customer);
	}

}
