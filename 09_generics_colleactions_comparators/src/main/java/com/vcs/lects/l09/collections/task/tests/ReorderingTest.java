package com.vcs.lects.l09.collections.task.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.vcs.lects.l09.collections.task.IReordering;
import com.vcs.lects.l09.collections.task.Mokinys;

public class ReorderingTest {

	public static void main(String... sad) {

		// TODO isirasykit savo klae
		IReordering task = null;

		ReorderingTest t = new ReorderingTest();
		t.run(task);

	}

	private void run(IReordering task) {
		run(task, 100000);
	}

	private void run(IReordering task, int mokiniuKiekis) {
		System.out.println("Starting...");

		// Init data
		Random rnd = new Random();

		int count = mokiniuKiekis;
		List<Mokinys> data = new ArrayList<>();

		for (int i = 0; i < count; i++) {
			data.add(new Mokinys("" + i, getVidurkis(rnd, i)));
		}
		data.add(new Mokinys("sad", 10.0));

		Map<String, List<Mokinys>> mokiniai = new HashMap<>();
		mokiniai.put("sd", data);

		// Call

		long timeAmount = System.currentTimeMillis();
		List<List<Mokinys>> result = task.getReordered(mokiniai);
		timeAmount = System.currentTimeMillis() - timeAmount;

		// Output

		System.out.println("Counter : " + count);

		for (List<Mokinys> list : result) {
			System.out.println("- " + list.size());
			printFirst(5, list);
		}
		System.out.println("Done in " + timeAmount + " ms / " + (timeAmount / 1000) + " s");

	}

	private void printFirst(int i, List<Mokinys> list) {
		int max = (list.size() > i ? i : list.size());
		System.out.print("       ");
		for (int j = 0; j < max; j++) {
			System.out.print("" + list.get(j).getVidurkis() + "; ");
		}
		System.out.print(" ...");
		System.out.println();

	}

	private double getVidurkis(Random rnd, int i) {
		rnd.setSeed(Integer.MAX_VALUE - i);
		return ((double) rnd.nextInt(101)) / 10;
	}

}
