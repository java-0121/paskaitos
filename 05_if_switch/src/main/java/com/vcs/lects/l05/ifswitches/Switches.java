package com.vcs.lects.l05.ifswitches;

public class Switches {

	public void sw() {

	}

	private String mood(int month) {

		switch (month) {
		case 12:

		case 1:
		case 2:
			return vasarosIsdetalizavimas(month);

		case 3:
		case 4:
		case 5: {
			return "pavasaris ";
		}
		case 6:
		case 7:
		case 8:
			return "vasara ";
		case 9:
		case 10:
		case 11:
			return "ruduo ";
		}
		return "pasimete laike :) ";
	}

	private String vasarosIsdetalizavimas(int month) {
		int abc = 3;
		int d = 6 + month;
		switch (d) {
		case 3:
			System.out.println("asdsadsa");
			break;

		default:
			break;
		}
		abc++;
		abc += d;
		System.out.println("asdsadsa");
		return "ziema ";
	}

}
