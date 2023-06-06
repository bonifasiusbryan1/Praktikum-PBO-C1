// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 10 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 30 Mei 2023
// Nama File : LambdaHashMap.java
// Deskripsi : Implementasi Lambda pada HashMap

import java.util.HashMap;

public class LambdaHashMap {
    public static void main(String[] args) {
        HashMap<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121130066", "Bonifasius Bryan");
        mahasiswaMap.put("24060121120017", "Ananda Rizky");
        mahasiswaMap.put("24060121140158", "Devin Januar");
        mahasiswaMap.put("24060121130079", "Fiersa");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("Mahasiswa dengan NIM " + nim + " bernama " + nama));
    }
}