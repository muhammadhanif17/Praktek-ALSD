public class Nilai14 {
    int[] nilaiUts;
    int[] nilaiUas;

    public Nilai14(int[] nilaiUts, int[] nilaiUas){
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }

    int cariMax(int[] arr,int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int lmax = cariMax(arr, l, mid);
        int rmax = cariMax(arr, mid + 1, r);

        if (lmax > rmax){
            return lmax;
        }else{
            return rmax;
        }
    }

    int cariMin(int[] arr,int l, int r){
        if (l == r) {
            return arr[l];
        }
        int mid = (l+r)/2;
        int lmin = cariMin(arr, l, mid);
        int rmin = cariMin(arr, mid + 1, r);

        if (lmin < rmin){
            return lmin;
        }else{
            return rmin;
        }
    }

    double hitungRata(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length ; i++) {
            total = total + arr[i];
        }
        double rataNilai = (double) total / arr.length;
        return rataNilai;
    }
}