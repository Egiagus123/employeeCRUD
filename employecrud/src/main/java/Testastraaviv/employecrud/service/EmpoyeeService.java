package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.employees_entities;
import Testastraaviv.employecrud.repository.employeesRepository;

@Service
public class EmpoyeeService {
	@Autowired
	private employeesRepository employeesrepo;
	
	public List<employees_entities> listAll() {
        return (List<employees_entities>) employeesrepo.findAll();
    }
     
    public void save(employees_entities dept_emp) {
    	employeesrepo.save(dept_emp);
    }
     
    public employees_entities get(long emp_no) {
        return employeesrepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	employeesrepo.deleteById(emp_no);
    }
}
