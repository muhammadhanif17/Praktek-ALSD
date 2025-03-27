import java.util.Scanner;

public class SequentialSearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] angka = {24, 41, 7, 2, 1, 13};
        System.out.println("-- Sistem Sequential Search --");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();
        int idxCari = -1;

        for (int i = 0; i < angka.length; i++) {
            if (cari == angka[i]) {
                idxCari = i;
                break;
            }
        }
          
        if (idxCari == -1) {
            System.out.println("Angka yang dicari tidak ditemukan");
        }else{
            System.out.println("Nilai " + angka[idxCari] + " ketemu di index " + idxCari);
        }
    }
}