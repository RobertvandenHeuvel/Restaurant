public class Restaurant{
	public static void main(String[] args) {
		//restaurant
		Gast gast = new Gast();
		gast.naam = "Piet";
		gast.geld = 15;
		Bestelling bestelling = new Bestelling();
		bestelling.bestelling = "stampot";
		bestelling.controleren();
		gast.bestellen(bestelling);
		//de ober geeft de bestelling door aan de chef
		Chef chef = new Chef();
		chef.koken(bestelling);
		gast.afrekenen();



	}
}
class Gast{
	String naam;
	int geld;
	//methode bestelling
	void bestellen(Bestelling bestelling1){
		
		System.out.println("bestelling is " + bestelling1.bestelling);
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
// neemt bestelling eten (has Bestelling)
// methode geeft bestelling aan chef
}
class Chef{
	//ingredienten
	void koken(Bestelling bestelling1){
		if (bestelling1.controleren = true) {
		System.out.println("De chef maakt stampot.");
		}else {
			System.out.println("De chef maakt het verkeerde gerecht!");
		}
	}

}
