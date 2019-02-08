package com.vcs.lects.l09.collections.task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class GiedriusImpl implements IReordering {

	@Override
	public List<List<Mokinys>> getReordered(Map<String, List<Mokinys>> mokiniai) {

		Map<String, List<Mokinys>> listasPo = new HashMap<>();
		listasPo.put("[0 - 1)", new ArrayList<>());
		listasPo.put("[1 - 2)", new ArrayList<>());
		listasPo.put("[2 - 3)", new ArrayList<>());
		listasPo.put("[3 - 4)", new ArrayList<>());
		listasPo.put("[4 - 5)", new ArrayList<>());
		listasPo.put("[5 - 6)", new ArrayList<>());
		listasPo.put("[6 - 7)", new ArrayList<>());
		listasPo.put("[7 - 8)", new ArrayList<>());
		listasPo.put("[8 - 9)", new ArrayList<>());
		listasPo.put("[9 - 10]", new ArrayList<>());

		for (Map.Entry<String, List<Mokinys>> entry : mokiniai.entrySet()) {

			for (int i = 0; i < entry.getValue().size(); i++) {

				double average = entry.getValue().get(i).getVidurkis();

				if (average >= 0 && average < 1) {
					listasPo.get("[0 - 1)").add(entry.getValue().get(i));
				} else if (average >= 1 && average < 2) {
					listasPo.get("[1 - 2)").add(entry.getValue().get(i));
				} else if (average >= 2 && average < 3) {
					listasPo.get("[2 - 3)").add(entry.getValue().get(i));
				} else if (average >= 3 && average < 4) {
					listasPo.get("[3 - 4)").add(entry.getValue().get(i));
				} else if (average >= 4 && average < 5) {
					listasPo.get("[4 - 5)").add(entry.getValue().get(i));
				} else if (average >= 5 && average < 6) {
					listasPo.get("[5 - 6)").add(entry.getValue().get(i));
				} else if (average >= 6 && average < 7) {
					listasPo.get("[6 - 7)").add(entry.getValue().get(i));
				} else if (average >= 7 && average < 8) {
					listasPo.get("[7 - 8)").add(entry.getValue().get(i));
				} else if (average >= 8 && average < 9) {
					listasPo.get("[8 - 9)").add(entry.getValue().get(i));
				} else if (average >= 9 && average <= 10) {
					listasPo.get("[9 - 10]").add(entry.getValue().get(i));
				}

			}

		}

		Map<String, List<Mokinys>> treeMap = new TreeMap<String, List<Mokinys>>(listasPo);
		Set<String> treeKeys = treeMap.keySet();

		for (String rezis : treeKeys) {

			System.out.print(rezis);

			for (Mokinys vardas : treeMap.get(rezis)) {

				System.out.print(" " + vardas.getVardas() + " ");

			}
			System.out.println(" ");
		}

		return null;
	}

}
