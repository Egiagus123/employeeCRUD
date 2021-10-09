package Testastraaviv.employecrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import Testastraaviv.employecrud.entities.departments_entities;
import Testastraaviv.employecrud.entities.dept_empEntities;
import Testastraaviv.employecrud.entities.dept_managerentities;
import Testastraaviv.employecrud.entities.employees_entities;
import Testastraaviv.employecrud.entities.salaries_entities;
import Testastraaviv.employecrud.service.DataEmployeeService;
import Testastraaviv.employecrud.service.Dept_ManagerSevice;
import Testastraaviv.employecrud.service.EmpoyeeService;
import Testastraaviv.employecrud.service.SalariesSevice;

@Controller
public class SalariesController {
	
	@Autowired
//    private DataEmployeeService dataservice;
	private SalariesSevice salaryservice;

	
	@RequestMapping(value = "/savesalaries" , method = RequestMethod.POST)
	public String savedatasalaries(@ModelAttribute("salaries_entities") salaries_entities salaries_entities) {
		salaryservice.save(salaries_entities);
	     
	    return "redirect:/salaries";
	}
	
	@RequestMapping("/newsalaries")
	public String showNewsalariesPage(Model model) {
		salaries_entities salaries_entities = new salaries_entities();
	    model.addAttribute("salaries_entities", salaries_entities);
	     
	    return "dataemployee/newsalaries";
	}
	
	@GetMapping(value ="/salaries")
	public String salarieslist(Model model) {
		List<salaries_entities> listsalaries = salaryservice.listAll();
	    model.addAttribute("listsalaries", listsalaries);
	    
		return "dataemployee/datasalaries";
	}
	
	@RequestMapping("editsalaries/{emp_no}")
	public ModelAndView showEditPage(@PathVariable(name = "emp_no") int emp_no) {
	    ModelAndView mav = new ModelAndView("dataemployee/edit_salaries");
	    salaries_entities salaries_entities = salaryservice.get(emp_no);
	    mav.addObject("salaries_entities", salaries_entities);
	     
	    return mav;
	}
	
	@RequestMapping("/deletesalaries/{emp_no}")
	public String delete(@PathVariable(name = "emp_no") int emp_no) {
		salaryservice.delete(emp_no);
	    return "redirect:/salaries";       
	}
	
}
