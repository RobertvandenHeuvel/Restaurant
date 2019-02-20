public class Restaurant{
	public static void main(String[] args) {
		//restaurant
		Gast gast = new Gast();
		gast.naam = "Piet";
		gast.geld = 15;
		Bestelling bestelling = new Bestelling();
		bestelling.bestelling = "stampot";
		bestelling.controleren();
		Chef chef = new Chef();
		chef.koken();
		gast.afrekenen();
		// de gast bestelt
		//de ober geeft de bestelling door aan de chef
		//de chef kookt
		// de gast rekent af
	}
}
class Gast{
	String naam;
	int geld;
	//methode bestelling
	Bestelling bestelling1;
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
// neemt bestelling eten (has Bestelling)
// methode geeft bestelling aan chef
// methode rekent af met geld
}
class Chef{
	void koken(){
		System.out.println("koken werkt");
	}
	// has Bestelling
// heeft ingredienten
// methode kookt eten
}
