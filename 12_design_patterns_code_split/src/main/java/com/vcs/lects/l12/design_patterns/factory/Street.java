package com.vcs.lects.l12.design_patterns.factory;

import com.vcs.lects.l12.design_patterns.factory.auto.Audi;
import com.vcs.lects.l12.design_patterns.factory.auto.AutoFactory;
import com.vcs.lects.l12.design_patterns.factory.auto.AutoModel;
import com.vcs.lects.l12.design_patterns.factory.auto.Automobilis;
import com.vcs.lects.l12.design_patterns.factory.auto.ConstructorTroyayanHorse;
import com.vcs.lects.l12.design_patterns.factory.auto.Ford;

public class Street {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// VINRegister vin = new VINRegister();

		// Audi a = new Audi(""); // Use factory instead :)

		Automobilis f = AutoFactory.createInstance(AutoModel.AUDI);
		System.out.println("new model: " + f.getVIN());

		for (int i = 0; i < 3; i++) {
			System.out.println(AutoFactory.getInstanceFromPool().getVIN());
		}

		for (int i = 0; i < 3; i++) {
			System.out.println(AutoFactory.getInstanceFromPool().getVIN());
		}
		
		ConstructorTroyayanHorse tr = new ConstructorTroyayanHorse();
		System.out.println( tr.getWhatIWant("VIN bla bla :D").getVIN() );

	}

}
