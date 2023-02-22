// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 1 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Februari 2023

class Titik {
	double absis;
	double ordinat;
	static int counterTitik;  // Menghitung Objek Titik
	
	Titik(double a, double o) {
		counterTitik++;
		absis = a;
		ordinat = o;
	}
	
	Titik() {
		counterTitik++;
		absis = 0;
		ordinat = 0;
	}
	
	void setAbsis(double a) {
		absis = a;
	}
	
	void setOrdinat(double o) {
		ordinat = o;
	}
	
	double getAbsis() {
		return absis;
	}
	
	double getOrdinat() {
		return ordinat;
	}
	
	int getCounterTitik() {
		return counterTitik;
	}
}