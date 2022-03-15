package com.okdevtv.tdd.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComputerTest {

	@Test
	public void testAdd() {
		Computer computer = new Computer();
		int result = computer.add(1, 2);
		assertEquals(3, result);
	}
	
	// testSubtract
	@Test
	public void testSubtract() {
		Computer computer = new Computer();
		int result = computer.subtract(1, 2);
		assertEquals(-1, result);
	}
	
	// testMultiply
	@Test
	public void testMultiply() {
		Computer computer = new Computer();
		int result = computer.multiply(1, 2);
		assertEquals(2, result);
	}
	
	// testDivide
	@Test
	public void testDivide() {
		Computer computer = new Computer();
		int result = computer.divide(1, 2);
		assertEquals(0, result);
	}
	
}
