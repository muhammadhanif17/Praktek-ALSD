import java.util.Scanner;

public class MataKuliahDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah matakuliah: ");
        int jmlMK = sc.nextInt();
        MataKuliah14[] arrayOfMataKuliah14 = new MataKuliah14[jmlMK];

        System.out.println("--------------------------------------");
        for (int i = 0; i < arrayOfMataKuliah14.length; i++) {
            arrayOfMataKuliah14[i] = new MataKuliah14();
            System.out.println("Masukkan data matakuliah ke-" + (i+1));
            arrayOfMataKuliah14[i].tambahData();
        }
        
        for (int i = 0; i < arrayOfMataKuliah14.length; i++) {
            System.out.println("Data matakuliah ke-" + (i+1));
            arrayOfMataKuliah14[i].cetakInfo();
        }
    }
}