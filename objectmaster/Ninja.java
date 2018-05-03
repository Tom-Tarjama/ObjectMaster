package com.codingdojo.objectmaster;

public class Ninja extends Human {
//	protected Integer stealth = 10;
	
	public Ninja(String name) {
		super(name);
		this.stealth = 10;
	}
	
	public void steal(Human target) {
		System.out.println(this.name+" stole "+this.stealth+" health from "+target.name);
		Integer x = this.stealth;
		target.health -=x;
		this.health +=x;
	}
	
	public void runAway() {
		System.out.println(this.name+" ran away, losing 10 health");
		this.health -=10;
	}
}
