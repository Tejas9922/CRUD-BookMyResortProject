package com.tka.dao;

import java.util.List;

import com.tka.entity.Customers;

public interface ResortDAOInterface {

	public String addBooking(Customers customer);

	public String addAllBooking(List<Customers> customer);

	public List<Customers> getAllBookings();
	
	public List<Customers> getBookingByRoomType(String rt);
	
	public String deleteBooking(int id);
	
	public String updateBooking(Customers customer);

}