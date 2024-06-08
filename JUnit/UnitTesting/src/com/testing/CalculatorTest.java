package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import com.calsi.Calculator;

@DisplayName("Calculator Testing")
class CalculatorTest {

	static Calculator cal = null;

	@BeforeAll
	public static void beforeAll() {

		System.out.println("Execute Before All Test case only once");

		cal = new Calculator();

	}
	
	
	@BeforeEach
	public  void  before() {
		
		System.out.println("before each");
		
	}
	
	@AfterEach
	public void after() {
		
		System.out.println("after each");
		
		
	}
	
	

	@Tag("G1")
	@DisplayName("Test Add")
	@Test
	void testAdd() {

		assertNotNull(cal);

		int actual = cal.add(5,4);

		assertEquals(9, actual);
		
		System.out.println("Add Tested");

	}

	//@Disabled
	@Tag("G1")
	@Test
	void testSub() {

		int actual = cal.sub(10, 4);

		assertEquals(6, actual);

		assertNotEquals(0, actual);
		
		System.out.println("Sub Tested");

	}

	@Test
	void testMul() {

		int actual = cal.mul(5, 4);

		assertTrue(actual > 0);
		
		System.out.println("Multiply Tested");

	}

	@AfterAll
	public static void afterAll() {

		System.out.println("Executed afterAll()  after all test cases done...");

	}
	
	
	/*
	 * @ExtendWith(RandomParametersExtension.class)
	 * 
	 * @Test void test(@Random int i) { // ... }
	 */
	
	

}
