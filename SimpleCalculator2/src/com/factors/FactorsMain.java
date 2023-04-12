package com.factors;

public class FactorsMain implements Factors {

	@Override
	public void getFactors(int num) {
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + ",");
			}
		}

	}

}
