public class Surat14 {
    String idSurat;
    String namaMhs;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat14(){

    }

    public Surat14(String idSurat, String namaMhs, String kelas, char jenisIzin, int durasi){
        this.idSurat = idSurat;
        this.namaMhs = namaMhs;
        this.kelas = kelas;
        this.jenisIzin = jenisIzin;
        this.durasi = durasi;
    }

    public void print(){
        System.out.println("ID: " + idSurat + ", Nama: " + namaMhs + ", Kelas: " + kelas +
        ", Jenis Izin: " + jenisIzin + ", Durasi: " + durasi + " hari");
    }
}
