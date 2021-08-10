package test.dice.dice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class gui {

	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model)
	{
		model.addAttribute("params", new params());
		return "index";
	}
}
