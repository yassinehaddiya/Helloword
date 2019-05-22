package beispiel;

public class New_mitarbeiter {

	public static void main(String[] args) {
		Mitarbeiter yassine = new Mitarbeiter("yass","hadd",3000);
		Mitarbeiter ilyass = new Mitarbeiter("ilyas","hay",3500);
		yassine.datenausgeben();
		ilyass.datenausgeben();
		yassine.lohneerhöhen(500);
		yassine.datenausgeben();
		ilyass.datenausgeben();
		
	}

}
