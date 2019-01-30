package com.vcs.lects.l08.inheritance;

public abstract class Tesla extends TrPriemoneImpl {

	{
		System.out.println("anon");
	}

	public Tesla() {
		super("Elektra", "Juoda");
		// super tik pirma eilute konstruktoriuje
		// ikrauti();
		System.out.println("tesla konstructor");
		akumTalpa = 20;
		ikrauti();
	}

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
