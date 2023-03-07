// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 1 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Februari 2023

class Titik {
	private double absis;
	private double ordinat;
	private static int counterTitik;  // Menghitung Objek Titik
	
	public Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	public Titik() {
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	public void setAbsis(double a) {
		absis = a;
	}
	
	public void setOrdinat(double o) {
		ordinat = o;
	}
	
	public double getAbsis() {
		return absis;
	}
	
	public double getOrdinat() {
		return ordinat;
	}
	
	public int getCounterTitik() {
		return counterTitik;
	}
}