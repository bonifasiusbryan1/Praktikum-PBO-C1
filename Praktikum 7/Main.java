public class Main {
    public static void main(String args[]) {
        System.out.println("============================================================");
        System.out.println("Tugas Praktikum 7 Pemrograman Berorientasi Objek C1");
        System.out.println("Bonifasius Bryan Suryaningtyas");
        System.out.println("24060121130066");
        System.out.println("============================================================\n");

        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Pegawai pegawai3 = new Manager("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
        System.out.println("\n============================================================");
    }
}
