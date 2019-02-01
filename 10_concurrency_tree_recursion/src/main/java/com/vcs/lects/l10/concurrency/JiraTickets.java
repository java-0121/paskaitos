package com.vcs.lects.l10.concurrency;

import java.util.ArrayList;
import java.util.List;

public class JiraTickets {

	private static int taskNumber = 0;

	private List<String> tasks = new ArrayList<>();

	public void addNew() {
		tasks.add("" + ++taskNumber);
	}

	public int getTasksAmount() {
		return tasks.size();
	}

	public boolean resolve() {

		if (!tasks.isEmpty()) {
			tasks.remove(0);
			return true;
		}

		return false;
	}
	
	

}
