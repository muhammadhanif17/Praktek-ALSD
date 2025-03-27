public class MahasiswaBerprestasi14 {
    Mahasiswa14[] listMhs;
    int idx;

    public MahasiswaBerprestasi14(int jml){
        listMhs = new Mahasiswa14[jml];
        idx = 0;
    }

    void tambah(Mahasiswa14 m){
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (Mahasiswa14 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("-----------------------------");
            }
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                    Mahasiswa14 tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
                }
            }
        }
    }
    
    void selectionSort(){
        for (int i = 0; i < listMhs.length-1; i++) {
            int idxmin = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa14 tmp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }
    
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa14 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
    void insertionSortDESC(){
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa14 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j-1].ipk < temp.ipk) {
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }

    int sequentialSearching(double cari){
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].ipk == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int binarySearch(double cari, int left, int right){
        int mid;
        if (right >= left) {
            mid = (left + right)/2;
            if (cari == listMhs[mid].ipk) {
                return mid;
            }else if(listMhs[mid].ipk > cari){
                return binarySearch(cari, left, mid-1);
            }else{
                return binarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos){
        if (pos != -1) {
            System.out.println("Data mahasiswa dengan IPK " + x + "ditemukan pada index " + pos);
        }else{
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }

    void tampilDataSearch(double x, int pos){
        if (pos != -1) {
            System.out.println("NIM\t : " + listMhs[pos].nim);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Kelas\t : " + listMhs[pos].kelas);
            System.out.println("IPK\t : " + x);
        }else{
            System.out.println("Data mahasiswa dengan IPK " + x + " tidak ditemukan");
        }
    }
}