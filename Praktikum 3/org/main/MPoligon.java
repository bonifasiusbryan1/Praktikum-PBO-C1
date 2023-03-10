// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 3 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 8 Maret 2023
// Deskripsi : Driver Class untuk Poligon Persegi Panjang dan Segitiga

package org.main;

import org.bangundatar.*;

public class MPoligon {
	public static void main(String[] args) {
		
		System.out.println("============================================================");
		System.out.println("Tugas Praktikum 3 Pemrograman Berorientasi Objek C1");
		System.out.println("Bonifasius Bryan Suryaningtyas");
		System.out.println("24060121130066");
		System.out.println("============================================================\n");
		
		System.out.println("Poligon Persegi Panjang\n");
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas());
		
		System.out.println("\n============================================================\n");
		
		System.out.println("Poligon Segitiga\n");
		Segitiga segitiga = new Segitiga(6,4,5,3);
		segitiga.printInfo();
		System.out.println("Luas Segitiga : "+segitiga.hitungLuas());
		System.out.println("Keliling Segitiga : "+segitiga.hitungKeliling());
		
		System.out.println("\n============================================================");
	}
}