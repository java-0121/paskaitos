package com.vcs.lects.l12.code_split_3_abstract;

public abstract class DuomenuIsvedimas {

	public void isvesti(String... strings) {

		for (String txt : strings) {
			if (txt != null && !txt.isEmpty()) {
				out(txt);
			}
		}
	}

	public abstract void out(String txt);

}
