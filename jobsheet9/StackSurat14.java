public class StackSurat14 {
    Surat14[] stack;
    int top;
    int size;

    public StackSurat14(int size){
        this.size = size;
        stack = new Surat14[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(Surat14 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menerima surat baru.");
        }
    }

    public Surat14 pop() {
        if (!isEmpty()) {
            Surat14 srt = stack[top];
            top--;
            return srt;
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public void print(){
        for (int i = 0; i <= top; i++) {
            System.out.println(stack[i].idSurat + "\t\t" + stack[i].namaMhs + "\t" + stack[i].kelas 
            + "\t" + stack[i].jenisIzin + "\t\t" + stack[i].durasi);
        }
        System.out.println("");
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMhs.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
