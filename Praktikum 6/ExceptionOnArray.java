// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 6 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 29 Maret 2023
// Deskripsi : Program Penggunaan Eksepsi menggunakan Class Library Java

public class ExceptionOnArray {
	public static void main(String[] args) {
		Integer[] arrayInteger = new Integer[4];
		try {
			arrayInteger[2] = 11;
			arrayInteger[4] = 10;
		}
		catch(ArrayIndexOutOfBoundsException exception) {
			exception.printStackTrace();
		}
		finally {
			System.out.println("clean up code...");
		}
	}
}