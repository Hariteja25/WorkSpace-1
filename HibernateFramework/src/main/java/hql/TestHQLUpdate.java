package hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import basics.HibernateUtil;

public class TestHQLUpdate {
	// 	assignment : give hike of 5000 f every employee
	public static void main(String[] args) {
		Session  sObj = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = sObj.getTransaction();
		
		transaction.begin();
		Query  q = sObj.createQuery("update Employee set usersalary=usersalary+5000 ");
		int rowsAffected = q.executeUpdate();
		transaction.commit();
		
		 sObj.close();
		if(rowsAffected >=1){
			System.out.println("updated succesful");
		}else{
			System.out.println("update fail");
		}
	}
}

     


