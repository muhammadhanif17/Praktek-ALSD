import java.util.Scanner;

public class Tugas3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("================================================");
        System.out.println("=== Sistem Pengelolaan Data Matkul Mahasiswa ===");
        System.out.println("================================================");
        System.out.print("\nMasukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();

        //Deklarasi variabel Array
        String[] namaMatkul = new String[jmlMatkul];
        String[] hari = new String[jmlMatkul];
        int[] jmlSks = new int[jmlMatkul];
        int[] semester = new int[jmlMatkul];
        
        //Input data
        System.out.println("\nInput Data Mata Kuliah");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nama Mata Kuliah ke-" + (i+1) + ": ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Jumlah SKS: ");
            jmlSks[i] = sc.nextInt();
            System.out.print("Semester: ");
            semester[i] = sc.nextInt();
            sc.nextLine();
            System.out.print("Hari Kuliah: ");
            hari[i] = sc.nextLine();
        }
        menu14(namaMatkul, hari, semester, jmlSks);
    }
    
    //Fungsi untuk memilih Menu
    public static void menu14(String[] namaMatkul, String[] hari, int[] semester, int[] jmlSks){
        boolean lanjut = true;
        while (lanjut == true) {
            System.out.println("\n== Pilihan Menu ==");
            System.out.println("1. Tampilkan Seluruh Jadwal");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu (1-5): ");
            int menu = sc.nextInt();
            sc.nextLine();
            switch (menu) {
                case 1:
                    tampilkanSeluruhJadwal14(namaMatkul, hari, semester, jmlSks);
                    break;
                case 2:
                    tampilkanJadwalHari(namaMatkul, hari, semester, jmlSks);
                    break;
                case 3:
                    tampilkanJadwalSemester(namaMatkul, hari, semester, jmlSks);
                    break;
                case 4:
                    cariMatkul14(namaMatkul, hari, semester, jmlSks);
                    break;
                case 5:
                    lanjut = false;
                    System.out.println("Terima Kasih");
                    return;
                default:
                System.out.println("Pilihan menu tidak tersedia, ulangi!");
                    continue;
            }
        }
    }

    //Fungsi untuk menampilkan seluruh jadwal
    public static void tampilkanSeluruhJadwal14(String[] namaMatkul, String[] hari, int[] semester, int[] jmlSks){
        System.out.println();
        System.out.printf("%-17s %-12s %-12s %-12s \n", "Nama Matkul", "Hari", "Semester", "SKS");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
        }
    }

    //Fungsi untuk menampilkan jadwal per hari
    public static void tampilkanJadwalHari(String[] namaMatkul, String[] hari, int[] semester, int[] jmlSks){
        System.out.print("\nJadwal pada hari: ");
        String namaHari = sc.nextLine();
        boolean ditemukan = false;
        int awal = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaHari.equalsIgnoreCase(hari[i])) {
                ditemukan = true;
                if (awal == 0) {
                    System.out.printf("%-17s %-12s %-12s %-12s \n", "Nama Matkul", "Hari", "Semester", "SKS");
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                    awal++;
                }else{
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Hari tidak ditemukan!");
        }
    }
    
    //Fungsi untuk menampilkan jadwal per semester
    public static void tampilkanJadwalSemester(String[] namaMatkul, String[] hari, int[] semester, int[] jmlSks){
        System.out.print("\nJadwal pada semester: ");
        int s = sc.nextInt();
        sc.nextLine();
        boolean ditemukan = false;
        int awal = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (s == semester[i]) {
                ditemukan = true;
                if (awal == 0) {
                    System.out.printf("%-17s %-12s %-12s %-12s \n", "Nama Matkul", "Hari", "Semester", "SKS");
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                    awal++;
                }else{
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Semester tidak ditemukan!");
        }
    }
    
    //Fungsi untuk menampilkan jadwal per matkul
    public static void cariMatkul14(String[] namaMatkul, String[] hari, int[] semester, int[] jmlSks){
        System.out.print("\nMasukkan nama Mata Kuliah yang ingin dicari: ");
        String matkul = sc.nextLine();
        boolean ditemukan = false;
        int awal = 0;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (matkul.equalsIgnoreCase(namaMatkul[i])) {
                ditemukan = true;
                if (awal == 0) {
                    System.out.printf("%-17s %-12s %-12s %-12s \n", "Nama Matkul", "Hari", "Semester", "SKS");
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                    awal++;
                }else{
                    System.out.printf("%-17s %-12s %-12s %-12s \n", namaMatkul[i], hari[i], semester[i], jmlSks[i]);
                }
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan!");
        }
    }
}