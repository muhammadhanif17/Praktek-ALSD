import java.util.Scanner;

public class RekeningDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Sistem Bank Sederhana ===");
        System.out.print("Masukkan jumlah rekening: ");
        int jmlRek = sc.nextInt();
        sc.nextLine();

        Rekening14 arrayOfRekening14[] = new Rekening14[jmlRek];
        System.out.println("\n--- Input Data Rekening ---");
        for (int i = 0; i < arrayOfRekening14.length; i++) {
            System.out.println("Masukkan data rekening ke-" + (i+1));
            System.out.print("Nomor Rekening: ");
            String nomorRekening = sc.nextLine();
            System.out.print("Nama Pemilik  : ");
            String namaPemilik = sc.nextLine();
            System.out.print("Saldo         : ");
            double saldo = sc.nextDouble();
            sc.nextLine();
            System.out.println("--------------------------");
            arrayOfRekening14[i] = new Rekening14(nomorRekening, namaPemilik, saldo);
            
        }

        System.out.println("\n--- Tampilkan Data ---");
        for (int i = 0; i < arrayOfRekening14.length; i++) {
            System.out.println("Data rekening ke-" + (i+1));
            arrayOfRekening14[i].tampilkanInfo();
        }
        
        System.out.println("\n--- Tampilkan Data ---");
        for (int i = 0; i < arrayOfRekening14.length; i++) {
            System.out.println("Data rekening ke-" + (i+1));
            arrayOfRekening14[i].tampilkan();
        }
    }
}