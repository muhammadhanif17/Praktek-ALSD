public class AntrianKRS14 {
    Mahasiswa14[] data;
    int front;
    int rear;
    int size;
    int max;
    int jumlahDiproses;

    public AntrianKRS14(int max) {
        this.max = max;
        this.data = new Mahasiswa14[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDiproses = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian masih kosong");
        }
    }

    public void tambahAntrian(Mahasiswa14 mhs) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh! Tidak bisa menambah data.");
        } else {
            rear = (rear + 1) % max;
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " berhasil ditambahkan ke antrian.");
        }
    }

    public Mahasiswa14[] prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2, tidak bisa memproses KRS.");
            return null;
        }
        Mahasiswa14[] mhs = new Mahasiswa14[2];
        for (int i = 0; i < 2; i++) {
            mhs[i] = data[front];
            front = (front + 1) % max;
            size--;
            jumlahDiproses++;
        }
        return mhs;
    }

     
    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        System.out.println("--------------------------");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    
    public void tampilkanDuaTerdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong");
        } else if (size == 1) {
            System.out.println("Hanya ada 1 antrian terdepan:");
            data[front].tampilkanData();
        } else {
            System.out.println("2 Antrian terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            System.out.println("--------------------------");
            for (int i = 0; i < 2; i++) {
                int idx = (front + i) % max;
                data[idx].tampilkanData();
            }
        }
    }
    
    public void tampilAntrianAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.print("Mahasiswa terakhir dalam antrian: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah Mahasiswa dalam antrian: " + size);
    }

    public void cetakJumlahDiproses() {
        System.out.println("Jumlah Mahasiswa yang telah diproses: " + jumlahDiproses);
    }

    public void cetakJumlahBelumProses() {
        System.out.println("Jumlah Mahasiswa yang belum diproses: " + size);
    }
}
