// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 8 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 17 Mei 2023
// Deskripsi : Kelas Konstruksi Generic untuk BangunDatar 

public class BangunDatarGeneric<Z extends BangunDatar> {
    private Z bangunDatar;

    public void set(Z tipeBangunDatar) {
        bangunDatar = tipeBangunDatar;
    }

    public Z get() {
        return bangunDatar;
    }

    public double hitungKeliling() {
        return bangunDatar.hitungKeliling();
    }

    // Pertanyaan : Apakah penggantian 'T' dengan variabel lain akan berpengaruh
    // terhadap jalannya program?
    /*
     * Jawaban : Tidak, mengganti T dengan variabel lain (dalam hal ini Z) tidak
     * akan berpengaruh terhadap
     * jalannya program. T disini hanya sebuah variabel untuk parameter tipe generik
     * sehingga
     * dapat diganti dengan nama variabel apapun yang valid.
     */
}