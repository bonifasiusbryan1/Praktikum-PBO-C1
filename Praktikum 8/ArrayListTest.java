// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 8 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 17 Mei 2023
// Deskripsi : Program Penggunaan Objek ArrayList sebagai Collection Class

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();

        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");

        strings.remove("praktikum");

        for (String s : strings) {
            System.out.println(s + " ");
        }
    }
}