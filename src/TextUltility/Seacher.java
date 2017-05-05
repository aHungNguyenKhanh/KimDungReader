package TextUltility;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Seacher {
	
	private static Seacher instance;
	
	synchronized public static Seacher get_instance(){
		if(instance == null){
			instance = new Seacher();
		}
		return instance;
	}
	
	public void split_words(Text text){
		String content = text.content;
		
		Matcher m = Pattern.compile("(?:[^ -?.,!;\"\\(\\)\\[\\]\t\n]++)").matcher(content);
		
		while(m.find()){
			text.word_list.add(new TextWord(text, m.start(), m.end()));
		}
	}
	
	public ArrayList<Integer> search(Text text, String keys){
		
		ArrayList<Integer> results = new ArrayList<Integer>(); 
		Matcher m = Pattern.compile("(?:[^ -?.,!;\"\\(\\)\\[\\]\t\n]++)").matcher(keys);
		
		boolean key = m.find();
		int i = 0;
		while(key && i < text.word_list.size()){
			if(text.word_list.get(i).getString().equalsIgnoreCase(m.group())){
				results.add(i);
				key = m.find();
			}
			i++;
		}
		
		return results;
	}
}
