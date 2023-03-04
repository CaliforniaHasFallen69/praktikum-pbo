class Titik {
	double absis;
	double ordinat;
	static int counterTitik;
	
	Titik() {
		absis = 0;
		ordinat = 0;
		counterTitik++;
	}
	
	Titik(double x, double y) {
		absis = x;
		ordinat = y;
		counterTitik++;
	}
	
	void setAbsis(double x) {
		absis = x;
	}
	
	double getAbsis() {
		return absis;
	}
	
	void setOrdinat(double y) {
		ordinat = y;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	}
