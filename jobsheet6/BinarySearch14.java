import java.util.Scanner;

public class BinarySearch14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] angka = {24, 41, 7, 2, 1, 13};
        for (int i = 0; i < angka.length; i++){
            System.out.print(angka[i] + " ");
        }
        System.out.println();
        System.out.println("-- Sistem Binary Search --");
        System.out.print("Masukkan angka yang ingin dicari: ");
        int cari = sc.nextInt();

        selectionSort(angka);
        
        boolean ditemukan = false;
        int awal = 0, akhir = angka.length-1;
        int idxTengah = -1;
        while (awal <= akhir) {
            idxTengah = (awal + akhir)/2;
            if (cari == angka[idxTengah]) {
                ditemukan = true;
                break;
            }else if (cari > angka[idxTengah]) {
                awal = idxTengah + 1;
            }else {
                akhir = idxTengah - 1;
            }
        }
        if (!ditemukan) {
            System.out.println("Angka yang dicari tidak ditemukan");
        }else{
            System.out.println("Nilai " + angka[idxTengah] + " ketemu di index " + idxTengah);
        }
    }
    
    static void selectionSort(int[] angka){
        for (int i = 0; i < angka.length-1; i++) {
            int min = i;
            int temp;
            for (int j = i+1; j < angka.length; j++) {
                if (angka[j] < angka[min]) {
                    min = j;
                }            
            }
            temp = angka[i];
            angka[i] = angka[min];
            angka[min] = temp;
        }
    }
}