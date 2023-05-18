import Add.HashTable;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        HashTable<MytestingClass, Students> table = new HashTable<>();
        Random rand = new Random();

        for (int i = 0; i < 10000; i++) {
            MytestingClass key = new MytestingClass(rand.nextInt(1000), "name" + i);
            Students value = new Students("student" + i, rand.nextInt(20) + 18);
            table.put(key, value);
        }

        table.printBucketSizes();
    }
}