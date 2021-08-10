package test.dice.dice;

public class params {
	
	Integer maxdice;
	Integer rollnum;
	Integer dicenum;
	
	public params() {
		
	}
	public params(Integer maxdice, Integer rollnum, Integer dicenum) {
		super();
		this.maxdice = maxdice;
		this.rollnum = rollnum;
		this.dicenum = dicenum;
	}
	public Integer getMaxdice() {
		return maxdice;
	}
	public void setMaxdice(Integer maxdice) {
		this.maxdice = maxdice;
	}
	public Integer getRollnum() {
		return rollnum;
	}
	public void setRollnum(Integer rollnum) {
		this.rollnum = rollnum;
	}
	public Integer getDicenum() {
		return dicenum;
	}
	public void setDicenum(Integer dicenum) {
		this.dicenum = dicenum;
	}
	
	

}
