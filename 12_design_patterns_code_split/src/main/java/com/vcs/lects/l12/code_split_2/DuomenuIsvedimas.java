package com.vcs.lects.l12.code_split_2;

public class DuomenuIsvedimas {

	public void isvesti(OutHandler out, OutEventListener listener, String... strings) {

		listener.onBeginEvent("Prasidejo apdorojimas...");

		for (String txt : strings) {

			listener.onIterateItem(txt);

			if (txt != null && !txt.isEmpty()) {
				listener.onIterateValid(txt);
				out.onValid(txt);
			} else {
				listener.onIterateNotValid(txt);
				out.onInvalid();
			}
		}
		listener.onEndEvent("... pasibaige apdorojimas");
	}

}
