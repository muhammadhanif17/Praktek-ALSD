public class MataKuliah14 {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah14(String kodeMK, String namaMK, int sks){
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    void tampilMataKuliah(){
        System.out.printf("| %-10s | %-20s | %-8s |\n", kodeMK, namaMK, sks);
    }
}
