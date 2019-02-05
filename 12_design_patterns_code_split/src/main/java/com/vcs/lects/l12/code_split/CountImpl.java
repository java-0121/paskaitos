package com.vcs.lects.l12.code_split;

public class CountImpl implements OutHandler{

	private int counter = 0;

	@Override
	public void out(String txt) {
		counter++;
	}

	public int getCounter() {
		return counter;
	}

}
