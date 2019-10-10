package cse360assign2;
import java.lang.String;
public class AddingMachine {
	
	private int total;
	private String output = "0";
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total = total + value; //added to total
		output = output + " + " + value;
		
	}
	
	public void subtract (int value) {
		total = total - value; //subtracted from total
		output = output + " - " + value;

		
	}
	
	public String toString () {
		return output;
	}
	
	public void clear() {
		
	}
}
