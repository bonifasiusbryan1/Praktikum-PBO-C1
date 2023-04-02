// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 6 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 29 Maret 2023
// Deskripsi : Program untuk Menunjukkan Asersi

public class Asersi1 {
  public static void main (String[] args) {
    int x = 0;
	if(x > 0) {
		System.out.println("x Bilangan Positif");
	}
	else {
		assert(x < 0): "Ada Kesalahan Kode";
		System.out.println("x Bilangan Negatif");
	}
  }
}