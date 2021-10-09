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
import Testastraaviv.employecrud.service.DataEmployeeService;
import Testastraaviv.employecrud.service.Dept_ManagerSevice;
import Testastraaviv.employecrud.service.EmpoyeeService;

@Controller
public class EmployeesnameController {
	
	@Autowired
//    private DataEmployeeService dataservice;
	private EmpoyeeService employeeservice;

	
	@RequestMapping(value = "/saveemployees" , method = RequestMethod.POST)
	public String savedatamanager(@ModelAttribute("employees_entities") employees_entities employees_entities) {
		employeeservice.save(employees_entities);
	     
	    return "redirect:/employees";
	}
	
	@RequestMapping("/newemployees")
	public String showNewProductPage(Model model) {
		employees_entities employees_entities = new employees_entities();
	    model.addAttribute("employees_entities", employees_entities);
	     
	    return "dataemployee/newemployees";
	}
	
	@GetMapping(value ="/employees")
	public String employeenamelist(Model model) {
		List<employees_entities> listemployeesname = employeeservice.listAll();
	    model.addAttribute("listemployeesname", listemployeesname);
	    
		return "dataemployee/dataemployees";
	}
	
	@RequestMapping("editemployees/{emp_no}")
	public ModelAndView showEditPage(@PathVariable(name = "emp_no") int emp_no) {
	    ModelAndView mav = new ModelAndView("dataemployee/edit_employees");
	    employees_entities employees_entities = employeeservice.get(emp_no);
	    mav.addObject("employees_entities", employees_entities);
	     
	    return mav;
	}
	
	@RequestMapping("/deleteemployees/{emp_no}")
	public String delete(@PathVariable(name = "emp_no") int emp_no) {
		employeeservice.delete(emp_no);
	    return "redirect:/employees";       
	}
	
}
