import java.util.Scanner;

public class perulangan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input nim mahasiswa
        System.out.print("Masukkan NIM: "); 
        long nim = sc.nextLong();
        System.out.println("======================");

        nim %= 100; //Menentukan 2 digit terakhir nim
        if (nim < 10) {
            nim += 10;
        }
        System.out.println("n = " + nim);
        
        //Menampilkan hasil
        for (int i = 1; i <= nim; i++) {
            if (i == 6 || i == 10) {
                continue;
            }else{
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }else{
                    System.out.print("* ");
                }
            }
        }
    }
}