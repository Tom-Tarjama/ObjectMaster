package com.codingdojo.objectmaster;

public class HumanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wizard alice = new Wizard("Alice");
//		alice.displayStats();
//		alice.displayHealth();
		
		Ninja tom = new Ninja("Tom");
//		tom.displayStats();
		
//		tom.attack(alice);
//		alice.displayHealth();
		
//		alice.fireball(tom);
//		tom.displayHealth();
//		
//		alice.heal(tom);
//		tom.displayHealth();
//		
//		tom.steal(alice);
//		tom.displayHealth();
//		alice.displayHealth();
//		tom.runAway();
//		tom.displayHealth();
		
		Samurai bob = new Samurai("Bob");
		bob.displayStats();
		bob.meditate();
		bob.displayHealth();
		bob.howMany();
		
		Human donald = new Human("Donald");
		donald.displayStats();
		bob.deathBlow(donald);
		donald.displayHealth();
		bob.displayHealth();
		
		Samurai ted = new Samurai("Ted");
		bob.howMany();
		ted.howMany();
	}

}
