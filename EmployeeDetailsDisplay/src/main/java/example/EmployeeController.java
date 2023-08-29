package example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	
	EmployeeDAO employeeDAO;
	@Autowired
	public EmployeeController(EmployeeDAO employeeDAO) {
		this.employeeDAO=employeeDAO;
	}
	
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String Details(Model model) {
		List<Employee> employeeList = employeeDAO.getDetails();
		model.addAttribute("size",employeeList.size());
		model.addAttribute("employeeList", employeeList);
		
		return "EmpDetails";
		
	}

}
