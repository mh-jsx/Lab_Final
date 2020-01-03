package calculator;

/***
 * 
 * @author Mudasir Habib
 *
 */
public class Calculator {
	
	/***
	 * findMax method find the maximumm number from 3 numbers that are passed in arguments
	 * @param first number: num1 having type integer
	 * @param second number: num2 having type integer
	 * @param third number: num3 having type integer
	 * @return it'll return maximum of three numbers
	 */
	public int findMax(int num1, int num2, int num3) {
		int[] arr = { num1, num2, num3 };   
		int max = 0;   
		for (int i = 1; i < arr.length; i++) {    
			if (arr[i] > max)     
				max = arr[i];
			}   
		return max;
		}  
	
	
	/**
	 * Square method calculates the square of a integer , which is greater than 0 and less than 10
	 * @param integer type parameter
	 * @return it'll return integer type of square of number
	 * @throws IllegalArgumentException when the input integer is not between 0 and 10
	 */	
	public int square(int num) throws IllegalArgumentException {
		int result = 0;   
		if (num > 0 && num < 10) {
			result = num * num;
			} 
		else {
			throw new IllegalArgumentException();
		}
		return result;  
		} 
	
	/**
	 * Cube method calculates the cube of a int type , which is greater than 0
	 * @param int type parameter
	 * @return it'll return int type of cube of number
	 * @throws IllegalArgumentException when the input integer is not greater than 0
	 */
	public int cube(int number) throws IllegalArgumentException {
		int cubeResult = 0;
		if (number > 0) {
			cubeResult = number * number * number;
		}
		return cubeResult;
	}
	/**
	 * labfinal
	 */
}
