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
		int actual = calculatorClassObj.findMax(-15, -10, -20);
		assertEquals(-10, actual);
	}
	
	
}
