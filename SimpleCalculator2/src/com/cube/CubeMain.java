package com.cube;

public class CubeMain implements Cube {

	@Override
	public long getCube(long num) {
		long cub = num * num * num;
		return cub;
	}

}
