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
import Testastraaviv.employecrud.service.DepartmentService;
import Testastraaviv.employecrud.service.Dept_ManagerSevice;


@Controller
public class EmployeeController {
	
	@Autowired
    private DataEmployeeService dataservice;
	private Dept_ManagerSevice deptmanagerservice;
	
	@GetMapping(value ="/")
	public String employeelist(Model model) {
		List<dept_empEntities> listDataEmployee = dataservice.listAll();
	    model.addAttribute("listDataEmployee", listDataEmployee);
		return "dataemployee/dataemployee";
	}
	
	@RequestMapping("/new")
	public String showNewProductPage(Model model) {
		dept_empEntities dept_empEntities = new dept_empEntities();
	    model.addAttribute("dept_empEntities", dept_empEntities);
	     
	    return "dataemployee/newdept_emp";
	}
	
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String savedataemp(@ModelAttribute("dept_empEntities") dept_empEntities dept_empEntities) {
	    dataservice.save(dept_empEntities);
	     
	    return "redirect:/";
	}
	
	@RequestMapping("edit/{emp_no}")
	public ModelAndView showEditPage(@PathVariable(name = "emp_no") int emp_no) {
	    ModelAndView mav = new ModelAndView("dataemployee/edit_dept_emp");
	    dept_empEntities dept_empEntities = dataservice.get(emp_no);
	    mav.addObject("dept_empEntities", dept_empEntities);
	     
	    return mav;
	}
	
	@RequestMapping("/delete/{emp_no}")
	public String delete(@PathVariable(name = "emp_no") int emp_no) {
	    dataservice.delete(emp_no);
	    return "redirect:/";       
	}
}
