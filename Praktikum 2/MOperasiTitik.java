// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 2 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 1 Maret 2023

class MOperasiTitik {
	public static void main(String[] args) {
		Titik t1;
		Titik t2;
		OperasiTitik operasiTitik;
		
		t1 = new Titik(12,5);
		
		t2 = new Titik(4,7);
		
		operasiTitik = new OperasiTitik();
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 2 Pemrograman Berorientasi Objek C1");
		System.out.println("Bonifasius Bryan Suryaningtyas");
		System.out.println("24060121130066");
		System.out.println("============================================================\n");
		
		System.out.println("Refleksi Sumbu X Titik t1\n");
		System.out.println("Sebelum Refleksi : Titik t1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		operasiTitik.refleksiX(t1);
		System.out.println("Setelah Refleksi : Titik t1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		System.out.println("\nRefleksi Sumbu Y Titik t1\n");
		System.out.println("Sebelum Refleksi : Titik t1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		operasiTitik.refleksiY(t1);
		System.out.println("Setelah Refleksi : Titik t1 (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
		
		System.out.println("\n============================================================\n");
		
		System.out.println("Refleksi Sumbu X Titik t2\n");
		System.out.println("Sebelum Refleksi : Titik t2 (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		operasiTitik.refleksiX(t2);
		System.out.println("Setelah Refleksi : Titik t2 (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		
		System.out.println("\nRefleksi Sumbu Y Titik t2\n");
		System.out.println("Sebelum Refleksi : Titik t2 (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		operasiTitik.refleksiY(t2);
		System.out.println("Setelah Refleksi : Titik t2 (" + t2.getAbsis() + "," + t2.getOrdinat() + ")");
		
		System.out.println("\n============================================================\n");
	}
}