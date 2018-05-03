package com.codingdojo.objectmaster;

public class Samurai extends Human{
//	protected Integer health = 200;
	
	private static Integer count =0;
	
	public Samurai(String name) {
		super(name);
		this.health = 200;
		count +=1;
	}
	
	public void deathBlow(Human target) {
		System.out.println(this.name+" performed a death blow on "+target.name);
		target.health =0;
		this.health = this.health/2;
	}
	
	public void meditate() {
		System.out.println(this.name+" is meditating to regain "+this.health/2+ " health");
		this.health += this.health/2;
	}
	
	public Integer howMany() {
		System.out.println("There are currently "+count+" Samurai playing");
		return count;
		
	}
	
}
