package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantGandGHRule extends Rule {
	
	public ConsonantGandGHRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am G,GH");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		//GH
		if(cons_str.equals("GH")){
			Character first_vowel = vowel.charAt(0);	
			if(!"EÊI".contains(first_vowel.toString()))
				return false;
		}
		
		//G
		if(cons_str.equals("G")){
			Character first_vowel = vowel.charAt(0);	
			if("EÊIY".contains(first_vowel.toString()))
				return false;
		}
		
		return true;
	}

}
