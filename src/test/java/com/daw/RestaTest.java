package com.daw;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RestaTest {
	
	@BeforeEach
	public void setUp() throws Exception {}

	@AfterEach
	public void tearDown() throws Exception {}

	@Test
	public void test() {
		assertEquals(1,Resta.restar(2, 1));
	}
}
