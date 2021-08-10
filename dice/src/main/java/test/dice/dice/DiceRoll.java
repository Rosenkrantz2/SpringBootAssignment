package test.dice.dice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import org.springframework.stereotype.Service;

@Service
public class DiceRoll {
	int min = 1;
	int checkval;
	Map<Integer, Integer> rolls = new HashMap<>();
	Map<Integer, Integer> fixedrolls = new HashMap<>();
    private List<dice> diceRolls;
	
	public int dice_roll(int maxDice){
		
		int dice_roll = (int)Math.floor(Math.random()*(maxDice-min+1)+min);
		checkval = dice_roll;
		return dice_roll;
	}
	


	public List<dice> getDiceRolls(int maxDice, int rollnum, int dicenum){
		diceRolls = new ArrayList<>();	
		for (int i = 0; i < rollnum; i++)
		{
			checkval = 0;
			for(int dicecount = 0; dicecount < dicenum; dicecount++)
			{
				checkval = checkval + dice_roll(maxDice);
			}
			if(rolls.containsKey(checkval))
				rolls.put(checkval, rolls.get(checkval) + 1);
			else
				rolls.put(checkval, 1);	
		}
		for(Map.Entry<Integer, Integer> diceroll : rolls.entrySet())
		{
			System.out.println("Value: " + diceroll.getKey() +
					", Total # of occurrence: " + diceroll.getValue());
			diceRolls.add(new dice(diceroll.getKey(), diceroll.getValue()));
		}
		
		return diceRolls;
	}
	
	public List<dice> getFixedDiceRolls(){
		diceRolls = new ArrayList<>();	
		for (int i = 0; i < 100; i++)
		{
			checkval = 0;
			for(int dicecount = 0; dicecount < 3; dicecount++)
			{
				checkval = checkval + dice_roll(6);
			}
			if(fixedrolls.containsKey(checkval))
				fixedrolls.put(checkval, fixedrolls.get(checkval) + 1);
			else
				fixedrolls.put(checkval, 1);	
		}
		for(Map.Entry<Integer, Integer> diceroll : fixedrolls.entrySet())
		{
			System.out.println("Value: " + diceroll.getKey() +
					", Total # of occurrence: " + diceroll.getValue());
			diceRolls.add(new dice(diceroll.getKey(), diceroll.getValue()));
		}
		
		return diceRolls;
	}
	
	

}
