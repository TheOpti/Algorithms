package data_structures;

/**
 *
 * @author opti
 */
public class TestHeap {

    public static void main(String[] args) {

        Heap myHeap = new Heap(10);
        myHeap.insert(1.54);
        myHeap.insert(7.099);
        myHeap.insert(12.8);
        myHeap.insert(18.432432);
        myHeap.insert(87.123);
        myHeap.insert(54.123);
        myHeap.insert(2.3);
        myHeap.insert(43.11);
        myHeap.insert(33.33);
        myHeap.insert(67.1);
        // myHeap.testHeap();

        System.out.println(myHeap);

    }
}
