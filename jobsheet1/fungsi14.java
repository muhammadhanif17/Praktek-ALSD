import java.util.Scanner;

public class fungsi14 {
    public static void main(String[] args) {
        System.out.println("===================================================");
        System.out.println("==== Sistem Perhitungan Pendapatan Royal Garden ===");
        System.out.println("===================================================");

        //Deklarasi variabel Array
        String[] jenisBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        String[] cabangToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int[][] stokBunga = {{10,5,15,7}, {6,11,9,12}, {2,10,10,5}, {5,7,12,9}};
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        hitungPendapatan14(jenisBunga, cabangToko, stokBunga, hargaBunga);//Panggil fungsi hitungPendapatan14

    }

    //Fungsi untuk menghitung pendapatan tiap cabang dan menampilkan tabelnya
    public static void hitungPendapatan14(String[] jenisBunga, String[] cabangToko, int[][] stokBunga, int[] hargaBunga){
        System.out.println();
        System.out.println("=== Pendapatan Tiap Cabang Royal Garden ===");
        System.out.println();
        System.out.printf("%-21s", "");
        for (int i = 0; i < jenisBunga.length; i++) {
            if (i == jenisBunga.length - 1) {
                System.out.printf("%-15s %-15s", jenisBunga[i], "TOTAL");
            }else{
                System.out.printf("%-15s", jenisBunga[i]);
            }
        }
        for (int i = 0; i < stokBunga.length; i++) {
            int totalHarga = 0;
            System.out.printf("%n %-20s", cabangToko[i] + ": ");
            for (int j = 0; j < stokBunga[i].length; j++) {
                totalHarga += hargaBunga[j] * stokBunga[i][j];
                if (j == stokBunga[i].length -1 ) {
                    System.out.printf("%-15s|%-15s", "Rp. " + hargaBunga[j]*stokBunga[i][j], "Rp. " + totalHarga);
                }else{
                    System.out.printf("%-15s", "Rp. " + hargaBunga[j]*stokBunga[i][j]);
                }
            }
        }
        penguranganStok14(jenisBunga, stokBunga); //Panggil fungsi penguranganStok14
    }
    
    //Fungsi untuk mengurangi stok bunga RoyalGarden 4
    public static void penguranganStok14(String[] jenisBunga, int[][] stokBunga){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.println("=== Pengurangan Stok Bunga Cabang RoyalGarden 4 ===");
        System.out.println();
        int[] bungaMati = new int[jenisBunga.length];

        //Menampilkan jumlah bunga sebelum dikurangi
        System.out.println("Jumlah bunga RoyalGarden 4 sebelum pengurangan");
        for (int i = 0; i < bungaMati.length; i++) {
            System.out.println(jenisBunga[i] + ": " + stokBunga[3][i]);
        }

        //Input jumlah bunga yang mati
        System.out.println("===========================");
        System.out.println("Input jumlah bunga yang mati tiap jenis");
        for (int i = 0; i < stokBunga.length; i++) {
            System.out.print(jenisBunga[i] + ": ");
            bungaMati[i] = sc.nextInt();
            stokBunga[3][i] -= bungaMati[i];
        }

        //Menampilkan jumlah bunga setelah dikurangi
        System.out.println("===========================");
        System.out.println("Jumlah bunga RoyalGarden 4 setelah pengurangan");
        for (int i = 0; i < bungaMati.length; i++) {
            System.out.println(jenisBunga[i] + ": " + stokBunga[3][i]);
        }
    }
}