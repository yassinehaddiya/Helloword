package figur;

public class Zeichen {
	static Figur[] zeichenobjekte=new Figur[5];

	public static void main(String[] args) {
		System.out.println();
        zeichenobjekte[0] = new Kreis(20,30,10);
        zeichenobjekte[1] = new Rechteck(2,78,50,50);
        zeichenobjekte[2] = new Kreis(99,30,10);
        zeichenobjekte[3] = new Linie(201,44,201,66);
        zeichenobjekte[4] = new Linie(10,50,50,50);
        for(int loop=0;loop<zeichenobjekte.length;loop++)
        	zeichenobjekte[loop].zeichen();
        
	}

}
