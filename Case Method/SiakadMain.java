import java.util.Scanner;

public class SiakadMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mahasiswa[] mhs = {
            new Mahasiswa("244107020195", "Arya Ramadhan", "Informatika"),
            new Mahasiswa("244107020071", "Louis Judia B. Sinaga", "Informatika"),
            new Mahasiswa("244107020118", "Muhamad Hanif", "Informatika")
        };
        
        MataKuliah[] matkul = {
            new MataKuliah("MK001", "Struktur Data", 3),
            new MataKuliah("MK002", "Basis Data", 3),
            new MataKuliah("MK003", "Desain Web", 3)
        };

        Penilaian[] nilai = {
            new Penilaian(mhs[0], matkul[0], 85, 90, 87),
            new Penilaian(mhs[0], matkul[1], 82, 90, 85),
            new Penilaian(mhs[1], matkul[1], 90, 87, 85),
            new Penilaian(mhs[1], matkul[2], 85, 90, 90),
            new Penilaian(mhs[2], matkul[0], 95, 80, 85),
            new Penilaian(mhs[2], matkul[2], 85, 90, 95),
        };
    }
}
