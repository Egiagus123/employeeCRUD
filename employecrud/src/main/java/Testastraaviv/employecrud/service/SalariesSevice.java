package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.dept_managerentities;
import Testastraaviv.employecrud.entities.salaries_entities;
import Testastraaviv.employecrud.repository.dept_managerRepository;
import Testastraaviv.employecrud.repository.salariesRepository;

@Service
public class SalariesSevice {
	@Autowired
	private salariesRepository SalariesSevicerepo;
	
	public List<salaries_entities> listAll() {
        return (List<salaries_entities>) SalariesSevicerepo.findAll();
    }
    
    public void save(salaries_entities dept_emp) {
    	SalariesSevicerepo.save(dept_emp);
    } 
 
    public salaries_entities get(long emp_no) {
        return SalariesSevicerepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	SalariesSevicerepo.deleteById(emp_no);
    }
	
	

}
