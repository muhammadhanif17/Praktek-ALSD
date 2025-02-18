public class Dosen14 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen14(){

    }

    public Dosen14(String id, String nm, boolean status, int tahunGabung, String bidangAhli){
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = tahunGabung;
        bidangKeahlian = bidangAhli;
    }

    void tampilInformasi(){
        System.out.println("Id dosen: " + idDosen);
        System.out.println("Nama dosen: " + nama);
        System.out.println("Status keaktifan: " + statusAktif);
        System.out.println("Tahun bergabung: " + tahunBergabung);
        System.out.println("Bidang keahlian: " + bidangKeahlian);
    }

    void setStatusAktif(boolean status){
        statusAktif = status;
        System.out.println("Status Dosen " + nama + ": ");
        if (status == true) {
            System.out.println("Status = Aktif");
        }else{
            System.out.println("Status = Tidak Aktif");
        }
    }

    int hitungMasaKerja(int thnSkrg){
        int masaKerja = thnSkrg - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang){
        bidangKeahlian = bidang;
    }
}
