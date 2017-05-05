package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantNGHandNGRule extends Rule {

	public ConsonantNGHandNGRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am NGH, NG");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		//NGH
		if(cons_str.equals("NGH")){
			Character first_vowel = vowel.charAt(0);	
			if(!"EÊI".contains(first_vowel.toString()))
				return false;
		}
		
		//NG
		if(cons_str.equals("NG")){
			Character first_vowel = vowel.charAt(0);	
			if("EÊIY".contains(first_vowel.toString()))
				return false;
		}
		
		return true;
	}

}
