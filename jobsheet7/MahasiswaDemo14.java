import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();
        
        MahasiswaBerprestasi14 list = new MahasiswaBerprestasi14(jml);

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i+1) + ": ");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa14 mhs = new Mahasiswa14(nim, nama, kelas, ipk);
            list.tambah(mhs);
        }

        System.out.println("\nData mahasiswa: ");
        list.tampil();
        //melakukan pencarian data sequential
        System.out.println("--------------------------------------");
        System.out.println("Pecarian data");
        System.out.println("--------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        
        System.out.println("\nMenggunakan sequential search");
        System.out.println("--------------------------------------");
        double posisi = list.sequentialSearching(cari);
        int pss = (int) posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        //menggunakan binary search
        System.out.println("\nMenggunakan binary search");
        System.out.println("--------------------------------------");
        double posisi2 = list.binarySearch(cari, 0, jml-1);
        int pss2 = (int) posisi2;
        list.tampilDataSearch(cari, pss2);

    }
}