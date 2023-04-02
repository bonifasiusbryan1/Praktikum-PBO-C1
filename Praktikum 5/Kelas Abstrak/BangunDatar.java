// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 5 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Maret 2023
// Deskripsi : Kelas Abstrak, berisi Abstraksi Bangun Datar

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}