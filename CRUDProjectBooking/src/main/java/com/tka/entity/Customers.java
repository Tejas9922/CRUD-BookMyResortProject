package com.tka.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="Bookinginfo" , schema="CURD2_ADVJAVA")
public class Customers {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int c_id;
	private String name;
	private int noofpeoples;
	private String roomtype;
	private String checkin;
	private String checkout;
	public Customers() {
		super();
	}
	public Customers(int c_id, String name, int noofpeoples, String roomtype, String checkin, String checkout) {
		super();
		this.c_id = c_id;
		this.name = name;
		this.noofpeoples = noofpeoples;
		this.roomtype = roomtype;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoofpeoples() {
		return noofpeoples;
	}
	public void setNoofpeoples(int noofpeoples) {
		this.noofpeoples = noofpeoples;
	}
	public String getRoomtype() {
		return roomtype;
	}
	public void setRoomtype(String roomtype) {
		this.roomtype = roomtype;
	}
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	@Override
	public String toString() {
		return "Customers [c_id=" + c_id + ", name=" + name + ", noofpeoples=" + noofpeoples + ", roomtype=" + roomtype
				+ ", checkin=" + checkin + ", checkout=" + checkout + "]";
	}
	
	

	
}
