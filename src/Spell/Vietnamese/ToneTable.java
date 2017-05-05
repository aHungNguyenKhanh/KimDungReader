package Spell.Vietnamese;

import java.util.ArrayList;
import java.util.HashMap;



public class ToneTable extends HashMap<Character, ToneVowel> {
	
	public ToneTable(){
		load();
	}
	
	private void load(){
		
		this.put('A', new ToneVowel('A', Tone.UNMARK));
		this.put('À', new ToneVowel('A', Tone.GRAVE_ACCENT));
		this.put('Á', new ToneVowel('A', Tone.ACCUTE_ACCENT));
		this.put('Ả', new ToneVowel('A', Tone.HOOK_ABOVE));
		this.put('Ã', new ToneVowel('A', Tone.TILDE));
		this.put('Ạ', new ToneVowel('A', Tone.DOT_BELOW));
		
		
		this.put('Ă', new ToneVowel('Ă', Tone.UNMARK));
		this.put('Ằ', new ToneVowel('Ă', Tone.GRAVE_ACCENT));
		this.put('Ắ', new ToneVowel('Ă', Tone.ACCUTE_ACCENT));
		this.put('Ẳ', new ToneVowel('Ă', Tone.HOOK_ABOVE));
		this.put('Ẵ', new ToneVowel('Ă', Tone.TILDE));
		this.put('Ặ', new ToneVowel('Ă', Tone.DOT_BELOW));
		
		this.put('Â', new ToneVowel('Â', Tone.UNMARK));
		this.put('Ầ', new ToneVowel('Â', Tone.GRAVE_ACCENT));
		this.put('Ấ', new ToneVowel('Â', Tone.ACCUTE_ACCENT));
		this.put('Ẩ', new ToneVowel('Â', Tone.HOOK_ABOVE));
		this.put('Ẫ', new ToneVowel('Â', Tone.TILDE));
		this.put('Ậ', new ToneVowel('Â', Tone.DOT_BELOW));
	
		this.put('E', new ToneVowel('E', Tone.UNMARK));
		this.put('È', new ToneVowel('E', Tone.GRAVE_ACCENT));
		this.put('É', new ToneVowel('E', Tone.ACCUTE_ACCENT));
		this.put('Ẻ', new ToneVowel('E', Tone.HOOK_ABOVE));
		this.put('Ẽ', new ToneVowel('E', Tone.TILDE));
		this.put('Ẹ', new ToneVowel('E', Tone.DOT_BELOW));
		
		this.put('Ê', new ToneVowel('Ê', Tone.UNMARK));
		this.put('Ề', new ToneVowel('Ê', Tone.GRAVE_ACCENT));
		this.put('Ế', new ToneVowel('Ê', Tone.ACCUTE_ACCENT));
		this.put('Ể', new ToneVowel('Ê', Tone.HOOK_ABOVE));
		this.put('Ễ', new ToneVowel('Ê', Tone.TILDE));
		this.put('Ệ', new ToneVowel('Ê', Tone.DOT_BELOW));
		
		this.put('I', new ToneVowel('I', Tone.UNMARK));
		this.put('Ì', new ToneVowel('I', Tone.GRAVE_ACCENT));
		this.put('Í', new ToneVowel('I', Tone.ACCUTE_ACCENT));
		this.put('Ỉ', new ToneVowel('I', Tone.HOOK_ABOVE));
		this.put('Ĩ', new ToneVowel('I', Tone.TILDE));
		this.put('Ị', new ToneVowel('I', Tone.DOT_BELOW));
		
		this.put('O', new ToneVowel('O', Tone.UNMARK));
		this.put('Ò', new ToneVowel('O', Tone.GRAVE_ACCENT));
		this.put('Ó', new ToneVowel('O', Tone.ACCUTE_ACCENT));
		this.put('Ỏ', new ToneVowel('O', Tone.HOOK_ABOVE));
		this.put('Õ', new ToneVowel('O', Tone.TILDE));
		this.put('Ọ', new ToneVowel('O', Tone.DOT_BELOW));
		
		this.put('Ô', new ToneVowel('Ô', Tone.UNMARK));
		this.put('Ồ', new ToneVowel('Ô', Tone.GRAVE_ACCENT));
		this.put('Ố', new ToneVowel('Ô', Tone.ACCUTE_ACCENT));
		this.put('Ổ', new ToneVowel('Ô', Tone.HOOK_ABOVE));
		this.put('Ỗ', new ToneVowel('Ô', Tone.TILDE));
		this.put('Ộ', new ToneVowel('Ô', Tone.DOT_BELOW));
		
		this.put('Ơ', new ToneVowel('Ơ', Tone.UNMARK));
		this.put('Ờ', new ToneVowel('Ơ', Tone.GRAVE_ACCENT));
		this.put('Ớ', new ToneVowel('Ơ', Tone.ACCUTE_ACCENT));
		this.put('Ở', new ToneVowel('Ơ', Tone.HOOK_ABOVE));
		this.put('Ỡ', new ToneVowel('Ơ', Tone.TILDE));
		this.put('Ợ', new ToneVowel('Ơ', Tone.DOT_BELOW));
		
		this.put('U', new ToneVowel('U', Tone.UNMARK));
		this.put('Ù', new ToneVowel('U', Tone.GRAVE_ACCENT));
		this.put('Ú', new ToneVowel('U', Tone.ACCUTE_ACCENT));
		this.put('Ủ', new ToneVowel('U', Tone.HOOK_ABOVE));
		this.put('Ũ', new ToneVowel('U', Tone.TILDE));
		this.put('Ụ', new ToneVowel('U', Tone.DOT_BELOW));
		
		this.put('Ư', new ToneVowel('Ư', Tone.UNMARK));
		this.put('Ừ', new ToneVowel('Ư', Tone.GRAVE_ACCENT));
		this.put('Ứ', new ToneVowel('Ư', Tone.ACCUTE_ACCENT));
		this.put('Ử', new ToneVowel('Ư', Tone.HOOK_ABOVE));
		this.put('Ữ', new ToneVowel('Ư', Tone.TILDE));
		this.put('Ự', new ToneVowel('Ư', Tone.DOT_BELOW));
		
		this.put('Y', new ToneVowel('Y', Tone.UNMARK));
		this.put('Ỳ', new ToneVowel('Y', Tone.GRAVE_ACCENT));
		this.put('Ý', new ToneVowel('Y', Tone.ACCUTE_ACCENT));
		this.put('Ỷ', new ToneVowel('Y', Tone.HOOK_ABOVE));
		this.put('Ỹ', new ToneVowel('Y', Tone.TILDE));
		this.put('Ỵ', new ToneVowel('Y', Tone.DOT_BELOW));
	}
	
	public static void main(String[] args) {
		
		ToneTable table = new ToneTable();
		ToneVowel vw = table.get('Ữ');
		System.out.println(vw.vowel);
		System.out.println(vw.tone);

	}

}
