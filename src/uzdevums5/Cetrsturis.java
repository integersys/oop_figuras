package uzdevums5;

public class Cetrsturis {
	public double platums, augstums;
	public Centrs punkts;
	
	// konstruktoru parslogošana
	
	public Cetrsturis() {
		punkts = new Centrs (0, 0);
	}
	
	public Cetrsturis(Centrs punkts, double p, double a) {
		this.punkts = punkts;
		platums = p;
		augstums = a;
	}
	
		public String izvaditCetrsturaInfo() {
			return "Platums: "+platums+" augstums: "+augstums+"cm";
		}
		
		/*
		// uztaisīt metodi, kas aprēķina laukumu un atgriež tikai rezultātu
		// public double cLaukums(){
		double s = platums * augstums;
		return s;
		}*/
		
		public double cetrlaukums(double platums, double augstums) {
			return platums*augstums;
		}
	}