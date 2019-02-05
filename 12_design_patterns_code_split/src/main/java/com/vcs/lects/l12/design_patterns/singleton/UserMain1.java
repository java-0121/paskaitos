package com.vcs.lects.l12.design_patterns.singleton;

public class UserMain1 {

	public void userAction() {

		DataResource dr = DataResource.getInstance();

		dr.add("23432");
		dr.add("23432");

	}

}
