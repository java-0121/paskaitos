package com.vcs.lects.l09.abstractions;

import com.vcs.lects.l09.abstractions.auto.Automobilis;
import com.vcs.lects.l09.abstractions.auto.BMW;
import com.vcs.lects.l09.abstractions.auto.Prius;
import com.vcs.lects.l09.abstractions.auto.Tesla;
import com.vcs.lects.l09.abstractions.engines.Elektra;
import com.vcs.lects.l09.abstractions.engines.Hibridas;

public class RealWorldv3 {

	public static void main(String[] args) {

		Prius p = new Prius();
		p.getVariklis().ikrauti();
		p.getVariklis().piltiBenzina();

		BMW<Hibridas> l = new BMW<>(new Hibridas());
		l.getVariklis().ikrauti();
		l.getVariklis().piltiBenzina();

		Tesla t = new Tesla();
		t.getVariklis().ikrauti();

		parkingOntyForEV(p);

		parkingOntyForEV(l);

		parkingOntyForEV(t);

	}

	private static void parkingOntyForEV(Automobilis<? extends Elektra> eVAuto) {

		System.out.println(eVAuto);
		System.out.println(eVAuto.getVariklis());

		eVAuto.getVariklis().ikrauti();
	}

}
