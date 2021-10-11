package RANgen;

import java.util.*;//Random

public class seeder {

    static int rangeArray[]
        = { 1,      10,      100,      1000,     10000,
            100000, 1000000, 10000000, 100000000, 1000000000 };

    public static int seedgen()
    {
        int numberOfDigits = 8;
        int start = rangeArray[numberOfDigits - 1],
            end = rangeArray[numberOfDigits];
        Random rand = new Random();
        int nextNumber = rand.nextInt(end - start) + start;
        return nextNumber;
    }
}
