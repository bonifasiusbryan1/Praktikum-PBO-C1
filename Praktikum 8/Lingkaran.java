// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 8 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 17 Mei 2023
// Deskripsi : Implementasi Lingkaran sebagai BangunDatar

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari) {
        this.jejari = jejari;
    }

    public double hitungKeliling() {
        return 2 * jejari * 3.14;
    }
}