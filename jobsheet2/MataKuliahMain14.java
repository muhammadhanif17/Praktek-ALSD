public class MataKuliahMain14 {
    public static void main(String[] args) {
        System.out.println("=== Data Mata Kuliah ===");
        MataKuliah14 mk1 = new MataKuliah14();
        mk1.kodeMk = "ALSD";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        System.out.println("--- Data Telah Diubah ---");
        mk1.tampilInformasi();
        
        System.out.println();
        MataKuliah14 mk2 = new MataKuliah14("DASPRO", "Dasar Pemrograman", 2, 4);
        mk2.tampilInformasi();
        mk2.kurangiJam(5);
        mk2.ubahSKS(3);
        System.out.println("--- Data Telah Diubah ---");
        mk2.tampilInformasi();
    }
    
}