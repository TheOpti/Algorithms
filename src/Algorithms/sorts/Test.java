package Algorithms.sorts;

import java.util.Random;

/**
 *
 * @author opti
 */
public class Test {

    public static void main(String[] args) throws Exception {
        Integer[] tmp = new Integer[1000];
        Random randomGenerator = new Random();
        for (int i = 0; i < 1000; i++) {
            tmp[i] = randomGenerator.nextInt(100);
        }

        Integer[] b = tmp.clone();
        Integer[] c = tmp.clone();
        Integer[] d = tmp.clone();
        Integer[] e = tmp.clone();
        Integer[] f = tmp.clone();
        double seconds;

        Sorts sorter = new Sorts();
        long start, end;

        start = System.nanoTime();
        sorter.bubbleSort(tmp);
        end = System.nanoTime();
        sorter.testArray(tmp);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Bubble sort: " + seconds);

        start = System.nanoTime();
        sorter.insort(b);
        end = System.nanoTime();
        sorter.testArray(b);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Insertion sort: " + seconds);

        start = System.nanoTime();
        sorter.qsort(c, 0, c.length - 1);
        end = System.nanoTime();
        sorter.testArray(c);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Quick sort: " + seconds);
        
        start = System.nanoTime();
        sorter.heapSort(d);
        end = System.nanoTime();
        sorter.testArray(d);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Heap sort: " + seconds);
        
        start = System.nanoTime();
        sorter.chooseSort(e);
        end = System.nanoTime();
        sorter.testArray(e);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Choose sort: " + seconds);
        
        start = System.nanoTime();
        sorter.mergeSort(f, 0, f.length - 1);
        end = System.nanoTime();
        sorter.testArray(f);
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Merge sort: " + seconds);
        

    }

}
