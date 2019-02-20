public class Restaurant{
	public static void main(String[] args) {
		//restaurant
		Gast gast = new Gast();
		gast.naam = "Piet";
		gast.geld = 15;
		gast.bestelling1 = new Bestelling();
		gast.bestelling1.bestelling = "stampot";
		gast.bestellen(gast.bestelling1);
		gast.bestelling1.controleren();
		Ober ober = new Ober();
		ober.doorgeven(gast.bestelling1);
		Chef chef = new Chef();
		chef.koken(gast.bestelling1);
		gast.afrekenen();



	}
}
class Gast{
	String naam;
	int geld;
	static Bestelling bestelling1;
	void bestellen(Bestelling bestelling1){
		System.out.println(naam + " bestelt " + bestelling1.bestelling + ".");
	}
	void afrekenen(){
		if (geld<10) {
		System.out.println("Niet genoeg geld.");
	}else{
		System.out.println("Afgerekend!");
	}
	}
}
class Bestelling{
	static boolean controleren = false;
	String bestelling;
	void controleren(){
		if (bestelling == "stampot") {
			controleren = true;
			System.out.println("De bestelling is juist");
		}else {
			System.out.println("De bestelling is verkeerd");
		}
	}
}
class Ober{
	void doorgeven(Bestelling bestelling1){
		if (bestelling1.controleren == true) {
			System.out.println("De ober geeft de bestelling door aan de chef.");
		}else {
			System.out.println("De bestelling wordt verkeerd doorgegeven.");
		}
	}
}
class Chef{
	String ingredient1 = "aardappel";
	String ingredient2 = "boerenkool";
	String ingredient3 = "rookworst";
	void koken(Bestelling bestelling1){
		if (bestelling1.controleren == true) {
		System.out.println("De chef maakt stampot met " + ingredient1 + ", "+ ingredient2 + ", en " + ingredient3 + ".");
		}else {
			System.out.println("De chef maakt het verkeerde gerecht!");
		}
	}

}
