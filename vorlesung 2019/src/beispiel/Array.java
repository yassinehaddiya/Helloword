package beispiel;

import java.util.ArrayList;

public class Array {
	    
	    @SuppressWarnings({ "rawtypes", "unchecked" })
		public static void main(String[] args) {
	    
	        //anlegen einer ArrayListe
	        ArrayList liste = new ArrayList();
	        
	        //fuellen der Liste mit Daten
	        liste.add("Apfel");
	        liste.add("Birne");
	        liste.add("Stuhl");
	        liste.add("Orange");
	        liste.add("Zitrone");
	    
	        //Ausgeben der Liste
	        System.out.println(liste);
	        
	        //Hmm - der gehoert hier nicht rein!
	        liste.remove("Stuhl");
	        
	        // nochmal ausgeben
	        System.out.println(liste);
	        
	        //testen ob Stuhl enthalten:
	        if (liste.contains ("Stuhl")){
	            System.out.println("Der Stuhl ist noch drin.");
	        }else{
	            System.out.println("Der Stuhl ist draußen.");
	        }
	        
	        // testen ob Birne enthalten:
	        if (liste.contains ("Birne")){
	            System.out.println("Die Birne ist noch drin.");
	        }else{
	            System.out.println("Die Birne ist draußen.");
	        }
	        
	    }

	}



