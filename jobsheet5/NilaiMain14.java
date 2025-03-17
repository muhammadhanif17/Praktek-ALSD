public class NilaiMain14 {
    public static void main(String[] args) {
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 86, 84};

        Nilai14 nilai = new Nilai14(nilaiUTS, nilaiUAS);
        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + nilai.cariMax(nilaiUTS, 0, nilaiUTS.length -1));
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + nilai.cariMin(nilaiUTS, 0, nilaiUTS.length -1));
        System.out.println("Rata-rata nilai UAS (Brute Force): " + nilai.hitungRata(nilaiUAS));
    }
}