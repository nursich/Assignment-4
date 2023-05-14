import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable<MyTestingClass, String>();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            int val = rand.nextInt(0, 77777);
            hashTable.put(new MyTestingClass(val), "Doctor ID: " + val);
        }
    }
}

class MyTestingClass{
    private int val;
    public MyTestingClass(int v) {
        this.val = v;
    }
    @Override
    public int hashCode() {
        return val & 11;
    }
}