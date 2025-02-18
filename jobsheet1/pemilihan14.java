import java.util.Scanner;

public class pemilihan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Input nilai mahasiswa
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int nilaiTugas14 = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int nilaiKuis14 = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int nilaiUTS14 = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int nilaiUAS14 = sc.nextInt();
        System.out.println("==============================");
        System.out.println("==============================");
        
        //Hitung nilai akhir mahasiswa
        double nilaiAkhir = ((double) (0.2 * nilaiTugas14) + (0.2 * nilaiKuis14) + (0.3 * nilaiUTS14) + (0.3 * nilaiUAS14));
        String nilaiHuruf = "";

        //Menentukan serta menampilkan nilai huruf
        if (nilaiKuis14 > 100 || nilaiTugas14 > 100 || nilaiUTS14 > 100 || nilaiUAS14 > 100 || nilaiTugas14 < 0 
        || nilaiKuis14 < 0 || nilaiUTS14 < 0 || nilaiUAS14 < 0) {
            System.out.println("nilai tidak valid");

        }else{
            if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
                nilaiHuruf = "A";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
                nilaiHuruf = "B+";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
                nilaiHuruf = "B";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
                nilaiHuruf = "C+";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
                nilaiHuruf = "C";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
                nilaiHuruf = "D";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }else {
                nilaiHuruf = "E";
                System.out.println("nilai akhir : " + nilaiAkhir);
                System.out.println("nilai huruf : " + nilaiHuruf);
            }
        }
        
        //Menentukan status kelulusan
        System.out.println("==============================");
        System.out.println("==============================");
        if (nilaiHuruf == "A" || nilaiHuruf == "B+" || nilaiHuruf == "B" || nilaiHuruf == "C+" || nilaiHuruf == "C") {
            System.out.println("SELAMAT ANDA LULUS");   
        }else if(nilaiHuruf == "D" || nilaiHuruf == "E") {
            System.out.println("MAAF ANDA TIDAK LULUS");   
        }
    }
}