package Spell;

abstract public class Rule {
	
	private int id;
	
	public Rule(int id){
		this.id = id;
	}
	
	abstract public boolean checkValid(String x);
	
	public void show(){
		System.out.println("Tu nay sai luat so [" + String.valueOf(id) + "]");
	}

	
}

