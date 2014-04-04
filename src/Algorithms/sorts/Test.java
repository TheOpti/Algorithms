package Algorithms.sorts;

import java.util.Random;

/**
 *
 * @author opti
 */
public class Test {

    public static void main(String[] args) {
        Integer[] tmp = new Integer[100000];
        Random randomGenerator = new Random();
        for (int i = 0; i < 100000; i++) {
            tmp[i] = randomGenerator.nextInt(1000000);
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
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Bubble sort: " + seconds);

        start = System.nanoTime();
        sorter.insort(b);
        end = System.nanoTime();
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Insertion sort: " + seconds);

        start = System.nanoTime();
        sorter.qsort(c, 0, c.length - 1);
        end = System.nanoTime();
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Quick sort: " + seconds);
        
        start = System.nanoTime();
        sorter.heapSort(d);
        end = System.nanoTime();
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Heap sort: " + seconds);
        
        start = System.nanoTime();
        sorter.chooseSort(e);
        end = System.nanoTime();
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Choose sort: " + seconds);
        
        start = System.nanoTime();
        sorter.mergeSort(f, 0, f.length - 1);
        end = System.nanoTime();
        seconds = (double) (end - start) / 1000000000.0;
        System.out.println("Merge sort: " + seconds);
        

    }

}
