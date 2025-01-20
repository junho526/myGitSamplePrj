package w3_2_collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayMemorySample {
    public static void main(String[] args) {
        int arrInitSize = 1000000000;
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            List<String> list = new ArrayList<String>();
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println("Size " + arrInitSize + "ArrayList" + elapsedTime + "ms");

    }
}
