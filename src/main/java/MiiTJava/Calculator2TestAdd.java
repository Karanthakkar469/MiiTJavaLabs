package MiiTJava;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculator2TestAdd {

	@Test
	public void testAdd() {
		cal2 C2 = new cal2();
		C2.num1 = 5;
		C2.num2 = 5;
		assertEquals(10, C2.add());

	}

}
