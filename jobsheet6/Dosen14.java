public class Dosen14 {
    String kode;
    String nama;
    int usia;
    boolean jenisKelamin;

    public Dosen14(String kd, String name, int age, boolean jk){
        kode = kd;
        nama = name;
        usia = age;
        jenisKelamin = jk;
    }

    void tampil(){
        System.out.printf("| %-6s | %-15s | %-12s | %-4d  |\n", 
        kode, nama, (jenisKelamin ? "Laki-laki" : "Perempuan"), usia);
    }
}