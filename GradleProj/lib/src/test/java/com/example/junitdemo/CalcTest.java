package com.example.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalcTest {

	static Calc calc;//null
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeAll");
		calc = new Calc();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("AfterAll");
		calc=null;
		
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("BeforeEach");
	}
	

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("AfterEach");
	}

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	@Test
	void testAdd() {
		int sum = calc.add(10,20); //30
		assertEquals(30, sum);
		
	}
	@Test
	void testSub() {
		int sum = calc.sub(10,20); //30
		assertEquals(-10, sum);
		
	}
}
