package test.suites;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.calsi.Calculator;

public class SubstractionTest {

	
	@Tag("dev")
	@Test
	void subTest() {

		Calculator cal = new Calculator();
		
		assertEquals(0, cal.sub(5, 5));
		
	}

}
