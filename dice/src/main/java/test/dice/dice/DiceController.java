package test.dice.dice;

import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Validated
public class DiceController {

	@Autowired
	private DiceRoll diceRollService;
	
	@RequestMapping("/diceRoll")
	public List<dice> getDiceRolls(@RequestParam @Min(value=4, message = "should be atleast 4") int maxdice, 
			@RequestParam @Min(value=1, message = "should be atleast 1") int rollnum, 
			@RequestParam @Min(value=1, message = "should be atleast 1") int dicenum){ 
			return diceRollService.getDiceRolls(maxdice, rollnum, dicenum); 
	}
	
	@RequestMapping("/diceRollFixed")
	public List<dice> getFixedDiceRolls(){ 

			return diceRollService.getFixedDiceRolls(); 
	}
	

}
