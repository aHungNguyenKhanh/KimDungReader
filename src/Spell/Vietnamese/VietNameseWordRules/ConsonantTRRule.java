package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ConsonantTRRule extends Rule {

	private String[] inval_diphthongs = new String[]{"OA", "OĂ", "OE", "OO", "UÊ", "UƠ"};
	
	public ConsonantTRRule(int id) {
		super(id);
		this.msg = new String("Sai chinh ta phu am TR");
	}
	
	@Override
	public boolean checkValid(String x) {

		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String vowel = comp.vowel;
		
		if(cons_str.equals("TR") && vowel.length() >= 2){
			String diph = vowel.substring(0, 2);
			for(String i : inval_diphthongs){
				if(i.equals(diph))
					return false;
			}
		}
		
		return true;
	}

}
