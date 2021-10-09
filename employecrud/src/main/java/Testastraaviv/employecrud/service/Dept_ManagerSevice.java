package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.dept_managerentities;
import Testastraaviv.employecrud.repository.dept_managerRepository;

@Service
public class Dept_ManagerSevice {
	@Autowired
	private dept_managerRepository dept_managerrepo;
	
	public List<dept_managerentities> listAll() {
        return (List<dept_managerentities>) dept_managerrepo.findAll();
    }
    
    public void save(dept_managerentities dept_emp) {
    	dept_managerrepo.save(dept_emp);
    } 
 
    public dept_managerentities get(long emp_no) {
        return dept_managerrepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	dept_managerrepo.deleteById(emp_no);
    }
	
	

}
