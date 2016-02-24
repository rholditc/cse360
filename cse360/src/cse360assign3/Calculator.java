
package cse360assign3;
/** Class Calculator will perform basic math functions.
 *  Variable int total is private
 *  @author Robert Holditch 
 *  @version Initial
 * */

public class Calculator {

	private int total;
	
/** Calculate constructor
 * 
 *  assigns 0 to int variable total
 *   */
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
/** getTotal retrieves total
 * 
 *  @return total which is value of expression evaluated
 *  */
	
	public int getTotal () {
		return 0;
	}
	
/** add performs the addition operation for Calculator
 * 
 *  @param value is an int which is added to total
 *  */
	
	public void add (int value) {
		
	}
	
/** subtract performs the subtraction operation for Calculator
 * 
 *  @param value is an int which is subtracted from total
 *   */	
	
	public void subtract (int value) {
		
	}
/** multiply performs the multplicaton operation for Calculator
 * 
 * @param value is an int which is multiplied by total
 */
	public void multiply (int value) {
		
	}
	
/** divide performs the division operation for Calculator
 * 	
 * @param value is an int which divides total by this value
 */
	public void divide (int value) {
		
	}

/** getHistory will store all operation performed by Calculator
 * 
 * @return 
 * 
 * */	
	public String getHistory () {
		return "";
	}
}
