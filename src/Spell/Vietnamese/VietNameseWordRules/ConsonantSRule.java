package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantSRule extends Rule {
	
	private String[] special = new String[]{"SOÁI", "SOÁT", "SOẠT", "SOẠNG", "SOẠN", "SOÁN", "SUẤT"};
	private String[] inval_diphthongs = new String[]{"OA", "OĂ", "OE", "UÂ", "UÊ", "UƠ"};
	
	public ConsonantSRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am S");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		if(cons_str.equals("S") && vowel.length() >= 2){
			
			for(String i : special){
				if(x.equalsIgnoreCase(i))
					return true;
			}
			
			String diph = vowel.substring(0, 2);
			for(String i : inval_diphthongs){
				if(i.equals(diph))
					return false;
			}
		}
		
		return true;
	}

}
