public class DosenMain14 {
    public static void main(String[] args) {
        System.out.println("=== Data Dosen ===");
        System.out.println();
        Dosen14 ds1 = new Dosen14();
        ds1.idDosen = "12345";
        ds1.nama = "Bu Vivin";
        ds1.statusAktif = true;
        ds1.tahunBergabung = 2014;
        ds1.bidangKeahlian = "Algoritma";

        ds1.tampilInformasi();
        ds1.ubahKeahlian("Struktur Data");
        System.out.println("--- Data Telah Diubah ---");
        ds1.tampilInformasi();
        System.out.println("Masa Kerja: " + ds1.hitungMasaKerja(2025) + " Tahun");
        System.out.println("====================================");
        
        System.out.println();
        Dosen14 ds2 = new Dosen14("54321", "Pak Imam", false, 2012, "Dasar Pemrograman");
        ds2.tampilInformasi();
        ds2.statusAktif = true;
        System.out.println("--- Data Telah Diubah ---");
        ds2.tampilInformasi();
        System.out.println("Masa Kerja: " + ds2.hitungMasaKerja(2025) + " Tahun");
        System.out.println("====================================");
    }
}