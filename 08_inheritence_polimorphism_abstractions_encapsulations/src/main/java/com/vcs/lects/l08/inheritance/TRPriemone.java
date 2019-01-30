package com.vcs.lects.l08.inheritance;

public class TRPriemone {

	private String variklis;
	private String spalva;
	
	static {
		System.out.println("static anon");
	}
	

//	 public TRPriemone() {
//		 System.out.println("trPriemone konstructor");
//	 }

	{
		System.out.println("trPriemone anon");
	}

	public TRPriemone(String variklis, String spalva) {

		System.out.println("trPriemone konstructor");

		this.variklis = variklis;
		this.spalva = spalva;
	}

	public TRPriemone(String variklis) {
		this.variklis = variklis;
		this.spalva = "Pilka";
	}

	public String judeti() {
		return "judu kaip " + getClass().getSimpleName() + "  nuo A iki B";
	}

	public String getVariklis() {
		return variklis;
	}

	public void setVariklis(String variklis) {
		this.variklis = variklis;
	}

	public String getSpalva() {
		return spalva;
	}

	// public void setSpalva(String spalva) {
	// this.spalva = spalva;
	// }

}
