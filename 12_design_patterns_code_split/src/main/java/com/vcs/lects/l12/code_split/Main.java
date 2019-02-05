package com.vcs.lects.l12.code_split;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuomenuIsvedimas di = new DuomenuIsvedimas();

		OutHandler simpl = new SysOutImpl();
		// DefaultOutImpl def = new DefaultOutImpl();
		// CountImpl countImpl = new CountImpl();

		di.isvesti(new OutHandler() {

			@Override
			public void out(String txt) {
				System.err.println("man patinka raudonas labiau " + txt);

			}
		}, "asd", null, "qqqq");

		// System.out.println(countImpl.getCounter());

	}

}
