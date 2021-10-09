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
import Testastraaviv.employecrud.service.DataEmployeeService;
import Testastraaviv.employecrud.service.Dept_ManagerSevice;

@Controller
public class Department_Manager {
	
	@Autowired
//    private DataEmployeeService dataservice;
	private Dept_ManagerSevice deptmanagerservice;

	
	@RequestMapping(value = "/savemanager" , method = RequestMethod.POST)
	public String savedatamanager(@ModelAttribute("dept_managerentities") dept_managerentities dept_managerentities) {
		deptmanagerservice.save(dept_managerentities);
	     
	    return "redirect:/department_manager";
	}
	
	@RequestMapping("/newmanager")
	public String showNewProductPage(Model model) {
		dept_managerentities dept_managerentities = new dept_managerentities();
	    model.addAttribute("dept_managerentities", dept_managerentities);
	     
	    return "dataemployee/department_manager";
	}
	
	@GetMapping(value ="/department_manager")
	public String departmentlist(Model model) {
		List<dept_managerentities> listDatadeptmanager = deptmanagerservice.listAll();
	    model.addAttribute("listDatadeptmanager", listDatadeptmanager);
	    
		return "dataemployee/datadept_manager";
	}
	
	@RequestMapping("editmanager/{emp_no}")
	public ModelAndView showEditPage(@PathVariable(name = "emp_no") int emp_no) {
	    ModelAndView mav = new ModelAndView("dataemployee/edit_dept_manager");
	    dept_managerentities dept_managerentities = deptmanagerservice.get(emp_no);
	    mav.addObject("dept_managerentities", dept_managerentities);
	     
	    return mav;
	}
	
	@RequestMapping("/deletemanager/{emp_no}")
	public String delete(@PathVariable(name = "emp_no") int emp_no) {
		deptmanagerservice.delete(emp_no);
	    return "redirect:/department_manager";       
	}
	
}
