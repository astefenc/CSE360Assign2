/*
 * Alyssa Stefencavage 
 * Class number: 70641
 * Assignment 2
 * This is the adding machine class that will add, subtract,
 * and return the total. To implement the toString method 
 * I added strings for each method that updates until the toString is called
 * This file is committed to my repository on git hub.
 */
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
		output = output + " + " + value; //add to output
		
	}
	
	public void subtract (int value) {
		total = total - value; //subtracted from total
		output = output + " - " + value; //add to output

		
	}
	
	public String toString () {
		return output; //returns the string of the history of calculations
	}
	
	public void clear() {
		
	}
}
