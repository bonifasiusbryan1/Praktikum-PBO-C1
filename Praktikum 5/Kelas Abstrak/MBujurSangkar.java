// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 5 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Maret 2023
// Deskripsi : Driver Class untuk Kelas BujurSangkar

import java.util.Scanner;

public class MBujurSangkar {
	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 5 Pemrograman Berorientasi Objek C1");
		System.out.println("Bonifasius Bryan Suryaningtyas");
		System.out.println("24060121130066");
		System.out.println("============================================================");
		
		System.out.println("-----BujurSangkar-----");
		Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
		System.out.print("Masukkan Panjang Sisi Bujur Sangkar : ");
		double sisi = scan.nextDouble();
        System.out.println("Luas Bujur Sangkar dengan Panjang Sisi " + sisi + " satuan adalah " + bs.hitungLuas(sisi));
		
		System.out.println("============================================================");
	}
}
