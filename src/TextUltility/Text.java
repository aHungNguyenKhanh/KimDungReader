package TextUltility;

import java.util.ArrayList;

public class Text{
	
	public String content;
	public ArrayList<TextWord> word_list;
	
	public Text(String content) {
		this.content = content;
		this.word_list = new ArrayList<TextWord>();
	}
	
	
}
