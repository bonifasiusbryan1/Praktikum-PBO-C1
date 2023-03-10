// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 3 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 8 Maret 2023
// Deskripsi : Representasi dari Objek Persegi Panjang, Turunan Kelas Poligon

package org.bangundatar;

import org.poligon.Poligon;

public class PersegiPanjang extends Poligon {
	private double panjang, lebar;
	
	public PersegiPanjang (double panjang, double lebar, int jumlahSisi) {
		this.panjang = panjang;
		this.lebar = lebar;
		this.jumlahSisi = jumlahSisi;
	}
	
	public double hitungLuas() {
		return panjang * lebar;
	}
	
	public void printInfo() {
		System.out.println("Bangun Persegi Panjang bersisi "+this.getJumlahSisi());
	}
}