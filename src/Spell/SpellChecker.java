package Spell;

import java.util.ArrayList;

public class SpellChecker {
	
	private Spell spell;
	
	public SpellChecker(Language lang){
		this.spell = new Spell(lang);
		this.spell.prepare();
	}
	
	public boolean check(String word){
		ArrayList<Rule> rules_list = spell.getRules();
		
		for(Rule i : rules_list){
			if(i.checkValid(word) == false){
				i.show();
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		
		SpellChecker checker = new SpellChecker(Language.VIETNAMESE);
		
		System.out.println(checker.check("Hoặt"));
		System.out.println(checker.check("chích"));
		System.out.println(checker.check("hoay"));
		System.out.println(checker.check("phoanh"));
		System.out.println(checker.check("hải"));
		System.out.println(checker.check("quốc"));
		System.out.println(checker.check("giem"));
		
	}
}
