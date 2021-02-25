package _02_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("Handy");
	handy.eat();
	String handyname = handy.getName();
	System.out.println(handyname);
	Smurf papasmurf = new Smurf("Papa Smurf");
	String papasmurfname = papasmurf.getName();
	System.out.println(papasmurfname);
	String papasmurfhat = papasmurf.getHatColor();
	System.out.println(papasmurfhat);
	papasmurf.isGirlOrBoy();
	Smurf smurfette = new Smurf("Smurfette");
	smurfette.getName();
	smurfette.getHatColor();
	smurfette.isGirlOrBoy();
}
}
