package com.vcs.lects.l10.tree;

public class VilniusMain {

	public static void main(String[] args) {

		Element vilnius = new Element(ElementType.MIESTAS, "Vilnius");

		Element naujininkai = new Element(ElementType.MIKRORAJONAS, "Naujinikai");
		Element nVilniausg = new Element(ElementType.GATVE, "Vilniaus g.");
		Element nViltiesg = new Element(ElementType.GATVE, "Vilties g.");

		Element nn12 = new Element(ElementType.NAMAS, "12");
		Element nn13 = new Element(ElementType.NAMAS, "13");
		Element nn121 = new Element(ElementType.NAMAS, "121");
		Element nn5131 = new Element(ElementType.NAMAS, "5131");

		Element nnButas = new Element(ElementType.BUTAS, "57");

		nn121.getElements().add(nnButas);

		nVilniausg.getElements().add(nn12);
		nVilniausg.getElements().add(nn121);
		nViltiesg.getElements().add(nn13);
		nViltiesg.getElements().add(nn5131);

		naujininkai.getElements().add(nVilniausg);
		naujininkai.getElements().add(nViltiesg);

		vilnius.getElements().add(naujininkai);

		VilniusMain vm = new VilniusMain();

		System.out.println(vm.searchByName(vilnius, "  	 1     "));
		System.out.println();
		
		System.out.println(vm.countElementsBy(vilnius, "  	 1     "));
		System.out.println();

	}

	public int countElementsBy(Element el, String searchQuery) {

		// TODO
		return 0;
	}

	public ElementType searchByName(Element el, String searchQuery) {

		if (el.getName().toLowerCase().startsWith(searchQuery.trim().toLowerCase())) {
			return el.getType();
		}

		for (Element childElement : el.getElements()) {

			ElementType childElementType = searchByName(childElement, searchQuery);

			if (childElementType != null) {
				return childElementType;
			}

		}

		return null;

	}

}
