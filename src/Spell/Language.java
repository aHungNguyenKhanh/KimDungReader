package Spell;

import java.util.ArrayList;

import Spell.Vietnamese.ValidCharacterRule;

public enum Language implements RuleLoader {
	
	
	VIETNAMESE(){
		
		@Override
		public void loadRules(Spell spell) {
			ArrayList<Rule> rules = spell.getRules();
			rules.clear();
			
			rules.add(new ValidCharacterRule(0));
			
		}
	};

	

}
