package com.even.or.odd;

public class EvenOrOddMain implements EvenOrOdd {

	@Override
	public void getEvenOrOddNumber(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " >> is Even Number");
		} else {
			System.out.println(num + " >> is Odd Number");
		}

	}

}
