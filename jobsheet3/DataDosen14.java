public class DataDosen14 {
    //a. tampilkan semua data dosen
    void dataSemuaDosen(Dosen14[] arrayOfDosen14){
        System.out.println("\n--- Data semua dosen ---");
        System.out.printf("%-12s %-20s %-20s %-12s\n", "Kode", "Nama", "Jenis Kelamin", "Usia");
        System.out.println("-------------------------------------------------------------------");
        for (int i = 0; i < arrayOfDosen14.length; i++) {
            String jenisKelamin = arrayOfDosen14[i].jenisKelamin ? "Pria" : "Wanita";
            System.out.printf("%-12s %-20s %-20s %-12s\n", arrayOfDosen14[i].kode, arrayOfDosen14[i].nama,
            jenisKelamin, arrayOfDosen14[i].usia);
        }
    }

    //b. tampilkan jumlah dosen per jenis kelamin
    void jumlahDosenPerJenisKelamin(Dosen14[] arrayOfDosen14){
        int pria = 0, wanita = 0;
        for (Dosen14 dosen14 : arrayOfDosen14) {
            if (dosen14.jenisKelamin) {
                pria++;
            }else{
                wanita++;
            }
        }
        System.out.println("\n\n--- Jumlah dosen per jenis kelamin ---");
        System.out.println("Pria    : " + pria);
        System.out.println("Wanita  : " + wanita);
    }

    //c. tampilkan rata-rata usia dosen per jenis kelamin
    void rerataUsiaDosenPerJenisKelamin(Dosen14[] arrayOfDosen14){
        int totUsiaPria = 0, totUsiaWanita = 0;
        int jmlPria = 0, jmlWanita = 0;

        for (Dosen14 dosen14 : arrayOfDosen14) {
            if (dosen14.jenisKelamin) {
                totUsiaPria += dosen14.usia;
                jmlPria++;
            }else{
                totUsiaWanita += dosen14.usia;
                jmlWanita++;
            }
        }
        
        double rataPria = (double) totUsiaPria/jmlPria;
        double rataWanita = (double) totUsiaWanita/jmlWanita;

        System.out.println("\n--- Rata-Rata usia dosen per jenis kelamin ---");
        System.out.println("Pria    : " + rataPria);
        System.out.println("Wanita  : " + rataWanita);
    }

    //d. tampilkan data dosen paling tua
    void infoDosenPalingTua(Dosen14[] arrayOfDosen14){
        int usiaTertua = arrayOfDosen14[0].usia;
        //Mencari usia tertua
        for (int i = 1; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia > usiaTertua) {
                usiaTertua = arrayOfDosen14[i].usia;
            }
        }
        //Tampilkan dosen tertua
        System.out.println("\n--- Nama dosen tertua ---");
        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia == usiaTertua) {
                System.out.println(arrayOfDosen14[i].nama);
            }
        }
    }

    //d. tampilkan data dosen paling muda
    void infoDosenPalingMuda(Dosen14[] arrayOfDosen14){
        int usiTermuda = arrayOfDosen14[0].usia;
        //Mencari usia termuda
        for (int i = 1; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia < usiTermuda) {
                usiTermuda = arrayOfDosen14[i].usia;
            }
        }
        //Tampilkan dosen termuda
        System.out.println("\n--- Nama dosen termuda ---");
        for (int i = 0; i < arrayOfDosen14.length; i++) {
            if (arrayOfDosen14[i].usia == usiTermuda) {
                System.out.println(arrayOfDosen14[i].nama);
            }
        }
    }
}