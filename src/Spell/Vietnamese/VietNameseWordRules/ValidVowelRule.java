package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.Vowel;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ValidVowelRule extends Rule {
	
	public ValidVowelRule(int id) {
		super(id);
		this.msg = new String("Van khong hop le");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String vowel_str = comp.vowel;
		if(x.equalsIgnoreCase("QUÊN") || x.equalsIgnoreCase("QUỆT"))
			return true;
		
		Vowel cons = WordAnalyzer.get_instance().vowel_table.get(vowel_str);
		
		return cons != null ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
