// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 5 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Maret 2023
// Deskripsi : Kelas yang Mengimplementasikan Interface Cara Menghitung Luas Lingkaran

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI*jejari*jejari;
    }
}