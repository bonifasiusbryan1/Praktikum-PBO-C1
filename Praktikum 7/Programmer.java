// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 7 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 3 Mei 2023
// Deskripsi : Kelas Programmer, turunan dari Kelas Pegawai

public class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + bonus);
    }
}