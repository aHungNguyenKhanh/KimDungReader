package Spell.Vietnamese;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;

public class WordAnalyzer{
	
	private ArrayList<SoftReference<WordComponents>> cache_pool;
	private final int max_size = 5;
	private static WordAnalyzer instance;
	public VowelTable vowel_table;
	public ConsonantTable consonant_table;
	public ToneTable tone_table;
	
	// Singleton
	public static WordAnalyzer get_instance(){
		if(instance == null){
			instance = new WordAnalyzer();
		}
		
		return instance;
	}
	
	private WordAnalyzer(){
		this.cache_pool = new ArrayList();
		this.vowel_table = new VowelTable();
		this.consonant_table = new ConsonantTable();
		this.tone_table = new ToneTable();
	}
	
	//return null if catch hit fail
	private WordComponents get_cache(String key){
		
		for(SoftReference<WordComponents> i : cache_pool){
			if(i.get()!=null && i.get().word.toUpperCase().equals(key.toUpperCase())){
				cache_pool.remove(i);
				cache_pool.add(0, i);
				return i.get();
			}
		}
		return null;
	}
	
	synchronized private void add(WordComponents value){
		if(cache_pool.size() == max_size){
			cache_pool.remove(max_size - 1);
		}
		cache_pool.add(0, new SoftReference<WordComponents>(value));
	}
	
	//return components;
	public WordComponents analyze(String word){
		WordComponents cached = get_cache(word);
		if(cached != null){
			return cached;
		}
		
		String upper_case = word.toUpperCase();
		
		int i;
		StringBuilder consonant = new StringBuilder("");
		StringBuilder vowel = new StringBuilder("");
		
		//get consonant
		for(i = 0 ; i < upper_case.length(); i++){
			ToneVowel vw = tone_table.get(upper_case.charAt(i));
			if( vw == null)
				consonant.append(upper_case.charAt(i));
			else if(vw.vowel.equals('I') && consonant.toString().equals("G")){
				consonant.append("I");
				i++;
				break;
			}
			else if(upper_case.charAt(i) =='U' && consonant.toString().equals("Q")){
				consonant.append("U");
				i++;
				break;
			}
			else break;
		}
		// get vowel
		vowel.append(upper_case.substring(i));
		
		ToneVowel vw = tone_table.get(vowel.length() > 0 ? vowel.charAt(0) : vowel);
		if(consonant.toString().equals("GI")){
			if(vowel.toString().equals("") || vw == null)
				vowel.insert(0, upper_case.charAt(i-1));
		}
		
		if(consonant.toString().equals("QU")){
			if(vw != null){
				if("AĂE".contains(vw.vowel.toString()))
					vowel.insert(0, 'O');
				else if("ÂÊƠÔYI".contains(vw.vowel.toString()))
					vowel.insert(0, 'U');
			}		
		}
		
		//get Tone
		int tone_pos;
		Tone tone = Tone.UNMARK;
		for(tone_pos = 0; tone_pos < vowel.length(); tone_pos++){
			ToneVowel single_vowel = tone_table.get(vowel.charAt(tone_pos));
			if(single_vowel != null && single_vowel.tone != Tone.UNMARK){
				tone = single_vowel.tone;
				vowel.replace(tone_pos, tone_pos + 1, single_vowel.vowel.toString());
				break;
			}
		}
		
		if(consonant.toString().equals("QU") && vowel.toString().equals("UI"))
			vowel.replace(1, 2, "Y");
		
		WordComponents comps = new WordComponents(upper_case, new String(consonant), new String(vowel), tone_pos, tone);
		add(comps);
		return comps;
	}
	
	public static void main(String[] args) {
		WordComponents x = WordAnalyzer.get_instance().analyze("Quỳnh");
		
		if( x != null){
			System.out.println(x.word);
			System.out.println(x.consonant);
			System.out.println(x.vowel);
			System.out.println(x.tone_pos);
			System.out.println(x.tone);
		}
		else System.out.println("NULL");
		
	}

}
