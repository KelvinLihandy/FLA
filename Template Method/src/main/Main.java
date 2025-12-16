package main;

import template.MonsterAI;
import template.SkeletonAI;
import template.ZombieAI;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		MonsterAI zom = new ZombieAI();
		MonsterAI ske = new SkeletonAI();
		
		zom.attack();
		ske.attack();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
