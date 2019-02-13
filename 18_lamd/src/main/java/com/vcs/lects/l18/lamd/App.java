package com.vcs.lects.l18.lamd;

import java.util.List;
import java.util.function.Consumer;

public class App {

	private Integer sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	void skaiciuok(List<Integer> data) {

		data.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				sum += t;

			}
		});
	}

	void skaiciuok2(List<Integer> data) {

		// Su lokaliu neveik, nes lokalaus kintamojo gyvavimo ciklas bus trumpesnis nei
		// sukurtos implementacijos su liamda
		// Integer sum = 0;

		data.forEach(t -> sum += t);
	}

}
