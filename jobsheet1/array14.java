import java.util.Scanner;

public class array14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("======================================");
        System.out.println("=== Program Menghitung IP Semester ===");
        System.out.println("======================================");
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jmlMatkul = sc.nextInt();
        sc.nextLine();
        
        //Deklarasi variabel Array
        String[] namaMatkul = new String[jmlMatkul];
        String[] nilaiHuruf = new String[jmlMatkul];
        int[] jmlSks = new int[jmlMatkul];
        double[] nilaiAngka = new double[jmlMatkul];
        double[] bobotNilai =new double[jmlMatkul];
        
        //Input data
        System.out.println("======================================");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i+1) +": ");
            namaMatkul[i] = sc.nextLine();
            System.out.print("Masukkan jumlah SKS: ");
            jmlSks[i] = sc.nextInt();
            System.out.print("Masukkan nilai mata kuliah " + namaMatkul[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
            sc.nextLine();
            System.out.println();
            if (nilaiAngka[i] <= 100 && nilaiAngka[i] > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.00;
            }else if (nilaiAngka[i] <= 80 && nilaiAngka [i] > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            }else if (nilaiAngka[i] <= 73 && nilaiAngka [i] > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            }else if (nilaiAngka[i] <= 65 && nilaiAngka [i] > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            }else if (nilaiAngka[i] <= 60 && nilaiAngka [i] > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            }else if (nilaiAngka[i] <= 50 && nilaiAngka [i] > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            }else if (nilaiAngka[i] <= 39 && nilaiAngka [i] >= 0) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }else{
                System.out.println("Nilai Tidak Tersedia, ulangi!");
                i--;
                continue;
            }
        }
        
        //Menghitung IP semester
        int totalSks = 0;
        for (int i = 0; i < jmlSks.length; i++) {
            totalSks += jmlSks[i];
        }
        double ipSemester = 0;
        for (int i = 0; i < bobotNilai.length; i++) {
            ipSemester += ((double) (bobotNilai[i] * jmlSks[i]) / totalSks);
        }
        
        //Menampilkan tabel data
        System.out.println();
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-25s %-15s %-15s %-15s %-15s %n" , "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai","Jumlah SKS");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.printf("%-25s %-15s %-15s %-15s %-15s %n", namaMatkul[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i], jmlSks[i]);
        }
        System.out.println("====================");
        System.out.println("IP : " + ipSemester);

    }
}