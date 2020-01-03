package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {
	Calculator calculatorClassObj;
	@Test
	public void CalculatorTest1() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.findMax(1, -2, 2);
		assertEquals(2, actual);
	}
	
	@Test
	public void CalculatorTest2() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.findMax(-5, 0, -10);
		assertEquals(0, actual);
	}
	
	@Test
	public void CalculatorTest3() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.findMax(15, 10, -20);
		assertEquals(10, actual);
	}
	
	@Test
	public void squareTest1() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.square(2);
		assertEquals(4, actual);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void squareTest2() {
		calculatorClassObj = new Calculator();
		calculatorClassObj.square(-10);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void squareTest3() {
		calculatorClassObj = new Calculator();
		calculatorClassObj.square(10);
	}
	
	@Test
	public void cubeTest1() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.cube(3);
		assertEquals(27, actual);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void cubeTest2() {
		calculatorClassObj = new Calculator();
		calculatorClassObj.square(-10);
	}
	
	@Test
	public void cubeTest3() {
		calculatorClassObj = new Calculator();
		int actual = calculatorClassObj.cube(4);
		assertEquals(64, actual);
	}
	
}
