public class DataDosen14 {
    Dosen14[] dataDosen = new Dosen14[10];
    int idx = 0;

    //1. Method untuk menambahkan data dosen
    void tambah(Dosen14 dsn){
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    //2. Method untuk menampilkan data dosen
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

    //3. method sorting ASC menggunakan bubblesort
    void bubbleSortASC(){
        for (int i = 0; i < dataDosen.length-1; i++) {
            for (int j = 1; j < dataDosen.length-i; j++) {
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

    //4. metod sorting DSC menggunakan selectionsort dan insertionsort
    void selectionSortDSC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j] != null) {
                    if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                        idxMax = j;
                    }
                }
            }
            Dosen14 temp = dataDosen[idxMax];
            dataDosen[idxMax] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    void insertionSortDSC(){
        for (int i = 1; i < dataDosen.length; i++) {
            Dosen14 temp = dataDosen[i];
            int j = i;
            if (dataDosen[j] != null) {
                while (j > 0 && dataDosen[j - 1].usia < temp.usia) {
                    dataDosen[j] = dataDosen[j - 1];
                    j--;
                }
            }
            dataDosen[j] = temp;
        }
    }
}
