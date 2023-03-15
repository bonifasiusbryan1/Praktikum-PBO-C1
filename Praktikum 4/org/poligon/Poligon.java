// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 4 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 15 Maret 2023
// Deskripsi : Representasi Dasar dari Objek Poligon

package org.poligon;

public class Poligon {
	protected int jumlahSisi;
	
	public Poligon() {
		this.jumlahSisi = 0;
	}
	
	public void setJumlahSisi (int jumlahSisi) {
		this.jumlahSisi = jumlahSisi;
	}
	
	public int getJumlahSisi() {
		return this.jumlahSisi;
	}
}