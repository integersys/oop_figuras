package uzdevums5;

public class Aplis {
	public Centrs punkts;
	public double radiuss;
	
	public Aplis (Centrs p, double r) {
		punkts = p;
		radiuss = r;
	}
	public String izvaditAplaInfo() {
		return "Rādiuss: "+radiuss;
	}
	
	//izveidot metodi riņķa līnijas aprēķināšanai
	public double rLGarums(double r) {
		double c = 2* Math.PI*radiuss;
		return Math.round(c*100.0)/100.0;
	}
	
	// riņķa laukuma aprēķināšanai
	
	public double rinkaLaukums(double r) {
		double s = Math.PI*Math.pow(radiuss, 2);
		return Math.round(s*100.0)/100.0;
	}
}
