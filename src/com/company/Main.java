package com.company;

public class Main {

	public static void main(String[] args) {


		Boss boss = new Boss();
		boss.setHealth(150);
		boss.setDamage(50);
		boss.setProtectionType("bronza");
		System.out.println(boss.getHealth());
		System.out.println(boss.getDamage());
		System.out.println(boss.getProtectionType());
		createHerous();

		Hero[] command=createHerous();
		for (Hero hero :command) {
			System.out.println("HH: "+hero.getHealth()+"," +" URON: "+ hero.getDamage()+"," +" SuperPower "+ hero.getSuperPower());

		}
		}

		public static Hero[] createHerous() {

		Hero hero1 = new Hero(180, 50);
		Hero hero2 = new Hero(200, 90, "пистолет");
		Hero hero3 = new Hero(500, 100, "K2");


		Hero[] array  ={hero1, hero2, hero3};
		return array;
	 }
}

