package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.departments_entities;
import Testastraaviv.employecrud.entities.dept_empEntities;
import Testastraaviv.employecrud.entities.dept_managerentities;
import Testastraaviv.employecrud.entities.employees_entities;
import Testastraaviv.employecrud.entities.salaries_entities;
import Testastraaviv.employecrud.entities.titles_entities;
import Testastraaviv.employecrud.repository.departmentsRepository;
import Testastraaviv.employecrud.repository.dept_empRepository;
import Testastraaviv.employecrud.repository.dept_managerRepository;
import Testastraaviv.employecrud.repository.employeesRepository;
import Testastraaviv.employecrud.repository.salariesRepository;
import Testastraaviv.employecrud.repository.titlesRepository;

@Service
public class DataEmployeeService {
	@Autowired
	private dept_empRepository dept_emprepo;
	private dept_managerRepository dept_managerrepo;
	private departmentsRepository departmentsrepo;
	private employeesRepository employeesrepo;
	private salariesRepository salariesrepo;
	private titlesRepository titlesrepo;
	
	public List<dept_empEntities> listAll() {
        return (List<dept_empEntities>) dept_emprepo.findAll();
    }
     
    public void save(dept_empEntities dept_emp) {
    	dept_emprepo.save(dept_emp);
    }
    public void save(dept_managerentities dept_emp) {
    	dept_managerrepo.save(dept_emp);
    } 
    public void save(departments_entities dept_emp) {
    	departmentsrepo.save(dept_emp);
    }
    public void save(employees_entities dept_emp) {
    	employeesrepo.save(dept_emp);
    }
    public void save(salaries_entities dept_emp) {
    	salariesrepo.save(dept_emp);
    }
    public void save(titles_entities dept_emp) {
    	titlesrepo.save(dept_emp);
    }
     
    public dept_empEntities get(long emp_no) {
        return dept_emprepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	dept_emprepo.deleteById(emp_no);
    	dept_managerrepo.deleteById(emp_no);
    	departmentsrepo.deleteById(emp_no);
    	employeesrepo.deleteById(emp_no);
    	salariesrepo.deleteById(emp_no);
    	titlesrepo.deleteById(emp_no);
    }
	
	

}
