package uzdevums5;

public class Centrs {
	//atributi
	public int x, y;
	// konstruktors
	public Centrs (int x, int y) {
		this.x = x;
		this.y = y;
	}
	// metodes
	public String izvaditKoordinatas() {
			return "Centra punkts atrodas:\n x = "+x+" y = "+y;
		}
	
	public void parvietot (int koordX, int koordY) {
		x = x + koordX;
		y = y + koordY;
	}
}

	
