package com.simplilearn.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AuthenticationTest {
	private Authentication ac;

	@Before
	public void setUp()  {
		ac= new Authentication();
		System.out.println("login started");
	}

	@After
	public void tearDown() throws Exception {
		ac=null;
		System.out.println("Login Closed");
	}

	@Test
	public void aucTest1() {
		assertEquals(true,ac.authentication("vanshita","vanshita@123"));
		
	}
	
	@Test
	public void aucTest2() {
		assertEquals(false,ac.authentication("vanshita","fhvndjncmxkcm"));
	}
	
	@Test
	public void aucTest3() {
		assertEquals(false,ac.authentication("vghhhfrtyh","vanshita@123"));
	}
	
	@Test
	public void aucTest4() {
		assertEquals(false,ac.authentication("jnvyfch","hfvycuh8ceo"));
	}

}
