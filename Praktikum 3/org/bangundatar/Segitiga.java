// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 3 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 8 Maret 2023
// Deskripsi : Representasi dari Objek Segitiga, Turunan Kelas Poligon

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon {
	private double alas, tinggi, sisiMiring;
	
	public Segitiga (double alas, double tinggi, double sisiMiring, int jumlahSisi) {
		this.alas = alas;
		this.tinggi = tinggi;
		this.sisiMiring = sisiMiring;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas() {
		return 0.5 * alas * tinggi;
	}
	
	public double hitungKeliling() {
		return (2 * sisiMiring) + alas;
	}
	
	public void printInfo() {
		System.out.println("Bangun Segitiga Memiliki Sisi Sebanyak "+this.getJumlahSisi());
	}
}