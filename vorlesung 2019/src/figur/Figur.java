package figur;

abstract class Figur {
	int m_xkoord;
	int m_ykoord;
	public Figur(int x, int y) {
		
		m_xkoord = x;
		m_ykoord = y;
	}
	abstract void zeichen();
}
class Kreis extends Figur{
	int m_radius;

	public Kreis(int x, int y, int r) {
		super(x, y);
        m_radius = r;
	}
	void zeichen() {
		System.out.println("zeichen-Methode für kreise");
		
	}
}
class Rechteck extends Figur{
	int m_breite;
	int m_leange;
	public Rechteck(int x, int y, int b, int l) {
		super(x, y);
		m_breite = b;
		m_leange = l;
	}
	void zeichen() {
		System.out.println("zeichen-Methode für Rechtecke");
	}
}

class Linie extends Figur{
	int m_endpX;
	int m_endpY;
	public Linie(int x, int y, int ex, int ey) {
		super(x, y);
		this.m_endpX = ex;
		this.m_endpY = ey;
	}
	void zeichen() {
		System.out.println("zeichen-Methode für Linie");
	}
	
}



