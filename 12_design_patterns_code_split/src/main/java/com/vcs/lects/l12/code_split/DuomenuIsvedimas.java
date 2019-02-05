package com.vcs.lects.l12.code_split;

public class DuomenuIsvedimas {

	public void isvesti(OutHandler out, String... strings) {

		for (String txt : strings) {
			if (txt != null && !txt.isEmpty()) {
				out.out(txt);
			}
		}
	}

}
