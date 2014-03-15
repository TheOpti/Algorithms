package Algorithms.sorts;

/**
 *
 * @author opti
 */
public class Sorts {

    /**
     * Bubble sort
     */
    public <T extends Comparable> void bubbleSort(T[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int x = 1; x < length - i; x++) {
                if (array[x - 1].compareTo(array[x]) > 1) {
                    T tmp = array[x - 1];
                    array[x - 1] = array[x];
                    array[x] = tmp;
                }
            }
        }
    }

    /**
     * Insertion sort
     */
    public <T extends Comparable> void insort(T[] array) {
        int length = array.length;
        int i, j;

        T tmp;

        for (i = 1; i < length; i++) {
            tmp = array[i];
            for (j = i - 1; j >= 0 && array[j].compareTo(tmp) > 0; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = tmp;
        }
    }

    /**
     *  Choose sort
     */
    public <T extends Comparable> void chooseSort(T[] array) {
        int length = array.length;
        int i, j, min;

        for (i = 0; i < length - 1; i++) {

            min = i;

            for (j = i + 1; j < length; j++) {
                if (array[j].compareTo(array[min]) < 0) {
                    T tmp = array[j];
                    array[j] = array[min];
                    array[min] = tmp;
                }
            }
        }
    }

    /**
     * Heap Sort
     */
    public <T extends Comparable> void heapSort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            makeHeap(array, i);
        }

        for (int j = array.length - 1; j > 0; j--) {
            swap(array, 0, j);
            heapDown(array, j);
        }

    }

    public <T extends Comparable> void makeHeap(T[] array, int i) {
        int n = i;
        int p = (n - 1) / 2;
        while (n > 0) {
            if (array[n].compareTo(array[p]) > 0) {
                swap(array, i, p);
            } else {
                return;
            }
            i = p;
            p = (i - 1 / 2);
        }
    }

    public <T extends Comparable> void heapDown(T[] array, int n) {
        int i = 0;
        int c = 2*i+1;
        while (c < n) {
            if (c+1 < n && array[c+1].compareTo(array[c]) > 0)
                c++;
            if (array[i].compareTo(array[c]) > 0) {
                swap(array, i, c);
            } else {
                return;
            }
            i = c;
            c = 2*i + 1;
        }
    }

    /**
     * Quick Sort
     */
    public <T extends Comparable> void qsort(T[] array, int start, int end) {
        if (end - start > 0) {
            T pivot = array[end];
            Integer partition = partitionArray(array, start, end, pivot);
            qsort(array, start, partition - 1);
            qsort(array, partition + 1, end);
        }
    }

    public <T extends Comparable> Integer partitionArray(T[] array, Integer left, Integer right, T pivot) {
        Integer leftPtr = left - 1;
        Integer rightPtr = right;
        while (true) {
            while (array[++leftPtr].compareTo(pivot) < 0);
            while (rightPtr > 0 && array[--rightPtr].compareTo(pivot) > 0);
            if (leftPtr >= rightPtr) {
                break;
            } else {
                T tmp = array[leftPtr];
                array[leftPtr] = array[rightPtr];
                array[rightPtr] = tmp;
            }
        }
        T tmp = array[leftPtr];
        array[leftPtr] = array[right];
        array[right] = tmp;
        return leftPtr;
    }
    
    /**
     * Counting sort
    */
    public <T extends Comparable> void countingSort(T[] array, Integer k) {
        
    }

    // swap elements in given array
    public <T extends Comparable> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

}
