
package cse360assign3;
/** Class Calculator will perform basic math functions.
 *  Variable int total is private
 *  @author Robert Holditch 
 *  @version Initial
 * */

public class Calculator {

	private int total;
	private String history;
	
/** Calculate constructor
 * 
 *  assigns 0 to int variable total
 *   */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
/** getTotal retrieves total
 * 
 *  @return total which is value of expression evaluated
 *  */
	
	public int getTotal () {
		return total;
	}
	
/** add performs the addition operation for Calculator
 * 
 *  @param value is an int which is added to total
 *  */
	
	public void add (int value) {
		total = total + value;
		String str = Integer.toString(value);
		String add = " + ";
		add+=str;
		history+=add;
		
	}
	
/** subtract performs the subtraction operation for Calculator
 * 
 *  @param value is an int which is subtracted from total
 *   */	
	
	public void subtract (int value) {
		total = total - value;
		String str = Integer.toString(value);
		String add = " - ";
		add+=str;
		history+=add;
		
	}
/** multiply performs the multplicaton operation for Calculator
 * 
 * @param value is an int which is multiplied by total
 */
	public void multiply (int value) {
		total = total * value;
		String str = Integer.toString(value);
		String add = " * ";
		add+=str;
		history+=add;
		
	}
	
/** divide performs the division operation for Calculator
 * 	
 * @param value is an int which divides total by this value
 */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total/value;
		String str = Integer.toString(value);
		String add = " / ";
		add+=str;
		history+=add;
	}

/** getHistory will store all operation performed by Calculator
 * 
 * @return 
 * 
 * */	
	public String getHistory () {
		return history;
	}
}
