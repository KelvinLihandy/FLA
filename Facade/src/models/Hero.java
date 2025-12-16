package models;

public class Hero {
	
	private String name;
	private int defense;
	private int damage;
	
	public Hero(String name, int defense, int damage) {
		super();
		this.name = name;
		this.defense = defense;
		this.damage = damage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
}
