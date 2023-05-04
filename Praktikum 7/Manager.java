// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 7 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 3 Mei 2023
// Deskripsi : Kelas Manager, turunan dari Kelas Pegawai

public class Manager extends Pegawai {
    private int tunjangan = 700000;

    public Manager(String nama) {
        setNama(nama);
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + tunjangan);
    }
}