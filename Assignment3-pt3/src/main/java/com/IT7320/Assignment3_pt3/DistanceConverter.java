package com.IT7320.Assignment3_pt3;

public class DistanceConverter implements CalcInterface {

	CalcInterface ci;
	
	public double meterToKm(double val) {
		// TODO Auto-generated method stub
		return val/1000;
	}
	
	public double kmToMeter(double val) {
		// TODO Auto-generated method stub
		return val*1000;
	}

	public double kmToMiles(double val) {
		// TODO Auto-generated method stub
		return val/1.609;
	}

	public double milesToKm(double val) {
		// TODO Auto-generated method stub
		return val*1.609;
	}


	
	
}
