// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 6 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 29 Maret 2023
// Deskripsi : Eksepsi Buatan Sendiri, Menolak Masukan Angka 13!

public class AngkaSialException extends Exception {
	public AngkaSialException() {
		super("Jangan Memasukkan Angka 13 karena Angka Sial!");
	}
}