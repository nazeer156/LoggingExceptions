package com.indus.training.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.indus.training.domain.CacliInput;
import com.indus.training.domain.CalciOutput;
import com.indus.training.impl.Calculator;

public class TestCaclulator {

	
	Calculator calci = null;
	@Before
	public void setUp() throws Exception {
		calci = new Calculator();
	}

	@After
	public void tearDown() throws Exception {
	   calci = null;
	}

	@Test
	public void testAdd() {
		CacliInput calin = new CacliInput();
		calin.setParam1(11.0);
		calin.setParam2(12.0);
		System.out.println(calci.add(calin).getResult());
	}

	@Test
	public void testDiv() {
		CacliInput calin = new CacliInput();
		calin.setParam1(11.0);
		calin.setParam2(0.0);
		System.out.println(calci.div(calin).getResult());
	}

}
