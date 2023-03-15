// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 4 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 15 Maret 2023
// Deskripsi : Representasi dari Objek Kubus

package org.bangunruang;

import org.bangundatar.BujurSangkar;

public class Kubus {
	private BujurSangkar permukaan;
	
	public Kubus(BujurSangkar permukaan) {
		this.permukaan = permukaan;
	}
	
	public double hitungVolume() {
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi * panjangSisi;
	}
	
	public double hitungLuasAlas() {
		double panjangSisi = permukaan.getPanjangSisi();
		return panjangSisi * panjangSisi;
	}
}