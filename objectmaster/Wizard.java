package com.codingdojo.objectmaster;

public class Wizard extends Human{
	
//	protected Integer health = 50;
//	protected Integer intelligence = 8;
	public Wizard (String name) {
		super(name);
		this.health =50;
		this.intelligence =8;
	}

	public void heal(Human target) {
		System.out.println(this.name+" healed "+target.name+" for "+this.intelligence+" points");
		target.health +=this.intelligence;
	}
	
	public void fireball(Human target) {
		System.out.println(this.name+" shot a fireball at "+target.name+", causing "+this.intelligence*3+" damage");
		target.health -= this.intelligence*3;
	}

}
