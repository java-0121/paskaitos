package com.vcs.lects.l12.design_patterns.factory.auto;

public class ConstructorTroyayanHorse {

	public Audi getWhatIWant(String myVIN) {

		return new Audi(myVIN);

	}

}
