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
import Testastraaviv.employecrud.entities.titles_entities;
import Testastraaviv.employecrud.service.DataEmployeeService;
import Testastraaviv.employecrud.service.Dept_ManagerSevice;
import Testastraaviv.employecrud.service.EmpoyeeService;
import Testastraaviv.employecrud.service.SalariesSevice;
import Testastraaviv.employecrud.service.TitleSevice;

@Controller
public class TitleController {
	
	@Autowired
	private TitleSevice titleservice;

	
	@RequestMapping(value = "/savetitle" , method = RequestMethod.POST)
	public String savedatatitle(@ModelAttribute("titles_entities") titles_entities titles_entities) {
		titleservice.save(titles_entities);
	     
	    return "redirect:/title";
	}
	
	@RequestMapping("/newtitle")
	public String showNewtitlePage(Model model) {
		titles_entities titles_entities = new titles_entities();
	    model.addAttribute("titles_entities", titles_entities);
	     
	    return "dataemployee/newtitle";
	}
	
	@GetMapping(value ="/title")
	public String salarieslist(Model model) {
		List<titles_entities> listtitle= titleservice.listAll();
	    model.addAttribute("listtitle", listtitle);
	    
		return "dataemployee/datatitle";
	}
	
	@RequestMapping("edittitle/{emp_no}")
	public ModelAndView showEditPage(@PathVariable(name = "emp_no") int emp_no) {
	    ModelAndView mav = new ModelAndView("dataemployee/edit_title");
	    titles_entities titles_entities = titleservice.get(emp_no);
	    mav.addObject("titles_entities", titles_entities);
	     
	    return mav;
	}
	
	@RequestMapping("/deletetitle/{emp_no}")
	public String delete(@PathVariable(name = "emp_no") int emp_no) {
		titleservice.delete(emp_no);
	    return "redirect:/title";       
	}
	
}
