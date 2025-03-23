import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen14 dataDosen = new DataDosen14();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda - Selection Sort)");
            System.out.println("5. Sorting DSC (Tertua ke Termuda - Insertion Sort)");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (dataDosen.idx >= 10) {
                        System.out.println("Data sudah penuh!");
                        break;
                    }
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis kelamin (L/P): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    Dosen14 dsn = new Dosen14(kode, nama, usia, jenisKelamin);
                    dataDosen.tambah(dsn);
                    break;

                case 2:
                    dataDosen.tampil();
                    break;

                case 3:
                    dataDosen.bubbleSortASC();;
                    dataDosen.tampil();
                    break;

                case 4:
                    dataDosen.selectionSortDSC();
                    dataDosen.tampil();
                    break;

                case 5:
                    dataDosen.insertionSortDSC();
                    dataDosen.tampil();
                    break;

                case 0:
                    System.out.println("Terima Kasih.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}