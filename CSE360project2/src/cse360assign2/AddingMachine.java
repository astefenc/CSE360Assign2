package cse360assign2;

public class AddingMachine {
	
	private int total;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value; //added to total
		
	}
	
	public void subtract (int value) {
		total = total - value; //subracted from total
		
	}
	
	public String toString () {
		return "";
	}
	
	public void clear() {
		
	}
}
