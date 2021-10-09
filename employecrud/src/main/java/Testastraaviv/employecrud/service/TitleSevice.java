package Testastraaviv.employecrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Testastraaviv.employecrud.entities.dept_managerentities;
import Testastraaviv.employecrud.entities.salaries_entities;
import Testastraaviv.employecrud.entities.titles_entities;
import Testastraaviv.employecrud.repository.dept_managerRepository;
import Testastraaviv.employecrud.repository.salariesRepository;
import Testastraaviv.employecrud.repository.titlesRepository;

@Service
public class TitleSevice {
	@Autowired
	private titlesRepository titleSevicerepo;
	
	public List<titles_entities> listAll() {
        return (List<titles_entities>) titleSevicerepo.findAll();
    }
    
    public void save(titles_entities dept_emp) {
    	titleSevicerepo.save(dept_emp);
    } 
 
    public titles_entities get(long emp_no) {
        return titleSevicerepo.findById(emp_no).get();
    }
     
    public void delete(long emp_no) {
    	titleSevicerepo.deleteById(emp_no);
    }
	
	

}
