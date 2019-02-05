package com.vcs.lects.l12.design_patterns.factory.auto;

public abstract class Automobilis {

	private String vIN;

	/**
	 * Use AutoFactory instead constructor
	 * 
	 * @see AutoFactory
	 * 
	 */
	Automobilis(String vin) {
		this.vIN = vin;
	}

	public String getVIN() {
		return vIN;
	}

	// public void setVIN(String vIN) {
	// this.vIN = vIN;
	// }

}
