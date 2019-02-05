package com.vcs.lects.l12.design_patterns.singleton;

import java.util.ArrayList;
import java.util.List;

public class DataResource {

	private List<String> strings = new ArrayList<>();

	private static DataResource instance; // singleton

	private DataResource() { // use getInstance() instead constructor

	}

	public static DataResource getInstance() { // factory

		if (instance == null) { // lazy initialization, singleton
			instance = new DataResource();
		}

		return instance;

	}

	public void add(String string) {
		strings.add(string);
	}

	public void remove(String string) {
		strings.remove(string);
	}

	public Object[] getAll() {
		return strings.toArray();
	}

}
