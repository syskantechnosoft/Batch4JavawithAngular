package com.revature.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd1() {
		Calculator c = new Calculator();
		assertEquals(13, c.add(5, 8));
	}

	@Test
	public void testAdd2() {
		Calculator c = new Calculator();
		assertEquals(27, c.add(2, 25));
	}

	@Test
	public void testAdd3() {
		Calculator c = new Calculator();
		assertEquals(-18, c.add(-25, 7));
	}

	@Test
	public void testAdd4() {
		Calculator c = new Calculator();
		assertEquals(180, c.add(200, -20));
	}

	@Test
	
	public void testAdd5() {
		Calculator c = new Calculator();
		assertEquals(-710, c.add(-303, -407));
	}
}
