package hql;
/*
 Req2:
get employee salaries
 */
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import basics.*;

public class TestNamedQuery2 {

public static void main(String[] args) {
Session s = HibernateUtil.getSessionFactory().openSession();
//Query listEmps = s.createQuery("select usersalary from Employee"); //using hql
Query listEmps = s.getNamedQuery("empSal"); //using named query

List<Integer> emps = (List<Integer>)listEmps.list();
for (Integer emp: emps) {
System.out.println(emp);
}

}

}