package com.hibernate2.studentmgt1.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate2.studentmgt1.dao.AddressDAO;
import com.hibernate2.studentmgt1.entity.Address;
import com.hibernate2.studentmgt1.util.HiberUtil;

public class AddressDAOImpl implements AddressDAO {
	
	Session session = HiberUtil.getSession();

	// to insert address
	@Override
	public void insertAddress(String hno, String area, String city, String state, String pin) {
		// TODO Auto-generated method stub
		Address add = new Address(hno, area, city, state, pin);

		Transaction tx = session.beginTransaction();
		session.save(add);
		tx.commit();
		session.close();

		
	}
	// to update
	@Override
	public void updateAddress(int aid, String hno, String area, String city, String state, String pin) {
		// TODO Auto-generated method stub
		Address add = session.get(Address.class, aid);
		add.setHno(hno);
		add.setArea(area);
		add.setCity(city);
		add.setState(state);
		add.setPin(pin);

		Transaction tx = session.beginTransaction();
		session.update(add);
		tx.commit();
		session.close();

		
	}

	// to delete
	@Override
	public void deletetAddress(int aid) {
		// TODO Auto-generated method stub

		Address add = session.get(Address.class, aid);

		Transaction tx = session.beginTransaction();
		session.delete(add);
		tx.commit();
		session.close();
		
	}
	// to retriev
	@Override
	public Address viewAddress(int aid) {
		// TODO Auto-generated method stub
		return session.get(Address.class, aid);
	}

}
