import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa14 stack = new StackTugasMahasiswa14(5);
        int pilih;
        do {
            System.out.println("\nMenu: ");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Tugas Pertama");
            System.out.println("5. Melihat Jumlah Tugas yang Terkumpul");
            System.out.println("6. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("Nim: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa14 mhs = new Mahasiswa14(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.println("Tugas " + nama + " berhasil dikumpulkan");
                    break;
                case 2:
                    Mahasiswa14 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.println("Nilai Tugas " + dinilai.nama + " adalah " + nilai);
                        String biner = stack.konversiDesimalkeBinner(nilai);
                        System.out.println("Nilai Biner Tugas " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa14 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    Mahasiswa14 bawah = stack.bottom();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;
                case 5:
                    System.out.println("Jumlah tugas yang terkumpul saat ini: " + stack.jumlahTugas());
                    break;
                case 6:
                    System.out.println("Daftar semua tugas: ");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih >= 1 && pilih < 6);
    }
}
