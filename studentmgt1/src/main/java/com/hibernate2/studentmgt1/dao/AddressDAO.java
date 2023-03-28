package com.hibernate2.studentmgt1.dao;

import com.hibernate2.studentmgt1.entity.Address;

public interface AddressDAO {
	public void insertAddress(String hno, String area, String city, String state, String pin);

	public void updateAddress(int aid, String hno, String area, String city, String state, String pin);

	public void deletetAddress(int aid);

	public Address viewAddress(int aid);


}
