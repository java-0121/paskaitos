package com.vcs.lects.l04.operators.tasks.test;

import com.vcs.lects.l04.operators.tasks.Bridges;

public class BridgesTest {

	public static void main(String[] args) {

		Bridges s = new Bridges();
		
		System.out.println(!s.getWay(false, true, true, false, true, true) ? "Ok" : "Fail");
		System.out.println(!s.getWay(true, false, true, true, false, true) ? "Ok" : "Fail");
		System.out.println(s.getWay(true, true, true, true, true, true) ? "Ok" : "Fail");
		
		System.out.println(s.getWay(true, true, false, false, false, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, false, false, true, true, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(true, false, true, false, true, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, true, true, true, false, false) ? "Ok" : "Fail");
		System.out.println(s.getWay(false, true, false, true, false, true) ? "Ok" : "Fail");
		
		
	}

}
