package com.vcs.lects.l07.inheritance;

public class Tesla extends TRPriemone {

	private int akumTalpa;

	public void ikrauti() {
		System.out.println("ryjam elektra...");
	}

	public int getAkumTalpa() {
		return akumTalpa;
	}

	public void setAkumTalpa(int akumTalpa) {
		this.akumTalpa = akumTalpa;
	}

	@Override
	public String toString() {
		return "Tesla " + akumTalpa + " kWh " + getVariklis() + " / " + getSpalva();
	}

}
