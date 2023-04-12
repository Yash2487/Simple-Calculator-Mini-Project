package com.average;

public class AverageMain implements Average {

	@Override
	public double getAverage(double a, double b, double c, double d, double e) {
		double total = (a + b + c + d + e);
		System.out.println("Total Sum is>> " + total);
		double avg = total / 5;
		return avg;
	}

}
