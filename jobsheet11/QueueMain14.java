import java.util.Scanner;

public class QueueMain14 {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. peek");
        System.out.println("5. clear");
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();

        Queue14 Q = new Queue14(n);
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.isFull()) {
                        System.out.println("Queue sudah penuh! Program dihentikan.");
                        pilih = 0; // hentikan program
                    } else {
                        System.out.print("Masukkan data baru: ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                    }
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar == -1) {
                        System.out.println("Queue masih kosong! Program dihentikan.");
                        pilih = 0; // hentikan program
                    } else {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);   
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        }while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

