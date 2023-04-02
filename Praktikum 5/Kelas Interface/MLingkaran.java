// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 5 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Maret 2023
// Deskripsi : Driver Class untuk Kelas Lingkaran

import java.util.Scanner;

public class MLingkaran {
	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 5 Pemrograman Berorientasi Objek C1");
		System.out.println("Bonifasius Bryan Suryaningtyas");
		System.out.println("24060121130066");
		System.out.println("============================================================");
		
		System.out.println("-----Lingkaran-----");
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan Panjang Jari-jari Lingkaran : ");
		double jari = scan.nextDouble();
        Lingkaran lr = new Lingkaran(jari);
        System.out.println("Luas Lingkaran dengan Jari-jari " + jari + " satuan adalah " + lr.hitungLuas());
		
		System.out.println("============================================================");
	}
}
