import java.util.Scanner;

public class MahasiswaDemo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa14[] arrayOfMahasiswa14 = new Mahasiswa14[3];
        Mahasiswa14[] myArrayOfMahasiswa14 = new Mahasiswa14[3];
        String dummy;

        myArrayOfMahasiswa14[0].nim = "123";
        myArrayOfMahasiswa14[0].nama = "Hanif";
        myArrayOfMahasiswa14[0].kelas = "TI-2F";
        myArrayOfMahasiswa14[0].ipk = (float) 4.0;
        
        for (int i = 0; i < arrayOfMahasiswa14.length; i++) {
            arrayOfMahasiswa14[i] = new Mahasiswa14();

            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa14[i].nim = sc.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa14[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa14[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa14[i].ipk = Float.parseFloat(dummy);
            System.out.println("-------------------------------");
        }
        
        for (int i = 0; i < arrayOfMahasiswa14.length; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));
            arrayOfMahasiswa14[i].cetakInfo();
        }
    }
}