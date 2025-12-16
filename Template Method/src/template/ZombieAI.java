package template;

public class ZombieAI extends MonsterAI {

	public ZombieAI() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void searchTarget() {
		// TODO Auto-generated method stub
		System.out.println("Zombie searching for nearest target");		
	}

	@Override
	public void approachTarget() {
		// TODO Auto-generated method stub
		System.out.println("Zombie going to target with speed");
	}

	@Override
	public void attackTarget() {
		// TODO Auto-generated method stub
		System.out.println("Zombie attack");
	}

}
