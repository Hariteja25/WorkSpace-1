package basics;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@NamedQueries(
value =
{
@NamedQuery(name ="getEmpNames",query = "select userName from Employee"),
@NamedQuery(name ="getALLEmps",query = "from Employee"),
@NamedQuery(name ="empSal",query = "select usersalary from Employee")
}
)

@Entity
@Table(name = "EmployeeDetails")
public class Employee {


@Id
@GeneratedValue(strategy = GenerationType.AUTO)  // generates id automatically


@Column(name = "userId")
private int Id;

@Column(name = "name" , nullable = false,length = 30) // name cannot be null and has 30 chars
private String userName;

@Column(name = "salaryInfo",nullable = true) // sal can be null
private Integer usersalary;

//setters and getters

public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	public Integer getUsersalary() {
		return usersalary;
	}
	public void setUsersalary(Integer usersalary) {
		this.usersalary = usersalary;
	}
	public String getUserName() {
		return userName;
	}
	
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", userName=" + userName + ", usersalary=" + usersalary + "]";
	}

  
  
}
 