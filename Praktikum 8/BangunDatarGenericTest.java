// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 8 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 17 Mei 2023
// Deskripsi : Main Class untuk Generic Bangun Datar 

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("Tugas Praktikum 8 Pemrograman Berorientasi Objek C1");
        System.out.println("Bonifasius Bryan Suryaningtyas");
        System.out.println("24060121130066");
        System.out.println("============================================================\n");

        Lingkaran l = new Lingkaran(7);
        BangunDatarGeneric<Lingkaran> bdgL = new BangunDatarGeneric<Lingkaran>();
        bdgL.set(l);
        System.out.println("Keliling Lingkaran : " + bdgL.hitungKeliling());
        System.out.println("Tipe Generic : " + bdgL.get().getClass().getName());
    }
}