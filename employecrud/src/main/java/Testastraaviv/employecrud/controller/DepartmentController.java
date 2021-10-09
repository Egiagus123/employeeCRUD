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
public class DepartmentController {
	
	@Autowired
	private DepartmentService DepartmentService;
	
	@RequestMapping(value = "/savedepartment" , method = RequestMethod.POST)
	public String savedapartment(@ModelAttribute("departments_entities") departments_entities departments_entities) {
		DepartmentService.save(departments_entities);
	     
	    return "redirect:/department";
	}
	
	@RequestMapping("/newdepartment")
	public String showNewdeptPage(Model model) {
		departments_entities departments_entities = new departments_entities();
	    model.addAttribute("departments_entities", departments_entities);
	     
	    return "dataemployee/newdepartment";
	}
	
	@GetMapping(value ="/department")
	public String departmentlist(Model model) {
		List<departments_entities> listDepartmentService = DepartmentService.listAll();
	    model.addAttribute("listDepartmentService", listDepartmentService);
	    
		return "dataemployee/datadepartment";
	}
	
}
