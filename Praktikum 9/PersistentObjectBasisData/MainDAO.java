// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 9 Pemrograman Berorientasi Objek Lab C1
// Har  tanggal : Rabu, 30 Mei 2023
// Nama File : MainDAO.java
// Deskripsi : Main Program untuk Akses DAO

public class MainDAO {
    public static void main(String[] args) {
        Person person = new Person("Bryan");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}