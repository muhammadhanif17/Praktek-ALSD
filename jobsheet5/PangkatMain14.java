import java.util.Scanner;

public class PangkatMain14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        Pangkat14[] png = new Pangkat14[elemen];
        for (int i = 0; i < png.length; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat14(basis, pangkat);
        }

        System.out.println("\nHasil Pangkat BruteForce:");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatBF());
        }
        System.out.println("\nHasil Pangkat Divide and Conquer:");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + " = " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}