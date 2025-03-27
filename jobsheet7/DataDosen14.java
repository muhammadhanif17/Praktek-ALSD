public class DataDosen14 {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx = 0;

    //Method untuk menambahkan data dosen
    void tambah(Dosen14 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    //Method untuk menampilkan data dosen
    void tampil(){
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        System.out.println("--------------------------------------------------");
        System.out.println("| Kode   | Nama            | Jenis Kelamin | Usia |");
        System.out.println("---------------------------------------------------");
        for (int i = 0; i < dataDosen.length; i++) {
            if(dataDosen[i] != null){
                dataDosen[i].tampil();
            }
        }
        System.out.println("---------------------------------------------------");
    }
    
    //method sorting ASC menggunakan bubblesort
    void bubbleSortASC(){
        for (int i = 0; i < idx-1; i++) {
            for (int j = 1; j < idx-i; j++) {
                if (dataDosen[j] != null) {
                    if (dataDosen[j].usia < dataDosen[j-1].usia) {
                        Dosen14 tmp = dataDosen[j];
                        dataDosen[j] = dataDosen[j-1];
                        dataDosen[j-1] = tmp;
                    }
                }
            }
        }
    }
    
    // method untuk mencari data dosen berdasarkan nama menggunakan sequential search
    void PencarianDataSequential14(String cari){
        boolean ditemukan = false;
        int jmlHasil = 0;
        System.out.println("\nHasil Pencarian(Sequential Search): ");
        System.out.println("--------------------------------------------------");
        System.out.println("| Kode   | Nama            | Jenis Kelamin | Usia |");
        System.out.println("---------------------------------------------------");
        
        for (int i = 0; i < idx; i++) {
            if (dataDosen[i].nama.equalsIgnoreCase(cari)) {
                dataDosen[i].tampil();
                ditemukan = true;
                jmlHasil++;
            }
        }
        System.out.println("---------------------------------------------------");
        
        if (!ditemukan) {
            System.out.println("Dosen dengan nama '" + cari + "' tidak ditemukan.");
        } else if (jmlHasil > 1) {
            System.out.println("Peringatan: Terdapat lebih dari satu dosen dengan nama '" + cari + "'.");
        }
    }
    
    // method untuk mencari data dosen berdasarkan usia menggunakan binary search
    int PencarianDataBinary14(int cari, int left, int right){
        //mengurutkan data
        bubbleSortASC();
        
        int jumlahHasil = 0;
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (dataDosen[mid] != null) {
                if (dataDosen[mid].usia == cari) {
                    // Jika ditemukan, cari semua data yang memiliki usia yang sama
                    int i = mid, j = mid;
                    
                    // cari duplikasi di bagian kiri
                    while (i >= left && dataDosen[i].usia == cari) {
                        i--;
                    }
                    
                    // cari duplikasi di bagian kanan
                    while (j <= right && dataDosen[j].usia == cari) {
                        j++;
                    }
                    
                    // Tampilkan semua hasil pencarian
                    System.out.println("Dosen dengan usia " + cari + " ditemukan:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("| Kode   | Nama            | Jenis Kelamin | Usia |");
                    System.out.println("---------------------------------------------------");
                    for (int k = i + 1; k < j; k++) {
                        dataDosen[k].tampil();
                    }
                    System.out.println("---------------------------------------------------");
    
                    // Jika ada lebih dari satu hasil, beri peringatan
                    if ((j - i - 1) > 1) {
                        System.out.println("Peringatan: Ada lebih dari satu hasil yang ditemukan.");
                    }
                    return mid;
                }else if(dataDosen[mid].usia > cari){
                    return PencarianDataBinary14(cari, left, mid-1);
                }else{
                    return PencarianDataBinary14(cari, mid+1, right);
                }
            }
        }
        System.out.println("Data dengan usia " + cari + " tidak ditemukan.");
        return -1;
    }
}