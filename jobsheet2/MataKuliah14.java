public class MataKuliah14 {
    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah14(){

    }
    
    public MataKuliah14(String kodeMatkul, String nm, int sks, int jmljam){
        kodeMk = kodeMatkul;
        nama = nm;
        this.sks = sks;
        jumlahJam = jmljam;
    }

    void tampilInformasi(){
        System.out.println("Kode mata kuliah: " + kodeMk);
        System.out.println("Nama mata kuliah: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah jam: " + jumlahJam);
    }

    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS telah diubah");
    }

    void tambahJam(int jam){
        jumlahJam += jam;
    }

    void kurangiJam(int jam){
        if (jumlahJam < jam) {
            System.out.println("Pengurangan jam tidak dapat dilakukan!");
        }else{
            jumlahJam -= jam;
        }
    }
}