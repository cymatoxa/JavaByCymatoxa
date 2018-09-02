import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringCalculatorTest {
	@Test
	public void dsfg() {
		int result = StringCalculator.add(null);
		assertEquals(0, result);
	}

	@Test
	public void test2() {
		int result = StringCalculator.add("");
		assertEquals(0, result);
	}

	@Test
	public void test3() {
		int result = StringCalculator.add("1");
		assertEquals(0, result);
	}

	@Test
	public void test4() {
		int result = StringCalculator.add("1,2");
		assertEquals(0, result);
	}
}
