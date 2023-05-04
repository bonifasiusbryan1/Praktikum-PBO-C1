// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 7 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 3 Mei 2023
// Deskripsi : Kelas Pegawai, SuperClass dari Kelas Manager dan Programmer

public class Pegawai {
    String nama;
    int gajiPokok = 5000000;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama : " + nama + ", Gaji pokok : " + gajiPokok);
    }
}