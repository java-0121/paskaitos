package com.vcs.lects.l07.objects.references.memleak;

public class Main {

	public static void main(String[] args) {

		// On your own risk :)
		Main m = new Main();

		while (true) {
			m.memLeak();
		}

	}

	public void memLeak() {

		Bilekas3 b = new Bilekas3();

		Kazkas2 k = new Kazkas2();

		References3 r = new References3();

		b.setKazkas(k);
		k.setRef3(r);
		r.setBileKas(b);
	}

}
