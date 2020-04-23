package com.cb.covid;

import org.junit.Test;

import com.cb.covid.ArithmeticOperations;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {

	@Test
	public void testAdd()
	{	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);	
	}

}
