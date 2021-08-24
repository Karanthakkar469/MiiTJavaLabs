package MiiTJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator2TestSub {

	@Test

	public void testsub() {
		cal2 C2 = new cal2();
		C2.num1 = 5;
		C2.num2 = 5;
		assertEquals(0, C2.sub());

	}
}
