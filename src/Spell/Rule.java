package Spell;

abstract public class Rule {
	
	public int id;
	protected String msg;
	
	public Rule(int id){
		this.id = id;
	}
	
	abstract public boolean checkValid(String x);
	
	public void show(){
		System.out.println("Tu nay sai luat so [" + String.valueOf(id) + "] " + msg);
	}

	
}

