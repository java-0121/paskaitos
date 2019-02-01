package com.vcs.lects.l10.concurrency;

import java.util.ArrayList;
import java.util.List;

public class JiraTickets {

	private static int taskNumber = 0;

	private List<String> tasks = new ArrayList<>();

	public void addNew() {
		synchronized (tasks) {
			tasks.add("" + ++taskNumber);
		}
	}

	public int getTasksAmount() {
		return tasks.size();
	}

	public boolean resolve() {

		synchronized (tasks) {
			Integer index = tasks.size();

			if (!tasks.isEmpty()) {
				tasks.remove(index - new Integer(1));
				return true;
			}

			return false;
		}

	}

}
