package Spell.Vietnamese;

import java.util.HashMap;

public class ConsonantTable extends HashMap<String, String> {
	
	public ConsonantTable(){
		load();
	}
	
	private void load(){
		
		this.put("B", "B");
		this.put("C", "C");
		this.put("CH", "CH");
		this.put("D",  "D");
		this.put("Đ","Đ");
		this.put("Ð","Ð");
		this.put("G",  "G");
		this.put("GH","GH");
		this.put("GI","GI");
		this.put("H","H");
		this.put("K","K");
		this.put("KH","KH");
		this.put("L","L");
		this.put("M","M");
		this.put("N","N");
		this.put("NG","NG");
		this.put("NGH","NGH");
		this.put("NH","NH");
		this.put("PH","PH");	
		this.put("QU","QU");
		this.put("R","R");
		this.put("S","S");
		this.put("T","T");
		this.put("TH","TH");
		this.put("TR","TR");
		this.put("V","V");
		this.put("X","X");
		
	}
}
