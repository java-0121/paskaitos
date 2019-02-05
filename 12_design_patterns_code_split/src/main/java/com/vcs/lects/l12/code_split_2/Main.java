package com.vcs.lects.l12.code_split_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DuomenuIsvedimas di = new DuomenuIsvedimas();

		di.isvesti(new OutHandler() {

			@Override
			public void onValid(String txt) {
				System.out.println(txt);

			}

			@Override
			public void onInvalid() {

			}

		}, new OutEventListener() {

			@Override
			public void onIterateValid(String item) {

			}

			//
			// @Override
			// public void onIterateNotValid(String item) {
			// System.out.println("Main.main(...).new OutEventListener()
			// {...}.onIterateNotValid()");
			//
			// }
			//
			// @Override
			// public void onIterateItem(String item) {
			// System.out.println("Main.main(...).new OutEventListener()
			// {...}.onIterateItem()");
			//
			// }
			//
			@Override
			public void onEndEvent(String msg) {
				System.out.println("Main.main(...).new OutEventListener() {...}.onEndEvent()");

			}

			//
			@Override
			public void onBeginEvent(String msg) {
				System.out.println("Main.main(...).new OutEventListener() {...}.onBeginEvent()");

			}

			@Override
			public void onIterateItem(String item) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onIterateNotValid(String item) {
				// TODO Auto-generated method stub

			}

		}, "asd", null, "qqqq", "Blogi duomenys :(");

		// System.out.println(countImpl.getCounter());

	}

}
