package com.codingdojo.objectmaster;

public class Human {
	protected String name;
	protected Integer strength = 3;
	protected Integer stealth = 3;
	protected Integer intelligence = 3;
	protected Integer health = 100;
	
public Human() {
}
	
public Human(String nameParam) {
	this.name = nameParam;
}
	
	public void displayHealth() {
		System.out.println(this.name+"'s health: "+this.health);
	}
	
	public void displayStats() {
		System.out.println("Name: "+this.name);
		System.out.println("Strength: "+this.strength);
		System.out.println("Stealth: "+this.stealth);
		System.out.println("Intelligence: "+this.intelligence);
		System.out.println("Health: "+this.health);
		System.out.println("Class: "+this.getClass());
	}
	
	public void attack(Human target) {
		System.out.println(this.name+" has attacked "+target.name+" for "+this.strength+" health points");
		target.health -= this.strength;
	}
}
