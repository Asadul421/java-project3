package com.hibernate2.studentmgt1;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate2.studentmgt1.dao.StudentDAO;
import com.hibernate2.studentmgt1.daoimpl.StudentDAOImpl;
import com.hibernate2.studentmgt1.entity.Address;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StudentDAO sdao=new StudentDAOImpl();
    	Configuration cfg=new Configuration();
        cfg.configure();
        
        SessionFactory factory=cfg.buildSessionFactory();
        
        Session session=factory.openSession();
        
        Scanner scan=new Scanner(System.in);
        System.out.println("1. Create :");
    	System.out.println("2. Update :");
    	System.out.println("3. Delete :");
    	System.out.println("4. Retrieve :");
    	System.out.println("5. All List Of Student:");
    	System.out.println("6. Exit");
    	
		Address add=new Address();
    	do{  
			System.out.println("Enter Choice:");
			//scan input from user
			int ch = scan.nextInt(),sid = 0;
			String sname = null, contact = null;
			//switch case for multiple cases
			switch (ch) {
			//case 1 for inserting value
			case 1: {
				System.out.println("Enter Sid :");
	    		sid=scan.nextInt();
	    		
	    		System.out.println("Enter Name :");
	    		sname=scan.next();
	    		System.out.println("Enter contact:");
	    		contact=scan.next();
	    		System.out.println("Enter House No.");
	    		String hno = scan.next();
	    		System.out.println("Enter Area");
	    		String area= scan.next();
	    		System.out.println("Enter State");
	    		String state= scan.next();
	    		System.out.println("Enter City");
				String city= scan.next();
				System.out.println("Enter PIN");
				String pin= scan.nextLine();  
				add.setHno(hno);
				add.setArea(area);
				add.setCity(city);
				add.setPin(pin);
				add.setState(state);
	    		sdao.insertStudent(sname, contact, add);
	    		break;
			}
			//case 2 for update
			case 2: {
				System.out.println("Enter Student Sid ");
				sid=scan.nextInt();
				System.out.println("Enter Sname ");
				sname=scan.next();
				System.out.println("Enter Contact ");
				contact=scan.next();
				System.out.println("Enter House No.");
	    		String hno = scan.next();
	    		System.out.println("Enter Area");
	    		String area= scan.next();
	    		System.out.println("Enter State");
	    		String state= scan.next();
	    		System.out.println("Enter City");
				String city= scan.next();
				System.out.println("Enter PIN");
				String pin= scan.nextLine();
				add.setHno(hno);
				add.setArea(area);
				add.setCity(city);
				add.setPin(pin);
				add.setState(state);
				sdao.updateStudent(sid, sname, contact,add);
				break;
			}
			//case 3 for delete records
			case 3: {
				System.out.println("Enter Student Sid ");
				sid=scan.nextInt();
				sdao.deleteStudent(sid);
				System.out.println("Reord deleted successfully...");
				break;
			}
			//case 4 for Retrieve a User
			case 4: {
				 
				System.out.println("Enter Student Sid ");
				sid=scan.nextInt();
				System.out.println(sdao.getStudent(sid));
		        
				break;
			
			}
			//case 5 for showing all records
			case 5: {
				
				System.exit(0);
			}

			}
			//condition for continue
			System.out.println("Do you want to continue: y/n");  
			char c=scan.next().charAt(0);
			if(c=='n')
			break; 
			
		}while(true);

      //  tx.commit();
        session.close();
 
    }
}

        
        
    

