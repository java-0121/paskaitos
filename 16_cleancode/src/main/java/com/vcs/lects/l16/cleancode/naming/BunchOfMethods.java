package com.vcs.lects.l16.cleancode.naming;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BunchOfMethods {

	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {

		Collection<List<Mokinys>> list = mokiniai.values();
		List<Mokinys> result = new ArrayList<>();
		Map<String, List<Mokinys>> byAvg = new HashMap<>();

		// FIXME refactor

		for (List<Mokinys> elementList : list) {
			for (Mokinys mokinys : elementList) {
				result.add(mokinys);
			}
		}
		for (int i = 0; i < 10; i++) {
			byAvg.put("" + i, new LinkedList<>());
		}
		// dedam i krepseliu pagal pajeguma
		for (int i = 0; i < 10; i++) {
			List<Mokinys> listForRemove = new ArrayList<>();
			for (Mokinys mokinys : result) {
				if (mokinys.getVidurkis() < (i + 1)) {
					byAvg.get(Integer.toString(i)).add(mokinys);
					listForRemove.add(mokinys);
				}
			}
			result.removeAll(listForRemove);
		}
		byAvg.get("" + (9)).addAll(result);
		Set<String> keys = byAvg.keySet();
		List<List<Mokinys>> result1 = new ArrayList<>();
		for (String key : keys) {
			if (!byAvg.get(key).isEmpty()) {
				result1.add(byAvg.get(key));
			}
		}
		return result1;
	}

	public List<List<Mokinys>> getReordered2(Map<String, List<Mokinys>> mokiniai) {
		int kiekisReziu = 10;
		List<List<Mokinys>> result = new ArrayList<>();
		for (int vidurkis = 0; vidurkis < kiekisReziu; vidurkis++) {
			result.add(vidurkis, new ArrayList<>());
			iteruojamPerVisusMok(mokiniai.values(), vidurkis, kiekisReziu, result);
		}

		return result;
	}

	void iteruojamPerVisusMok(Collection<List<Mokinys>> listofLists, int vidurkis, int kiekisReziu,
			List<List<Mokinys>> result) {
		for (List<Mokinys> list : listofLists) {
			for (Mokinys mokinys : list) {
				mokinysPagalPajeguma(mokinys, vidurkis, kiekisReziu, result);
			}
		}
	}

	void mokinysPagalPajeguma(Mokinys mokinys, int vidurkis, int kiekisReziu, List<List<Mokinys>> result) {
		boolean desimtukinikai = mokinys.getVidurkis() == kiekisReziu && vidurkis == kiekisReziu - 1;
		boolean pazimysPagalRezi = mokinys.getVidurkis() >= vidurkis && mokinys.getVidurkis() < vidurkis + 1;
		if (pazimysPagalRezi || desimtukinikai) {
			result.get(vidurkis).add(mokinys);
		}
	}

}

class Mokinys {

	private String vardas;
	private double vidurkis;

	public Mokinys() {

	}

	public Mokinys(String vardas, double vidurkis) {
		this.vardas = vardas;
		this.vidurkis = vidurkis;
	}

	public String getVardas() {
		return vardas;
	}

	public void setVardas(String vardas) {
		this.vardas = vardas;
	}

	public double getVidurkis() {
		return vidurkis;
	}

	public void setVidurkis(double vidurkis) {
		this.vidurkis = vidurkis;
	}

}