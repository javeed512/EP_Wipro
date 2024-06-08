package test.suites;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.calsi.Calculator;

public class MultiplicationTest {

	@Tag("production")
	@Test
	void mulTest() {
		Calculator cal = new Calculator();
		
		assertEquals(25, cal.mul(5, 5));
	}

}
