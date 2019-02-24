/* Author: Aravind Narasimhan
 * Class ID: 503
 * Assignment #: 2
 * Description: basic functioning calculator
 */

package cse360assign2;


public class Calculator // class for the methods used to do simple calculations and holds total 
{

	private int total;	// private variable holding total amount
	
	public Calculator () // constructor for class Calculator
	{
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () // method used to obtain total value 
	{
		return 0;
	}
	
	public void add (int value) // method to perform addition using value parameter plus total
	{
		total = total + value;
	}
	
	public void subtract (int value) // method for subtracting value from total
	{
		total = total - value;
	}
	
	public void multiply (int value) // method for multiplying total by value
	{
		total = total * value;
	}
	
	public void divide (int value) // method for dividing total by new value
	{
		if (value == 0)				// unless value is 0, then make total 0
		{
			total = 0;
		}
		
		else
		{
			total = total / value;
		}
	}
	
	public String getHistory () // method for returning the history of past calculations
	{
		return "";
	}
}