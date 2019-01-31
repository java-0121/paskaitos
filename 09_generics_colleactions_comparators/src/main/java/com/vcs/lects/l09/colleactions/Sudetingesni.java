package com.vcs.lects.l09.colleactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudetingesni {

	private Map<String, Map<String, String>> translate = new HashMap<>();

	private Map<String, String> translate2 = new HashMap<>();

	{

		translate.put("LT", new HashMap<>());
		translate.put("EN", new HashMap<>());

		translate.get("LT").put("button.ok", "Sutinku");
		translate.get("LT").put("button.cancel", "Nesutinku");

		translate.get("EN").put("button.ok", "Agree");
		translate.get("EN").put("button.cancel", "Not agree");

		translate2.put("LT_button.ok", "Sutinku");
		translate2.put("LT_button.cancel", "nesutinku");
		translate2.put("EN_button.ok", "Agree");
		translate2.put("EN_button.cancel", "Not agree");
	}

	void arrayList() {

		List<List<String>> failai = new ArrayList<>();

		failai.add(new ArrayList<>());
		failai.add(new ArrayList<>());

		failai.get(0).add("prma eilute");
		failai.get(0).add("antra eilute");

		failai.get(1).add("2 prma eilute");
		failai.get(1).add("2 antra eilute");

		List<String> visos = new ArrayList<>();

		visos.addAll(failai.get(0));
		visos.addAll(failai.get(1));

	}

	public String getTRanslate(String lang, String code) {
		return translate.get(lang).get(code);
	}

	public String getTRanslate2(String lang, String code) {
		return translate2.get(lang + "_" + code);
	}

}
