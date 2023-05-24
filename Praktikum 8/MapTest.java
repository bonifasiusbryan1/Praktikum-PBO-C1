// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 8 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 17 Mei 2023
// Deskripsi : Program yang Menggunakan Generic untuk Pasangan Kunci-Nilai

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "satu");
        map.put(2, "dua");

        System.out.println(map.get(1));

        Set<Integer> key = map.keySet();

        // Pertanyaan : Bagaimana iterasi untuk mengambil keseluruhan nilai dari kunci?
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }
    }
}