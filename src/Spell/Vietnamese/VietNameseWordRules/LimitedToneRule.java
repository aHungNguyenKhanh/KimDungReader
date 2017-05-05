package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.Tone;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class LimitedToneRule extends Rule {
	
	public LimitedToneRule(int id) {
		super(id);
		this.msg = new String("Sai dau thanh");
	}
	@Override
	public boolean checkValid(String x) {

		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String vowel = comp.vowel;
		int length = vowel.length();
		
		if(length > 1){
			String last_consonant = vowel.substring(length - 2);
			if((last_consonant.charAt(1) == 'C' || 
				last_consonant.charAt(1) == 'T' || 
				last_consonant.charAt(1) == 'P' || 
				last_consonant.equals("CH"))
					
				&& (comp.tone != Tone.ACCUTE_ACCENT && comp.tone != Tone.DOT_BELOW)
				)
				
				return false;
				
		}
		
		
		return true;
	}

}
