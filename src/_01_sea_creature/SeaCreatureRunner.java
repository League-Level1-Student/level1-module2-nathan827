package _01_sea_creature;

public class SeaCreatureRunner {
public static void main(String[] args) {
	SeaCreature spongebob = new SeaCreature("spongebob");
	spongebob.eat();
	spongebob.laugh();
	SeaCreature patrick = new SeaCreature("patrick");
	String patrickname = patrick.getName();
	System.out.println(patrickname);
	patrick.eat();
	patrick.laugh();
	SeaCreature squidward = new SeaCreature("squidward");
	String squidwardname = squidward.getName();
	System.out.println(squidwardname);
	squidward.eat();
	squidward.laugh();
}
}
