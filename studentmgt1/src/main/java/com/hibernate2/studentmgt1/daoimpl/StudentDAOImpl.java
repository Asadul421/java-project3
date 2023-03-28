package com.hibernate2.studentmgt1.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate2.studentmgt1.dao.StudentDAO;
import com.hibernate2.studentmgt1.entity.Address;
import com.hibernate2.studentmgt1.entity.Student;
import com.hibernate2.studentmgt1.util.HiberUtil;

public class StudentDAOImpl implements StudentDAO {
	
	Session session = HiberUtil.getSession();
	// to insert Student
	@Override
	public void insertStudent(String sname, String contact, Address add) {
		// TODO Auto-generated method stub
		Student st = new Student(sname, contact, add);
		Transaction tx = session.beginTransaction();
		session.save(st);
		tx.commit();
		System.out.println("Record inserted successfully....");

		
	}
    //update Student
	@Override
	public void updateStudent(int sid, String sname, String contact, Address add) {
		// TODO Auto-generated method stub
		Student st = session.get(Student.class, sid);
		st.setSname(sname);
		st.setContact(contact);
		Transaction tx = session.beginTransaction();
		session.update(st);
		tx.commit();
		System.out.println("Updated Successfully....");
		
	}

	@Override
	public void deleteStudent(int sid) {
		// TODO Auto-generated method stub
		Student st = session.get(Student.class, sid);

		Transaction tx = session.beginTransaction();
		session.delete(st);
		tx.commit();
		session.close();
		
	}


	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		return session.get(Student.class, sid);
	}
	@Override
	public Student viewStudent(int sid) {
		// TODO Auto-generated method stub
		Student st = session.get(Student.class, sid);

		return session.get(Student.class, sid);
	}

}
