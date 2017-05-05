package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantCandQUandKRule extends Rule {
	
	private String[] qu_diphthongs = new String[]{"OA", "OĂ", "OE", "OO", "UÂ", "UÊ", "UƠ", "UY"};
	
	public ConsonantCandQUandKRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am C,K,QU");
	}
	
	@Override
	public boolean checkValid(String x) {
		
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		//K
		if(cons_str.equals("K")){
			Character first_vowel = vowel.charAt(0);	
			if(!"EÊIY".contains(first_vowel.toString()))
				return false;
		}
		
		//C
		if(cons_str.equals("C")){
			Character first_vowel = vowel.charAt(0);
			if("EÊIY".contains(first_vowel.toString()))
				return false;
			
			if(vowel.length() > 2){
				String diphthong = vowel.substring(0, 2);
				
				for(String i : qu_diphthongs){
					if(i.equals(diphthong))
						return false;
				}
			}
		}
		
		//QU
		if(x.equalsIgnoreCase("QUỐC"))
			return true;
		
		if(cons_str.equals("QU")){
			
			if(vowel.length() > 2){
				String diphthong = vowel.substring(0, 2);
				
				for(String i : qu_diphthongs){
					if(i.equals(diphthong))
						return true;
				}
				
				return false;
				
			}
		}
		
		return true;
	}

}
