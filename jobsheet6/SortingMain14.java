public class SortingMain14 {
    public static void main(String[] args) {

        //deklarasi variabel array
        int[] a = {20, 10, 2, 7, 12};
        int[] b = {30, 20, 2, 8, 14};
        int[] c = {40, 10, 4, 9, 3};

        //instansiasi objek
        Sorting14 dataurut1 = new Sorting14(a, a.length);
        Sorting14 dataurut2 = new Sorting14(b, b.length);
        Sorting14 dataurut3 = new Sorting14(c, c.length);

        //memanggil method
        System.out.println("Data awal 1"); //objek 1
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data yang sudah diurutkan dengan BUBBBLE SORT (ASC)");
        dataurut1.tampil();
        System.out.println("Data awal 2"); //objek 2
        dataurut2.tampil();
        dataurut2.selectionSort();
        System.out.println("Data yang sudah diurutkan dengan SELECTION SORT (ASC)");
        dataurut2.tampil();
        System.out.println("Data awal 3"); //objek 3
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data yang sudah diurutkan dengan INSERTION SORT (ASC)");
        dataurut3.tampil();
    }
}