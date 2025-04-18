public class Mahasiswa {
    String NIM;
    String nama;
    String prodi;

    public Mahasiswa(String NIM, String nama, String prodi){
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
    }

    void tampilMahasiswa(){
        System.out.printf("| %-15s | %-20s | %-12s |\n", NIM, nama, prodi);
    }
}