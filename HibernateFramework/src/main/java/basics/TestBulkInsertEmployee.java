package basics;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestBulkInsertEmployee {
	public static void main(String[] args) {
  
   // create sf obj
		SessionFactory sf = HibernateUtil.getSessionFactory();

		// crate session obj
		Session se= sf.openSession();

		// create transaction obj
		Transaction transaction = se.getTransaction();
    
    transaction.begin();
  try {
			for (int i = 1; i <= 10; i++) {
			 
				String name = "testuser" + i;
				int sal = 10 + i;
				Employee empObj = new Employee();
				empObj.setUserName(name);
				empObj.setUsersalary(sal);
				 
         // save the entity obj in table
				se.save(empObj);

			 
				if (i % 5 == 0) {
					se.flush();
					se.clear();
				}
			}
      
      
			transaction.commit();
			System.out.println("data saved");
		} catch (HibernateException e) {
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			se.close();
		}
  
  
  }
}
  