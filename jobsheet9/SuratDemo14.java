import java.util.Scanner;

public class SuratDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat14 stack = new StackSurat14(5);
        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt(); sc.nextLine();
                    stack.push(new Surat14(id, nama, kelas, jenis, durasi));
                    System.out.println("Surat berhasil ditambahkan.");
                    break;
                case 2:
                    System.out.println("Surat yang terdaftar: ");
                    System.out.println("ID Surat\tNama\tKelas\tJenis Izin\tDurasi");
                    stack.print();
                    break;
                case 3:
                    Surat14 terakhir = stack.peek();
                    if (terakhir != null) {
                        System.out.println("Surat izin terakhir:");
                        terakhir.print();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    boolean ditemukan = stack.cariSurat(cari);
                    if (ditemukan) {
                        System.out.println("Surat ditemukan untuk mahasiswa " + cari);
                    } else {
                        System.out.println("Tidak ada surat atas nama " + cari);
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih < 4);
    }
}