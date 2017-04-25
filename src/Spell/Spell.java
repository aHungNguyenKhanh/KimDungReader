package Spell;

import java.util.ArrayList;

public class Spell {
	
	private ArrayList<Rule> rules;
	private Language lang;
	
	
	public Spell(Language lang) {
		this.rules = new ArrayList<Rule>();
		this.lang = lang;
	}
	
	public void prepare(){
		lang.loadRules(this);
	}
	
	public ArrayList<Rule> getRules(){
		return rules;
	}
	
}
