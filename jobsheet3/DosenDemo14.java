import java.util.Scanner;

public class DosenDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: "); //Input jumlah dosen
        int jmlDosen = sc.nextInt();
        sc.nextLine();

        //Membuat Arrray Of Object dosen
        Dosen14 arrayOfDosen[] = new Dosen14[jmlDosen];

        //Input data dosen
        for (int i = 0; i < arrayOfDosen.length; i++) {
            System.out.println("--------------------------------------");
            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.print("Kode Dosen    : ");
            String kode = sc.nextLine();
            System.out.print("Nama Dosen    : ");
            String nama = sc.nextLine();
            System.out.print("Kelamin (Pria/Wanita) : ");
            String Jk = sc.nextLine();
            boolean jenisKelamin = false; //defaultnya wanita
            if (Jk.equalsIgnoreCase("Pria")) {
                jenisKelamin = true; // Pria
            } else if (Jk.equalsIgnoreCase("Wanita")) {
                jenisKelamin = false; // Wanita
            } else { //Jika input tidak valid maka jenis kelamin akan dibuat menjadi wanita(kondisi default)
                System.out.println("Input tidak valid, diset sebagai Wanita.");
            }
            System.out.print("Usia Dosen    : ");
            int usia = sc.nextInt();
            sc.nextLine();
            
            arrayOfDosen[i] = new Dosen14(kode, nama, jenisKelamin, usia);
        }
        //Menampilkan data dosen
        // System.out.println("\n--- Data Dosen ---");
        // for (Dosen14 dosen14 : arrayOfDosen) {
        //     System.out.println("Kode    : " + dosen14.kode);
        //     System.out.println("Nama    : " + dosen14.nama);
        //     if (dosen14.jenisKelamin) {
        //         System.out.println("Kelamin : Pria");
        //     }else{
        //         System.out.println("Kelamin : Wanita");

        //     }
        //     System.out.println("Usia    : " + dosen14.usia);
        //     System.out.println("--------------------------------------");
        // }

        //Membuat objek dari class DataDosen14
        DataDosen14 dataDosen14 = new DataDosen14();

        //Memanggil method dari DataDosen14
        dataDosen14.dataSemuaDosen(arrayOfDosen);
        dataDosen14.jumlahDosenPerJenisKelamin(arrayOfDosen);
        dataDosen14.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        dataDosen14.infoDosenPalingTua(arrayOfDosen);
        dataDosen14.infoDosenPalingMuda(arrayOfDosen);
    }
}