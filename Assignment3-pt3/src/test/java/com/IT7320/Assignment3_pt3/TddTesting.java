package com.IT7320.Assignment3_pt3;


import static org.junit.Assert.*;

import org.junit.*;
import org.mockito.Mockito;

public class TddTesting{
	
	CalcInterface ci;
	DistanceConverter dc;
	double expected;
	double actual;
	
	@Before
	public void setUp() throws Exception {
		dc = new DistanceConverter();
	}
	
	@After
	public void tearDown() throws Exception {
		dc = null;
	}
	
	@Test
	public void mToKmTest() {
		assertEquals(2, dc.meterToKm(2000.0), 0.1);
	}
	
	
	@Test
	public void KmToMTest() {
		assertEquals(2000.0, dc.kmToMeter(2.0), 0.1);
	}
	
	@Test
	public void KmToMilesTest() {
		assertEquals(2.0/1.609, dc.kmToMiles(2.0), 0.1);
	}
	
	
	@Test
	public void milesToKmTest() {
		assertEquals(2.0*1.609, dc.milesToKm(2.0), 0.1);
	}
	
	
	
	
	
	
	
	
	
	

}
