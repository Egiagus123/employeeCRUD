package Testastraaviv.employecrud.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Enumerated;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="employees")
public class employees_entities {
	
	private long emp_no;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date birth_date;
	private String first_name;
	private String last_name;
	@Enumerated(EnumType.STRING)
	private gender gender;
	
	public enum gender {
	   M,F
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(long emp_no) {
		this.emp_no = emp_no;
	}

	public Date getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public gender getGender() {
		return gender;
	}

	public void setGender(gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "employees_entities [emp_no=" + emp_no + ", birth_date=" + birth_date + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", gender=" + gender + "]";
	}
	
	
	
	
}
