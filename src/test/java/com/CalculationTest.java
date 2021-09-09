package com;

import static org.junit.Assert.*;
import cal.CalculationPart;

import org.junit.Test;

public class CalculationTest {

	@Test
	public void test() {
		CalculationPart  c=new CalculationPart();
		int res=c.add(10, 20);
		if(res==30)
		{
			System.out.println("test success");
		}
		else
		{
			fail("test fail");
		}
		
	}

}
