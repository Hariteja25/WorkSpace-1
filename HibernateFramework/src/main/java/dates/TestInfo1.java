package dates;

import java.sql.Timestamp;

import org.hibernate.Session;
import basics.*;
 

public class TestInfo1 {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Info1 info = new Info1();
		
		info.setSqlDate(java.sql.Date.valueOf("2019-12-07"));
		info.setSqlTime(java.sql.Time.valueOf("15:30:14"));
		info.setSqlTimestamp(Timestamp.valueOf("2019-12-07 15:30:14.332"));
		
		session.getTransaction().begin();
		session.save(info);
		session.getTransaction().commit();
		
		session.close();
		
	}
}
 

