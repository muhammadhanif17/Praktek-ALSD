import java.util.Random;

class PetsBark{
    private int Size;
    
    //Method untuk setting ukuran anjing
    public int setSize(int Size){
        return this.Size = Size;
    }

    //Method untuk mengambil ukuran anjing
    public int getSize(){
        return this.Size;
    }

    //Method untuk menampilkan suara anjing
    public void bark(){
        System.out.println("Guk guk!");
    }

    public static void main(String[] args) {
        Random rand = new Random();
        PetsBark[] pets = new PetsBark[10];

        //Inisialisasi anjing dan ukuran random pada masing-masing anjing
        for(int i = 0; i < pets.length; i++){
            pets[i] = new PetsBark();
            int randomSize = rand.nextInt(100) + 1;
            pets[i].setSize(randomSize);
            System.out.println("Pets " + (i+1) + "\t" + "Size: " + pets[i].getSize());
        }

        //Menyuarakan semua anjing
        for(int i = 0; i < pets.length; i++){
            System.out.print("Pets " + (i + 1) + " Sound: ");
            pets[i].bark();
        }
        
    }
}