package com.vcs.lects.l12.design_patterns.factory.auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.vcs.lects.l12.design_patterns.factory.VINRegister;

/**
 * Lets create some cars :)
 */
public class AutoFactory {

	private static List<Automobilis> auto = new ArrayList<>();

	static {

		for (int i = 0; i < 5; i++) {
			auto.add(createInstance(AutoModel.AUDI));
		}

		for (int i = 0; i < 10; i++) {
			auto.add(createInstance(AutoModel.FORD));
		}

	}

	public static Automobilis getInstanceFromPool() {

		Random rnd = new Random();

		return auto.get(rnd.nextInt(auto.size()));
	}

	public static Automobilis createInstance(AutoModel model) {

		System.out.println("creating..." + model);
		VINRegister r = new VINRegister();
		switch (model) {
		case AUDI:
			return new Audi("audi-" + r.generateUnicVIN());

		case FORD:
			return new Ford("ford-" + r.generateUnicVIN());
		default:
			throw new RuntimeException("No case for: " + model);
		}

	}

}
