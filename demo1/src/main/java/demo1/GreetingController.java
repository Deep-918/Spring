package demo1;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class GreetingController {
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "form";
    }

	@RequestMapping(value="/form", method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute Employee employee, Model model) {
        
    	model.addAttribute("employee", employee);
    	return "result";
    }

}
