package Testastraaviv.employecrud.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name ="dept_manager")
public class dept_managerentities {
	
	private long emp_no;
	private String dept_no;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date from_date;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date to_date;
	
//	public dept_managerentities(int emp_no, String dept_mo, Date from_date, Date to_date) {
//		super();
//		this.emp_no = emp_no;
//		this.dept_no = dept_mo;
//		this.from_date = from_date;
//		this.to_date = to_date;
//	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(long emp_no) {
		this.emp_no = emp_no;
	}
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	public Date getFrom_date() {
		return from_date;
	}
	public void setFrom_date(Date from_date) {
		this.from_date = from_date;
	}
	public Date getTo_date() {
		return to_date;
	}
	public void setTo_date(Date to_date) {
		this.to_date = to_date;
	}
	@Override
	public String toString() {
		return "dept_managerentities [emp_no=" + emp_no + ", dept_no=" + dept_no + ", from_date=" + from_date
				+ ", to_date=" + to_date + "]";
	}

	
	
}
