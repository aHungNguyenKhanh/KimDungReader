package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class ValidConsonantRule extends Rule {

	public ValidConsonantRule(int id) {
		super(id);
		this.msg = new String("Phu am dau ko hop le");
	}
	
	@Override
	public boolean checkValid(String x) {
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		String cons_str = comp.consonant;
		String cons = WordAnalyzer.get_instance().consonant_table.get(cons_str);
		
		return (cons != null || cons_str.equals("")) ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
