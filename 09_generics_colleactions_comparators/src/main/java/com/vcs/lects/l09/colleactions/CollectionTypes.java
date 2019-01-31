package com.vcs.lects.l09.colleactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionTypes {

	public void arrayList() {

		Integer[] arr = new Integer[0];

		// List - interfeisas
		// ArrayList - jo implementacija
		List<Integer> list = new ArrayList<>();

		// Prideti reiksmes
		list.add(44);
		list.add(7);

		// 7
		int a = list.get(1);

		// 2
		a = list.size();

		boolean f = list.isEmpty();

		f = list.contains(7);

		list.clear();

		// 0
		a = list.size();

		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);

		// index, element <- prideda bet ne prie galo
		list.add(3, 6);

		Integer aaa = 5;
		list.remove(aaa);

		list.remove(1);

		int buvusiReiksme = list.set(3, 3);

		list.add(aaa);
		list.add(0, aaa);

		a = list.indexOf(aaa); // -1

		for (Integer integer : list) {
			System.out.println(integer);
		}

		System.out.println();

		/*
		 * 5 4 6 2 1 5
		 */
		List<Integer> subList = new ArrayList<>();
		subList.add(6);
		subList.add(88);

		list.addAll(subList);

		list.remove(list.size() - 1);

		System.out.println(list.containsAll(subList));

		list.removeAll(subList);

		for (Integer integer : list) {
			System.out.println(integer);
		}

	}

	public void sets() {

		// Neturi indeksu, neislaiko eiliskumo
		Set<Integer> s = new HashSet<>();

		s.add(1);
		s.add(5);
		s.add(4);
		s.add(3);
		s.add(2);
		s.add(1);

		for (Integer manoTipas : s) {
			System.out.println(manoTipas);
		}

	}

	public void maps() {

		Map<String, String> m = new HashMap<>();

		m.put("1", "vienas");
		m.put("2", "two");
		m.put("2", "du");
		m.put("3", "trys");
		m.put("1", "one");
		m.put(null, "null");
		m.put(null, "asdasdasd");

		m.get("3"); // trys

		for (String val : m.values()) {
			System.out.println(val);
		}

		m.size();

		String neegzistuojantis = m.get("asdsa"); // null

		for (String key : m.keySet()) {
			System.out.println(key + " : " + m.get(key));
		}

		m.containsKey("1"); // true
		m.containsValue("null"); // true

		
		
		
	}

}
