package com.square;

public class SquareMain implements Square {

	@Override
	public long getSquare(long num) {
		long sq = num * num;
		return sq;
	}

}
