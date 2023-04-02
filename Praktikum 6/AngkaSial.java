// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 6 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 29 Maret 2023
// Deskripsi : Program Penggunaan Exception Buatan Sendiri. 
//	    	   Pengenalan Klausa 'throw' dan 'throws'

public class AngkaSial {

	public void cobaAngka(int angka) throws AngkaSialException {
		if (angka == 13) {
			throw new AngkaSialException();
		}
		System.out.println(angka+" bukan angka sial");
	}
	
	public static void main(String[] args) {
		AngkaSial as = new AngkaSial();
		try {
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		} catch(AngkaSialException ase) {
			//method getMessage() telah ada pada kelas "Exception"
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

// Pertanyaan : Ketika eksepsi terjadi, apakah baris 12 (14) pada AngkaSial.java di atas dieksekusi?
//			    Apakah baris 21 (23) pada AngkaSial.java di atas dieksekusi?

/* Jawab : Karena belum ada kelas AngkaSialException, maka baris 14 dan baris 23 pada kode di atas tidak akan dieksekusi.
		   Oleh karena itu, perlu adanya pembuatan class AngkaSialException terlebih dahulu yang merupakan turunan dari kelas Exception.
*/