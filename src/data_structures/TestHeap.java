package data_structures;

import java.util.Random;

/**
 *
 * @author opti
 */
public class TestHeap {

    public static void main(String[] args) {

        Heap myHeap = new Heap(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            myHeap.insert(rnd.nextInt(32));
        }
        // myHeap.testHeap();

        System.out.println(myHeap);

    }
}
