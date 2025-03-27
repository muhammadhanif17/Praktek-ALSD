import java.util.Scanner;

public class Rekening14 {
    public String nomorRekening;
    public String namaPemilik;
    public double saldo;

    public Rekening14(String nomorRekening, String namaPemilik, double saldo){
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }
    
    void tampilkanInfo(){
        System.out.println("Nomor Rekening  : " + nomorRekening);
        System.out.println("Nama Pemilik    : " + namaPemilik);
        System.out.println("Saldo           : Rp. " + saldo);
        System.out.println("--------------------------");
    }
    void tampilkan(){
        System.out.println("Nomor Rekening  : " + nomorRekening);
        System.out.println("Nama Pemilik    : " + namaPemilik);
        if (saldo > 100000) {
            System.out.println("Saldo masih banyak");
        }else{
            System.out.println("Saldo limited");
        }
        System.out.println("--------------------------");
    }
}