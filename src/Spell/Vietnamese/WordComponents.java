package Spell.Vietnamese;

public class WordComponents {
	
	public String word;
	public String consonant;
	public String vowel;
	public int tone_pos; //-1 if unmark
	public Tone tone;
	
	public WordComponents(String word, String consonant, String vowel, int tone_pos, Tone tone){
		this.word = word.toUpperCase();
		this.consonant = consonant.toUpperCase();
		this.vowel = vowel.toUpperCase();
		this.tone_pos = tone_pos;
		this.tone = tone;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
