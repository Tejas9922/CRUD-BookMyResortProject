package com.tka.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Customers;

@Repository
public class ResortDAO implements ResortDAOInterface {

	@Autowired
	SessionFactory sf;

	@Override
	public String addBooking(Customers customer) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(customer);
		tx.commit();
		ss.close();
		return "Data Added Successfully";
	}

	@Override
	public String addAllBooking(List<Customers> customer) {
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();

		for (Customers c : customer) {
			ss.save(c);
		}

		tx.commit();
		ss.close();
		return "Multiple Data Added Successfully";
	}

	public List<Customers> getAllBookings() {
		Session ss = sf.openSession();
		List<Customers> customer = ss.createCriteria(Customers.class).list();
		return customer;
	}

	@Override
	public List<Customers> getBookingByRoomType(String rt) {
		Session ss = sf.openSession();
		List<Customers> customer = ss.createCriteria(Customers.class).add(Restrictions.like("roomtype", "%" + rt + "%"))
				.list();

		return customer;
	}

	public String deleteBooking(int id) {

		try (Session ss = sf.openSession()) {
			Transaction tx = ss.beginTransaction();

			Customers customer = ss.get(Customers.class, id);
			if (customer != null) {
				ss.delete(customer);
			}
			ss.getTransaction().commit();
		}

		return "Data Deleted";
	}

	public String updateBooking(Customers customer) {

		try (Session ss = sf.openSession()) {
			Transaction tx = ss.beginTransaction();

			Customers existingCustomers = ss.get(Customers.class, customer.getC_id());

			if (existingCustomers != null) {
				existingCustomers.setC_id(customer.getC_id());
				existingCustomers.setName(customer.getName());
				existingCustomers.setNoofpeoples(customer.getNoofpeoples());
				existingCustomers.setCheckin(customer.getCheckin());
				existingCustomers.setCheckout(customer.getCheckout());
				existingCustomers.setRoomtype(customer.getRoomtype());

			}
			ss.getTransaction().commit();
		}
		return "Data Updates Successfully";
	}

}
