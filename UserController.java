package example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    
    UserContractor us;
    @Autowired
    public UserController(UserContractor us) {
    	this.us=us;
    }
    public UserController() {
    	
    }
    
    @RequestMapping(value="/open",method= RequestMethod.GET)
    public String login() {
    	
    	return "login";
    }
    @RequestMapping(value="/cred",method= RequestMethod.GET)
    public String user(User user,Model model) {
    	boolean a=us.available(user.getUname(),user.getPassword());
    	if(a) {
    	model.addAttribute("uname",user.getUname());
		return "user";
    	}
    	else {
    		return "error";
    	}
    	
    }
    
}
