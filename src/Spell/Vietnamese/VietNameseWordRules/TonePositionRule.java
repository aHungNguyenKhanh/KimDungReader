package Spell.Vietnamese.VietNameseWordRules;

import Spell.Rule;
import Spell.Vietnamese.Tone;
import Spell.Vietnamese.Vowel;
import Spell.Vietnamese.WordAnalyzer;
import Spell.Vietnamese.WordComponents;

public class TonePositionRule extends Rule {

	public TonePositionRule(int id) {
		super(id);
		this.msg = new String("Vi tri dau thanh khong hop le");
	}
	
	@Override
	public boolean checkValid(String x) {
		
		WordComponents comp = WordAnalyzer.get_instance().analyze(x);
		
		Vowel vowel = WordAnalyzer.get_instance().vowel_table.get(comp.vowel);
		
		
		return (vowel != null && vowel.check_tone_pos(comp.tone_pos) || comp.tone == Tone.UNMARK) ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
