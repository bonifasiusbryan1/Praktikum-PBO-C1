// Nama : Bonifasius Bryan Suryaningtyas
// NIM	: 24060121130066
// Pertemuan 2 Pemrograman Berorientasi Objek Lab C1
// Hari, tanggal : Rabu, 1 Maret 2023

class OperasiTitik {
  private void refleksiSumbuX(Titik titik) {
    double ordinat = titik.getOrdinat();
    ordinat = ordinat*(-1);
    titik.setOrdinat(ordinat);
  }
  
  private void refleksiSumbuY(Titik titik) {
    double absis = titik.getAbsis();
    absis = absis*(-1);
    titik.setAbsis(absis);    
  }

  public Titik refleksiX(Titik titik) {
    refleksiSumbuX(titik);
    return titik;
  }

  public Titik refleksiY(Titik titik) {
    refleksiSumbuY(titik);
    return titik;
  }
}