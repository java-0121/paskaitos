package com.vcs.lects.l06.arrays.task;

import com.sun.glass.ui.Menu;

public class StringToEntity {

	/**
	 * <pre>
	 * 
	 * 		"Ona Onute 4485465456 1984 mot"
			"Vardas Pavarde 3485465456 1984 vyr"
			"Algis Antanas Žigas 3485465456 1984 vyr"
	 * 
	 * 
	 * </pre>
	 */
	// TODO perdaryt su metodu
	public Person personFromString(String person) {

		//

		String[] splited = person.split(" ");
		/**
		 * splited[0] // "Ona" splited[1] // "Onute" ...
		 * 
		 */

		Person p = new Person();

		int indexCount = 0;

		if (splited.length == 6) {

			p.setVardas(splited[indexCount++] + " " + splited[indexCount++]);

		} else {

			p.setVardas(splited[indexCount++]);
		}

		p.setPavarde(splited[indexCount++]);
		p.setAk(splited[indexCount++]);
		p.setGimMetai(Integer.parseInt(splited[indexCount++]));

		p.setLytis(Lytis.KITA);

		if ("mot".equalsIgnoreCase(splited[indexCount])) {
			p.setLytis(Lytis.MOT);
		}

		if ("vyr".equalsIgnoreCase(splited[indexCount])) {
			p.setLytis(Lytis.VYR);
		}

		return p;
	}

}
