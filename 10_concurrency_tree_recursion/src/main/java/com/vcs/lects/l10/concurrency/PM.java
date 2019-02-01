package com.vcs.lects.l10.concurrency;

import java.util.List;

public class PM extends Thread {

	private JiraTickets jira;
	private int kaipDaznai;
	private List<Developeris> devs;

	public PM(JiraTickets jira, List<Developeris> devs,  int kaipDaznai) {
		this.jira = jira;
		this.kaipDaznai = kaipDaznai;
		this.devs = devs;
	}

	public void ataskaita() {
		// UUID.randomUUID().toString()
		try {
			// "Pamiegos" esamas thread'as
			Thread.sleep(kaipDaznai);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int dirba = 0;
		for (Developeris itSpecas : devs) {
			dirba += (itSpecas.isDirba() ? 1 : 0);
		}
		boolean futboliukas = dirba != devs.size();
		System.out.println(
				jira.getTasksAmount()+ " Dev: " + dirba + "/" + devs.size() + (futboliukas ? " futboliukas!" : ""));

	}

	@Override
	public void run() {

		while (true) {
			ataskaita();
		}

	}

}
