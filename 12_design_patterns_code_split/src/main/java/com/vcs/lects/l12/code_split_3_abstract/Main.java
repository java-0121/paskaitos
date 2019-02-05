package com.vcs.lects.l12.code_split_3_abstract;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuomenuIsvedimas di = new DuomenuIsvedimas() {

			@Override
			public void out(String txt) {
				System.out.println(txt);

			}
		};

		di.isvesti("asd", null, "qqqq");

	}

}
