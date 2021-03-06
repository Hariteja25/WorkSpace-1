package hql;
/**
update employee salary using employee id
hql: update Employee set usersalary=:mySal where id=:myId
use executeUpdate()

*/

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import basics.*;

public class TestHQL15{

public static void main(String[] args) {
Session sObj = HibernateUtil.getSessionFactory().openSession();
int id =1;
int sal = 20000;
Transaction transaction = sObj.getTransaction();

transaction.begin();
Query q = sObj.createQuery("update Employee set usersalary=:mySal where id=:myId");
q.setParameter("myId", id);
q.setParameter("mySal", sal);
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

