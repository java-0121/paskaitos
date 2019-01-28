package com.vcs.lects.l06.arrays.task;

public class Main {

	
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
	public static void main(String[] args) {
		StringToEntity strToEntity = new StringToEntity();
		Person pp = strToEntity.personFromString("Ona asd Onute 4485465456 1984 mot");
		System.out.println(pp.getVardas());

	}

}
