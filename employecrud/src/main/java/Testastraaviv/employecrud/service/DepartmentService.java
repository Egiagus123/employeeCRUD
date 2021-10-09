package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.departments_entities;
import Testastraaviv.employecrud.repository.departmentsRepository;

@Service
public class DepartmentService {
	@Autowired
	private departmentsRepository departmentsrepo;
	
	public List<departments_entities> listAll() {
        return (List<departments_entities>) departmentsrepo.findAll();
    }
     
    public void save(departments_entities dept_emp) {
    	departmentsrepo.save(dept_emp);
    }
     
    public departments_entities get(long emp_no) {
        return departmentsrepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	departmentsrepo.deleteById(emp_no);
    }
	
	

}
