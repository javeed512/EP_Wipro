package com.testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.calsi.Calculator;

class CalculatorTest {

	
	Calculator cal = new Calculator();
	@Test
	void testAdd() {

		
		assertNotNull(cal);

		int actual = cal.add(4, 5);

		assertEquals(9, actual);
	
	}

	@Test
	void testSub() {
		
		
		int  actual =	cal.sub(10, 4);
		
		assertEquals(6, actual);
		
		assertNotEquals(0, actual);
		

	}

	@Test
	void testMul() {
		
		int actual = cal.mul(5, 4);
		
		assertTrue( actual > 0);
		
	
		

	}
	
	

}
