package TextUltility;

public class TextWord {

	private Text parent_text;
	private int begin;
	private int end;
	
	public String getString(){
		return parent_text.content.substring(begin, end);
	}
	
	public TextWord(Text text, int begin, int offset) {
		this.parent_text = text;
		this.begin = begin;
		this.end = offset;
	}
	
}
