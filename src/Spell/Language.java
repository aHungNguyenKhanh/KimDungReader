package Spell;

import java.util.ArrayList;

import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.VietNameseWordRules.*;

public enum Language implements RuleLoader {
	
	
	VIETNAMESE(){
		
		@Override
		public void loadRules(Spell spell) {
			ArrayList<Rule> rules = spell.getRules();
			rules.clear();
			WordAnalyzer.get_instance();
			rules.add(new ValidCharacterRule(0));
			rules.add(new ToneNumberRule(1));
			rules.add(new ValidConsonantRule(2)); 
			rules.add(new ValidVowelRule(3));
			rules.add(new TonePositionRule(4));
			rules.add(new LimitedToneRule(5));
			rules.add(new IandYRule(6));
			rules.add(new ConsonantNRule(7));
			rules.add(new ConsonantTRRule(8));
			rules.add(new ConsonantSRule(9));
			rules.add(new ConsonantRandGIRule(10));	
			rules.add(new ConsonantCandQUandKRule(11));
			rules.add(new ConsonantGandGHRule(12));
			rules.add(new ConsonantNGHandNGRule(13));
			rules.add(new SpecialUWCase(14));
		}
	};

	

}
