package com.capgemini.sample.JunitExamples;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	@Test
	public void call() {
		com.capgemini.sample.JunitExamples.Calc ob = 
				new com.capgemini.sample.JunitExamples.Calc();
		assertEquals(4, ob.add(22, 33));
	}

	@Test
	public void sub() {
		com.capgemini.sample.JunitExamples.Calc ob = 
				new com.capgemini.sample.JunitExamples.Calc();
		assertEquals(4, ob.sub(33, 28));
	}
}
