package Spell.Vietnamese;

import java.util.HashMap;

public class VowelTable extends HashMap<String, Vowel> {
	
	public VowelTable(){
		load();
	}
	
	private void load(){
		
		//monophthong
		this.put("A", new Vowel("A", new int[]{0}));
		this.put("E", new Vowel("E", new int[]{0}));
		this.put("I", new Vowel("I", new int[]{0}));
		this.put("O", new Vowel("O", new int[]{0}));
		this.put("�", new Vowel("�", new int[]{0}));
		this.put("�", new Vowel("�", new int[]{0}));
		this.put("U", new Vowel("U", new int[]{0}));
		this.put("�", new Vowel("�", new int[]{0}));
		this.put("Y", new Vowel("Y", new int[]{0}));
		this.put("�", new Vowel("�", new int[]{0}));
		
		//diphthongs 
		this.put("OA", new Vowel("OA", new int[]{0,1}));
		this.put("OE", new Vowel("OE", new int[]{0,1}));
		this.put("UY", new Vowel("UY", new int[]{0,1}));
		this.put("U�", new Vowel("U�", new int[]{1}));
		this.put("U�", new Vowel("U�", new int[]{1}));		
		this.put("IA", new Vowel("IA", new int[]{0}));
		this.put("UA", new Vowel("UA", new int[]{0}));
		this.put("�A", new Vowel("�A", new int[]{0}));
		this.put("AI", new Vowel("AI", new int[]{0}));
		this.put("OI", new Vowel("OI", new int[]{0}));
		this.put("�I", new Vowel("�I", new int[]{0}));
		this.put("�I", new Vowel("�I", new int[]{0}));
		this.put("UI", new Vowel("UI", new int[]{0}));
		this.put("�I", new Vowel("�I", new int[]{0}));
		this.put("AO", new Vowel("AO", new int[]{0}));
		this.put("EO", new Vowel("EO", new int[]{0}));
		this.put("AU", new Vowel("AU", new int[]{0}));
		this.put("�U", new Vowel("�U", new int[]{0}));
		this.put("�U", new Vowel("�U", new int[]{0}));
		this.put("IU", new Vowel("IU", new int[]{0}));
		this.put("�U", new Vowel("�U", new int[]{0}));
		this.put("AY", new Vowel("AY", new int[]{0}));
		this.put("�Y", new Vowel("�Y", new int[]{0}));
		
		//triphthongs 
		this.put("UYA", new Vowel("UYA", new int[]{1}));
		this.put("OAI", new Vowel("OAI", new int[]{1}));
		this.put("U�I", new Vowel("U�I", new int[]{1}));
		this.put("��I", new Vowel("��I", new int[]{1}));
		this.put("OAO", new Vowel("OAO", new int[]{1}));
		this.put("OEO", new Vowel("OEO", new int[]{1}));
		this.put("I�U", new Vowel("I�U", new int[]{1}));
		this.put("UYU", new Vowel("UYU", new int[]{1}));
		this.put("��U", new Vowel("��U", new int[]{1}));
		this.put("Y�U", new Vowel("Y�U", new int[]{1}));
		this.put("OAY", new Vowel("OAY", new int[]{1}));
		this.put("U�Y", new Vowel("U�Y", new int[]{1}));
		
		// with consonant 'c'
		this.put("AC", new Vowel("AC", new int[]{0}));
		this.put("�C", new Vowel("�C", new int[]{0}));
		this.put("�C", new Vowel("�C", new int[]{0}));
		this.put("EC", new Vowel("EC", new int[]{0}));
		this.put("I�C", new Vowel("I�C", new int[]{1}));
		this.put("OC", new Vowel("OC", new int[]{0}));
		this.put("OAC", new Vowel("OAC", new int[]{1}));
		this.put("O�C", new Vowel("O�C", new int[]{1}));
		this.put("OOC", new Vowel("OOC", new int[]{1}));
		this.put("�C", new Vowel("�C", new int[]{0}));
		this.put("UC", new Vowel("UC", new int[]{0}));
		this.put("U�C", new Vowel("U�C", new int[]{1}));
		this.put("�C", new Vowel("�C", new int[]{0}));
		this.put("��C", new Vowel("��C", new int[]{1}));
		
		//with consonant 'ch'
		this.put("ACH", new Vowel("ACH", new int[]{0}));
		this.put("�CH", new Vowel("�CH", new int[]{0}));
		this.put("ICH", new Vowel("ICH", new int[]{0}));
		this.put("OACH", new Vowel("OACH", new int[]{1}));
		this.put("U�CH", new Vowel("U�CH", new int[]{1}));
		this.put("UYCH", new Vowel("UYCH", new int[]{1}));
		
		//with consonant 'm'
		this.put("AM", new Vowel("AM", new int[]{0}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("EM", new Vowel("EM", new int[]{0}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("IM", new Vowel("IM", new int[]{0}));
		this.put("I�M", new Vowel("I�M", new int[]{1}));
		this.put("OM", new Vowel("OM", new int[]{0}));
		this.put("OAM", new Vowel("OAM", new int[]{1}));
		this.put("O�M", new Vowel("O�M", new int[]{1}));
		this.put("OEM", new Vowel("OEM", new int[]{1}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("UM", new Vowel("UM", new int[]{0}));
		this.put("U�M", new Vowel("U�M", new int[]{1}));
		this.put("�M", new Vowel("�M", new int[]{0}));
		this.put("��M", new Vowel("��M", new int[]{1}));
		this.put("Y�M", new Vowel("Y�M", new int[]{1}));
		
		//with consonant 'n'
		this.put("AN", new Vowel("AN", new int[]{0}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("EN", new Vowel("EN", new int[]{0}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("IN", new Vowel("IN", new int[]{0}));
		this.put("I�N", new Vowel("I�N", new int[]{1}));
		this.put("ON", new Vowel("ON", new int[]{0}));
		this.put("OAN", new Vowel("OAN", new int[]{1}));
		this.put("O�N", new Vowel("O�N", new int[]{1}));
		this.put("OEN", new Vowel("OEN", new int[]{1}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("UN", new Vowel("UN", new int[]{0}));
		this.put("U�N", new Vowel("U�N", new int[]{1}));
		this.put("U�N", new Vowel("U�N", new int[]{1}));
		this.put("UYN", new Vowel("UYN", new int[]{1}));
		this.put("UY�N", new Vowel("UY�N", new int[]{2}));
		this.put("�N", new Vowel("�N", new int[]{0}));
		this.put("��N", new Vowel("��N", new int[]{1}));
		this.put("Y�N", new Vowel("Y�N", new int[]{1}));
		
		//with consonant 'ng'
		this.put("ANG", new Vowel("ANG", new int[]{0}));
		this.put("�NG", new Vowel("�NG", new int[]{0}));
		this.put("�NG", new Vowel("�NG", new int[]{0}));
		this.put("ENG", new Vowel("ENG", new int[]{0}));
		this.put("I�NG", new Vowel("I�NG", new int[]{1}));
		this.put("ONG", new Vowel("ONG", new int[]{0}));
		this.put("OANG", new Vowel("OANG", new int[]{1}));
		this.put("O�NG", new Vowel("O�NG", new int[]{1}));
		this.put("OONG", new Vowel("OONG", new int[]{1}));
		this.put("�NG", new Vowel("�NG", new int[]{0}));
		this.put("UNG", new Vowel("UNG", new int[]{0}));
		this.put("U�NG", new Vowel("U�NG", new int[]{1}));
		this.put("U�NG", new Vowel("U�NG", new int[]{1}));
		this.put("�NG", new Vowel("�NG", new int[]{0}));
		this.put("��NG", new Vowel("��NG", new int[]{1}));
		this.put("Y�NG", new Vowel("Y�NG", new int[]{1}));
		
		//with consonant 'nh'
		this.put("ANH", new Vowel("ANH", new int[]{0}));
		this.put("�NH", new Vowel("�NH", new int[]{0}));
		this.put("INH", new Vowel("INH", new int[]{0}));
		this.put("OANH", new Vowel("OANH", new int[]{1}));
		this.put("U�NH", new Vowel("U�NH", new int[]{1}));
		this.put("UYNH", new Vowel("UYNH", new int[]{1}));
		
		//with consonant 'p'
		this.put("AP", new Vowel("AP", new int[]{0}));
		this.put("�P", new Vowel("�P", new int[]{0}));
		this.put("�P", new Vowel("�P", new int[]{0}));
		this.put("EP", new Vowel("EP", new int[]{0}));
		this.put("�P", new Vowel("�P", new int[]{0}));
		this.put("IP", new Vowel("IP", new int[]{0}));
		this.put("I�P", new Vowel("I�P", new int[]{1}));
		this.put("OP", new Vowel("OP", new int[]{0}));
		this.put("OAP", new Vowel("OAP", new int[]{1}));
		this.put("�P", new Vowel("�P", new int[]{0}));
		this.put("�P", new Vowel("�P", new int[]{0}));
		this.put("UP", new Vowel("UP", new int[]{0}));
		this.put("U�P", new Vowel("U�P", new int[]{1}));
		this.put("��P", new Vowel("��P", new int[]{1}));

		//with consonant 't'
		this.put("AT", new Vowel("AT", new int[]{0}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("ET", new Vowel("ET", new int[]{0}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("IT", new Vowel("IT", new int[]{0}));
		this.put("I�T", new Vowel("I�T", new int[]{1}));
		this.put("OT", new Vowel("OT", new int[]{0}));
		this.put("OAT", new Vowel("OAT", new int[]{1}));
		this.put("O�T", new Vowel("O�T", new int[]{1}));
		this.put("OET", new Vowel("OET", new int[]{1}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("UT", new Vowel("UT", new int[]{0}));
		this.put("U�T", new Vowel("U�T", new int[]{1}));
		this.put("U�T", new Vowel("U�T", new int[]{1}));
		this.put("UYT", new Vowel("UYT", new int[]{1}));
		this.put("UY�T", new Vowel("UY�T", new int[]{2}));
		this.put("�T", new Vowel("�T", new int[]{0}));
		this.put("��T", new Vowel("��T", new int[]{1}));
		this.put("Y�T", new Vowel("Y�T", new int[]{1}));
		
	}
	
	public static void main(String[] args){
		VowelTable table = new VowelTable();
		System.out.println(table.get("UY�N") != null);
	}
}
