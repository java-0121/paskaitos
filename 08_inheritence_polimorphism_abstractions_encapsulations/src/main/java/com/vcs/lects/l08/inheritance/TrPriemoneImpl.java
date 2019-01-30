package com.vcs.lects.l08.inheritance;

public abstract class TrPriemoneImpl implements TtPriemone {

	private String variklis;
	private String spalva;

	static {
		System.out.println("static anon");
	}

	// public TRPriemone() {
	// System.out.println("trPriemone konstructor");
	// }

	{
		System.out.println("trPriemone anon");
	}

	public TrPriemoneImpl(String variklis, String spalva) {

		System.out.println("trPriemone konstructor");

		this.variklis = variklis;
		this.spalva = spalva;
	}

	public TrPriemoneImpl(String variklis) {
		this.variklis = variklis;
		this.spalva = "Pilka";
	}

	@Override
	public String judeti() {
		return "judu kaip " + getClass().getSimpleName() + "  nuo A iki B";
	}

	@Override
	public String getVariklis() {
		return variklis;
	}

	@Override
	public void setVariklis(String variklis) {
		this.variklis = variklis;
	}

	@Override
	public String getSpalva() {
		return spalva;
	}

	// public void setSpalva(String spalva) {
	// this.spalva = spalva;
	// }

}
