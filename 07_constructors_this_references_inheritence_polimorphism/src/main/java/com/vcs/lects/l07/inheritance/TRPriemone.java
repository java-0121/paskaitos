package com.vcs.lects.l07.inheritance;

public class TRPriemone {

	private String variklis;
	private String spalva;

	public void judetiNuoAIkiB() {
		System.out.println("judu kaip " + getClass().getSimpleName() + "  nuo A iki B");
	}

	public void judetiNuoAIkiB(String autoName) {
		System.out.println("judu kaip " + autoName + "  nuo A iki B");
	}

	public void judetiNuoAIkiB(Integer speed) {
		System.out.println("judu taip greit kad net " + speed + "  nuo A iki B");
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

	public void setSpalva(String spalva) {
		this.spalva = spalva;
	}

}
