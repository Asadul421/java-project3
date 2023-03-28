package com.hibernate2.studentmgt1.dao;

import com.hibernate2.studentmgt1.entity.Address;
import com.hibernate2.studentmgt1.entity.Student;

public interface StudentDAO {
	public Student getStudent(int sid);
	public void insertStudent(String sname, String contact, Address add);

	public void updateStudent(int sid, String sname, String contact, Address add);

	public void deleteStudent(int sid);

	public Student viewStudent(int sid);

}
