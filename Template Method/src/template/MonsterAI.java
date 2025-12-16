package template;

public abstract class MonsterAI {

	public MonsterAI() {
		// TODO Auto-generated constructor stub
	}
	
	public final void attack() {
		searchTarget();
		approachTarget();
		attackTarget();
	}
	
	public void heal() {
		System.out.println("wuwiwi");
	}
	
	public abstract void searchTarget();
	public abstract void approachTarget();
	public abstract void attackTarget();
	
}
