package Spell.Vietnamese;

public enum Tone {
	UNMARK(0), GRAVE_ACCENT(1), HOOK_ABOVE(2), TILDE(3), ACCUTE_ACCENT(4), DOT_BELOW(5);
	
	private int value;
	
	private Tone (int value){
		this.value = value;
	}
	
	public int getValue(){
		return this.value;
	}
}
