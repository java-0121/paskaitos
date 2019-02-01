package com.vcs.lects.l10.concurrency;

public class Testuotojas extends Thread {

	private JiraTickets jira;
	private int kaipDaznai;

	public Testuotojas(JiraTickets jira, int kaipDaznai) {
		this.jira = jira;
		this.kaipDaznai = kaipDaznai;
	}

	public void sukurtiTicketa() {
		// UUID.randomUUID().toString()
		try {
			
			// "Pamiegos" esamas thread'as
			Thread.sleep(kaipDaznai);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		jira.addNew();
	}

	@Override
	public void run() {

		while (true) {
			sukurtiTicketa();
		}

	}

}
