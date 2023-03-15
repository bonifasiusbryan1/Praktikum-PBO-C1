// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 4 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 15 Maret 2023
// Deskripsi : Representasi dari Objek Bujur Sangkar, Turunan Kelas Poligon

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon {
	private double panjangSisi;
	
	public BujurSangkar(double panjangSisi) {
		this.jumlahSisi = 4;
		this.panjangSisi = panjangSisi;
	}
	
	public double hitungLuas() {
		return panjangSisi = panjangSisi;
	}
	
	public double getPanjangSisi() {
		return this.panjangSisi;
	}
}