// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 6 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 29 Maret 2023
// Deskripsi : Program untuk Demo Asersi

class Lingkaran {
	private double jariJari;
	public Lingkaran(double jariJari) {
		this.jariJari = jariJari;
	}
	public double hitungKeliling() {
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

public class Asersi2 {
	public static void main(String[] args) {
		double jariJari = 0;
		assert(jariJari > 0):"Jari-jari Tidak Boleh Nol!";
		Lingkaran lr = new Lingkaran(jariJari);
		double kelilingLingkaran = lr.hitungKeliling();
		System.out.println("Keliling Lingkaran = "+kelilingLingkaran);
	}
}

// Pertanyaan : Ada yang kurang tepat pada program Asersi2 di atas?

/* Jawab : Baris 21 pada kode di atas tidak tepat, seharusnya tertulis jariJari != 0 dan bukan jariJari > 0
		   Hal ini akan memungkinkan angka negatif tetap masuk dan dapat dijalankan.
*/