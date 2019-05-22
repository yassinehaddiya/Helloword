package beispiel;

public class Mitarbeiter {
	String m_name;
	String m_vorname;
	int m_lohne;
	

	public Mitarbeiter(String name, String vorname, int lohne) {
		m_name = name;
	    m_vorname = vorname;
		m_lohne = lohne;
	}
	void datenausgeben() {
		System.out.println("\n");
		System.out.println("Name :"+m_name);
		System.out.println("Vorname :"+m_vorname);
		System.out.println("Lohne :"+m_lohne+"euro");
 	}
   void lohneerh�hen(int erh�hung) {
	   m_lohne += erh�hung;
   }
}
class Lehrling extends Mitarbeiter{
	int abgelegtepr�fung;

	public Lehrling(String name, String vorname, int lohne) {
		super(name, vorname, lohne);
		abgelegtepr�fung=0;
		
	}
}
class Angestellter extends Mitarbeiter{
	int hierarchiestufe;
	final int MAX_HIERARCHIE=5;
	public Angestellter(String name, String vorname, int lohne) {
		super(name, vorname, lohne);
		hierarchiestufe=0;		
	}
	
	void befoerdern() {
		if (hierarchiestufe<MAX_HIERARCHIE)
			hierarchiestufe++;
	}	
}
class chef extends Mitarbeiter{

	public chef(String name, String vorname, int lohne) {
		super(name, vorname, lohne);
		
	}
	void lohneerh�hen(int erh�hung) {
		m_lohne+=2*erh�hung;
	}
}
