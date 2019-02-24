/* Author: Aravind Narasimhan
 * Class ID: 503
 * Assignment #: 2
 * Description: basic functioning calculator
 */

package cse360assign2;


public class Calculator // class for the methods used to do simple calculations and holds total 
{

	private String history = "";	// initialize private variable for history
	
	private String output = "";		// create string to keep track of the history of operations
	
	private int total;	// private variable holding total amount
	
	public Calculator () // constructor for class Calculator
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () // method used to obtain total value 
	{
		return total;
	}
	
	public void add (int value) // method to perform addition using value parameter plus total
	{
		total = total + value;	// update total with addition of value
		
		output = " + " + value;	// update the history by showing the addition plus the value
	}
	
	public void subtract (int value) // method for subtracting value from total
	{
		total = total - value;	// update total with subtraction of value
		
		output = output + " - " + value; // update the history by showing the addition minus the value
	}
	
	public void multiply (int value) // method for multiplying total by value
	{
		total = total * value;		// update total with multiplication of value
		
		output = output + " * " + value;	// update history by showing the multiplied value
	}
	
	public void divide (int value) // method for dividing total by new value
	{
		if (value == 0)				// unless value is 0, then make total 0
		{
			total = 0;
		}
		
		else
		{
			total = total / value;	// update total with division of value
			
			output = output + " / " + value;   // update history by tacking on the divisor value
		}
	}
	
	public String getHistory () // method for returning the history of past calculations
	{
		 history = "0" + output;	// make string history show all previous outputs
		
		return history;					// return the history
	}
}