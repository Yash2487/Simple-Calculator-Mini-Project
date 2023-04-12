package com.modulus;

public class ModulusMain implements Modulus {

	@Override
	public int getModulus(int a, int b) {
		int mod = a % b;
		return mod;
	}

}
