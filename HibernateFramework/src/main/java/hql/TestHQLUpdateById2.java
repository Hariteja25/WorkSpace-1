package hql;

/**
update employee salary, employee name using employee id
hql: update Employee set usersalary=:mySal where id=:myId
use executeUpdate()

 */
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import basics.*;
public class TestHQLUpdateById2 {

public static void main(String[] args) {
	Session  sObj = HibernateUtil.getSessionFactory().openSession();
	int id =1;
	int sal = 30000;
	String name="Hari Teja";
	Transaction transaction = sObj.getTransaction();
	
	transaction.begin();
	Query  q = sObj.createQuery("update Employee set usersalary=:mySal , userName=:myName where id=:myId");
	q.setParameter("myId", id);
	q.setParameter("mySal", sal);
	q.setParameter("myName", name);
	int rowsAffected = q.executeUpdate();
	transaction.commit();
	
	
	if(rowsAffected >=1){
		System.out.println("update succesful");
	}else{
		System.out.println("update fail");
	}
	sObj.close();
}
}