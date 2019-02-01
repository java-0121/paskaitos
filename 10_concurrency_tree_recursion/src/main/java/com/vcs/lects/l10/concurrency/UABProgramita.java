package com.vcs.lects.l10.concurrency;

import java.util.ArrayList;
import java.util.List;

public class UABProgramita {

	public static void main(String[] args) {

		JiraTickets jira = new JiraTickets();

		List<Testuotojas> qa = new ArrayList<>();

		qa.add(new Testuotojas(jira, 20));
		qa.add(new Testuotojas(jira, 10));
		qa.add(new Testuotojas(jira, 6));
		qa.add(new Testuotojas(jira, 2));
		qa.add(new Testuotojas(jira,1));
		
		qa.add(new Testuotojas(jira, 20));
		qa.add(new Testuotojas(jira, 10));
		qa.add(new Testuotojas(jira, 6));
		qa.add(new Testuotojas(jira, 2));
		qa.add(new Testuotojas(jira,1));


		for (Testuotojas testuotojas : qa) {
			testuotojas.start();
		}

		List<Developeris> devs = new ArrayList<>();
		devs.add(new Developeris(jira, 40));
		devs.add(new Developeris(jira, 20));
		devs.add(new Developeris(jira, 4));
		devs.add(new Developeris(jira, 2));
		devs.add(new Developeris(jira, 1));
		
		devs.add(new Developeris(jira, 40));
		devs.add(new Developeris(jira, 20));
		devs.add(new Developeris(jira, 4));
		devs.add(new Developeris(jira, 2));
		devs.add(new Developeris(jira, 1));

		for (Developeris developeris : devs) {
			developeris.start();
		}

		PM pm = new PM(jira, devs, 1000);

		pm.start();

	}

}
