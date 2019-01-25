package com.vcs.lects.l05.ifswitches;

public class DayOfTheWeek {

	public String weekDayToStr(int i) {
		
		
		if (i == 1) return "pirm";
		if (i == 2) return "an";
		if (i == 3) return "tr";
		if (i == 4) return "k";
		if (i == 5) return "pn";
		if (i == 6) return "ss";
		if (i == 7) return "sk";
		
		return "???";
	}
	
	public String weekDayTypeToStr(int i) {
		
		if (i > 0 && i < 6) return "dd"; 
		
		if (i == 6 || i == 7) return "savaitgalis"; 
		
		return "???";
	}

}
