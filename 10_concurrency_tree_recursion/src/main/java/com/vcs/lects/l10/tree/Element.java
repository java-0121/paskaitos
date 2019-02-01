package com.vcs.lects.l10.tree;

import java.util.ArrayList;
import java.util.List;

public class Element {

	private List<Element> elements = new ArrayList<Element>();

	private ElementType type;
	private String name;

	public Element(ElementType type, String name) {
		this.type = type;
		this.name = name;
	}

	public List<Element> getElements() {
		return elements;
	}

	public ElementType getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
