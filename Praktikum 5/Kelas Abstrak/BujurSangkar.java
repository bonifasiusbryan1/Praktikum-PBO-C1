// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 5 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 22 Maret 2023
// Deskripsi : Kelas yang Mengimplementasikan Metode Abstrak pada Bangun Datar

public class BujurSangkar extends BangunDatar {
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

// Pertanyaan : Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? Jelaskan!

/* Jawab : Source Code tidak akan bisa di-compile atau error. Pada Java, setiap kelas turunan dari kelas abstrak harus mengimplementasikan semua 
		   metode abstrak yang didefinisikan oleh kelas abstrak induknya.
*/