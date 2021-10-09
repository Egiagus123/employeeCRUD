package Testastraaviv.employecrud.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departments")
public class departments_entities {
	@Id
	private String dept_no;
	private String dept_name;


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}

	@Override
	public String toString() {
		return "departments_entities [dept_no=" + dept_no + ", dept_name=" + dept_name + "]";
	}
	
	
}
