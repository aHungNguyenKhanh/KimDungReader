package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantRandGIRule extends Rule {
	
	private String[] inval_diphthongs = new String[]{"OA", "OĂ", "OE", "UÂ", "UÊ", "UƠ", "UY"};
	
	public ConsonantRandGIRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am GI hoac R");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		if(x.equalsIgnoreCase("GÌN"))
			return true;
		
		
		if((cons_str.equals("GI") || cons_str.equals("R"))&& vowel.length() >= 2){
			
			if(cons_str.equals("GI") && vowel.charAt(0)=='I' && vowel.charAt(1)!='Ê')
				return false;
			
			String diph = vowel.substring(0, 2);
			for(String i : inval_diphthongs){
				if(i.equals(diph))
					return false;
			}
		}
		
		return true;
	}

}
