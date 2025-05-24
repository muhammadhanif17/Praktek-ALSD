import java.util.Scanner;

public class MainKRS14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS14 antrianKRS14 = new AntrianKRS14(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian KRS ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tamppilkan semua Antrian");
            System.out.println("4. Tampilkan 2 Mahasiswa Terdepan");
            System.out.println("5. Tampilkan Antrian terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Jumlah yang diproses");
            System.out.println("8. Jumlah yang belum diproses");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nim, nama, prodi, kelas);
                    antrianKRS14.tambahAntrian(mhs);
                    break;
                case 2:
                    Mahasiswa14[] mhsDiproses = antrianKRS14.prosesKRS();
                    if (mhsDiproses != null) {
                        for (Mahasiswa14 mahasiswa : mhsDiproses) {
                            mahasiswa.tampilkanData();
                        }
                    }
                    break;
                case 3:
                    antrianKRS14.tampilkanSemua();
                    break;
                case 4:
                    antrianKRS14.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrianKRS14.tampilAntrianAkhir();
                    break;
                case 6:
                    antrianKRS14.cetakJumlahAntrian();
                    break;
                case 7:
                    antrianKRS14.cetakJumlahDiproses();
                    break;
                case 8:
                    antrianKRS14.cetakJumlahBelumProses();
                    break;
                case 9:
                    antrianKRS14.clear();
                    break;
                case 0:
                    System.out.println("Terima Kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 0);
    }
}