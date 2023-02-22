// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 1 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Februari 2023

class MTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		
		t1 = new Titik(12,5);
		
		t2 = new Titik(4,7);
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 1 Pemrograman Berorientasi Objek C1");
		System.out.println("Bonifasius Bryan Suryaningtyas");
		System.out.println("24060121130066");
		System.out.println("============================================================\n");
		
		System.out.println("Absis dari Titik t1 adalah "+ t1.getAbsis());
		System.out.println("Ordinat dari Titik t1 adalah "+ t1.getOrdinat());
		System.out.println("Jumlah Objek Titik t1 adalah "+ t1.getCounterTitik());
		
		System.out.println("\n============================================================\n");
		
		System.out.println("Absis dari Titik t2 adalah "+ t2.getAbsis());
		System.out.println("Ordinat dari Titik t2 adalah "+ t2.getOrdinat());
		System.out.println("Jumlah Objek Titik t2 adalah "+ t2.getCounterTitik());
		
		System.out.println("\n============================================================\n");
	}
}