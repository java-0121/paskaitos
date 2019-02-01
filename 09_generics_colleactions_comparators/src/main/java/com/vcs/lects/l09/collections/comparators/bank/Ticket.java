package com.vcs.lects.l09.collections.comparators.bank;

public class Ticket {

	private static int numberCounter = 0;

	private int number;

	private boolean vip;

	private Op op;

	public Ticket(boolean vip, Op op) {
		number = ++numberCounter;
		this.vip = vip;
		this.op = op;

	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return "" + number + " " + op + " " + (vip ? "VIP" : "");
	}

	public boolean isVip() {
		return vip;
	}

	public void setVip(boolean vip) {
		this.vip = vip;
	}

	public Op getOp() {
		return op;
	}

	public void setOp(Op op) {
		this.op = op;
	}

}
