package com.org.kazmi.lab06;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test_Calculator {
	Calculator c = new Calculator();
	@Test
	public void test() {
		assertEquals(5,c.add(3, 2));
//		fail("Not yet implemented");
	}
}
