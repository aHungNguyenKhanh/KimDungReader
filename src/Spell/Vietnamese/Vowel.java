package Spell.Vietnamese;


// Vowel that dont have tone
public class Vowel {
	
	protected String content;
	private int[] tone_pos = new int[]{-1, -1};
			
	public Vowel(String content, int[] tone_pos){
		this.content = content;
		int length = tone_pos.length > 2 ? 2 : tone_pos.length;
		for(int i = 0; i < length; i++){
			this.tone_pos[i] = tone_pos[i];
		}
	}
	
	public boolean check_tone_pos(int pos){
		for(int i : this.tone_pos){
			if(i == pos)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] argv){
		
		Vowel vowel = new Vowel("OÃN", new int[]{1});
	}
	
	
}
