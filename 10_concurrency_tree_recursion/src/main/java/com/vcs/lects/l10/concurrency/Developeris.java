package com.vcs.lects.l10.concurrency;

public class Developeris extends Thread {

	private JiraTickets jira;
	private int kaipDaznai;
	private boolean dirba = false;

	public Developeris(JiraTickets jira, int kaipDaznai) {
		this.jira = jira;
		this.kaipDaznai = kaipDaznai;
	}

	public boolean isDirba() {
		return dirba;
	}

	public void suprogramuotiIstaisyti() {
		// UUID.randomUUID().toString()
		try {
			// "Pamiegos" esamas thread'as
			Thread.sleep(kaipDaznai);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		dirba = jira.resolve();
	}

	@Override
	public void run() {

		while (true) {
			suprogramuotiIstaisyti();
		}

	}

}
