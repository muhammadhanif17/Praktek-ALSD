import java.util.Scanner;

public class MataKuliah14 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah14(){

    }

    void tambahData(){
        Scanner sc = new Scanner(System.in);
        String dummy;
        System.out.print("Kode      : ");
        kode = sc.nextLine();
        System.out.print("Nama      : ");
        nama = sc.nextLine();
        System.out.print("Sks       : ");
        dummy = sc.nextLine();
        sks = Integer.parseInt(dummy);
        System.out.print("Jumlah jam: ");
        dummy = sc.nextLine();
        jumlahJam = Integer.parseInt(dummy);
        System.out.println("-----------------------------");
    }

    void cetakInfo(){
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("Sks         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
        System.out.println("-----------------------------");
    }
}