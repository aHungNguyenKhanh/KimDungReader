package TextUltility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import Spell.Language;
import Spell.SpellChecker;

public class Reader {
	
	private static Reader instance;
	
	synchronized public static Reader get_instance(){
		if(instance == null){
			instance = new Reader();
		}
		return instance;
	}
	
	//only .txt file
	public Text read(String dir) throws IOException{
		if(dir.length() > 4 && dir.substring(dir.length() - 4, dir.length()).equals(".txt")){
			File f = new File(dir);
			String content = (new Scanner(f)).useDelimiter("//Z").next();
			Text text = new Text(content);
			return text;
		}
		return null;
	}
	
	public static void main(String[] args) {
		try{
			SpellChecker checker = new SpellChecker(Language.VIETNAMESE);
			Text text = Reader.get_instance().read("C://Users//Hung Nguyen//workspace//DecentReader//src//Kim Dung//Thiên Long Bát Bộ//Chúc Bạn Mấn Vân Hữu Cựu Minh.txt");
//			text = new Text("Soa xoét hoi họ hè há hẩm hè hào hoa");
			Seacher.get_instance().split_words(text);
			for(TextWord i : text.word_list){
				String w = i.getString();
				if(!checker.check(w))
					System.out.println(w);
			}
			
			ArrayList<Integer> rs = Seacher.get_instance().search(text, "Long giết");
			for( int i : rs){
				System.out.println("...");
				System.out.println(text.word_list.get(i-1).getString());
				System.out.println(text.word_list.get(i).getString());
				System.out.println(text.word_list.get(i+1).getString());
				System.out.println("...");
			}
			
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
