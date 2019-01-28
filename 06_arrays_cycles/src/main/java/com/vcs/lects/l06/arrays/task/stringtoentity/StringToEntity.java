package com.vcs.lects.l06.arrays.task.stringtoentity;

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

	public Person personFromString(String person) {

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

	public Person personFromString2(String person) {

		String[] splited = person.split(" ");
		int indexCount = 0;

		Person personObj = new Person();
		personObj.setVardas(splited[indexCount++] + (splited.length == 6 ? " " + splited[indexCount++] : ""));
		personObj.setPavarde(splited[indexCount++]);
		personObj.setAk(splited[indexCount++]);
		personObj.setGimMetai(Integer.parseInt(splited[indexCount++]));
		personObj.setLytis(Lytis.valueOf(splited[indexCount]));

		return personObj;
	}

	public Person personFromString3(String person) {

		String[] splited = person.split(" ");

		if (splited.length == 6) {
			return createPerson(splited[0] + " " + splited[1], splited[2], splited[3], Integer.parseInt(splited[4]),
					Lytis.valueOf(splited[5]));
		} else {
			return createPerson(splited[0], splited[1], splited[2], Integer.parseInt(splited[3]),
					Lytis.valueOf(splited[4]));
		}

	}

	private Person createPerson(String vardas, String pavarde, String ak, Integer gimMetai, Lytis lytis) {

		Person personObj = new Person();
		personObj.setVardas(vardas);
		personObj.setPavarde(pavarde);
		personObj.setAk(ak);
		personObj.setGimMetai(gimMetai);
		personObj.setLytis(lytis);
		return personObj;
	}

}
