public class MahasiswaMain14 {
    public static void main(String[] args) {
        mahasiswa14 mhs1 = new mahasiswa14();
        mhs1.nama = "Muhammad Hanif";
        mhs1.nim = "244107020118";
        mhs1.kelas = "TI 1F";
        mhs1.ipk = 3.81;

        mhs1.tampilkanInformasi();;
        mhs1.ubahKelas("TI 2F");
        mhs1.updateIpk(4.0);
        mhs1.tampilkanInformasi();
         
        mahasiswa14 mhs2 = new mahasiswa14("Annisa Nabila", "2441720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();;

        mahasiswa14 mhsHanif = new mahasiswa14("Hanif", "244107020118", 3.85, "TI 1F");
        mhsHanif.tampilkanInformasi();;
    }
}