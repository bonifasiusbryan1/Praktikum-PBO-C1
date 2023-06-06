// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 9 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 30 Mei 2023
// Nama File : SerializePerson.java
// Deskripsi : Program untuk Serialisasi Objek Person

import java.io.*;

class Person implements Serializable {
    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }
}

public class SerializePerson {
    public static void main(String[] args) {
        Person person = new Person("Bryan");
        try {
            FileOutputStream f = new FileOutputStream("person.ser");
            ObjectOutputStream s = new ObjectOutputStream(f);
            s.writeObject(person);
            System.out.println("Selesai Menulis Objek Person");
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}