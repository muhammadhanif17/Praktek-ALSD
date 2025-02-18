import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean lanjut = true;

        //Input menu
        while (lanjut) {
            System.out.println("== Menu Utama ==");
            System.out.println("1. Hitung Volume");
            System.out.println("2. Hitung Luas Permukaan");
            System.out.println("3. Hitung Keliling");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4): ");
            int menu = sc.nextInt();
            int volume;
            switch (menu) {
                case 1:
                    volume = hitungVolume(sc);
                    System.out.println("Volume kubus = " + volume);
                    System.out.println();
                    break;
                case 2:
                    volume = hitungLP(sc);
                    System.out.println("Luas Permukaan Kubus = " + volume);
                    System.out.println();
                    break;
                case 3:
                    volume = hitungKeliling(sc);
                    System.out.println("Keliling Kubus = " + volume);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Terima Kasih");
                    lanjut = false;
                    break;
                default:
                System.out.println("Pilihan menu tidak tersedia, ulangi!");
                    continue;
            }
        }
    }

    //Fungsi untuk menghitung volume
    public static int hitungVolume(Scanner sc){
        System.out.println();
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        int volume = sisi * sisi * sisi;
        return volume; 
    }

    //Fungsi untuk menghitung luas permukaan
    public static int hitungLP(Scanner sc){
        System.out.println();
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        int LP = sisi * sisi;
        return LP; 
    }
    
    //Fungsi untuk menghitung keliling
    public static int hitungKeliling(Scanner sc){
        System.out.println();
        System.out.print("Masukkan sisi kubus: ");
        int sisi = sc.nextInt();

        int Keliling = sisi * 12;
        return Keliling; 
    }
}