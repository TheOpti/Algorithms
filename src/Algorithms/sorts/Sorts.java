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
                if (array[x - 1].compareTo(array[x]) > 0) {
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
     * Choose sort
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

    public <T extends Comparable<T>> void makeHeap(T[] array, int i) {
        int child = i;
        int parent = (child - 1) / 2;
        while (child >= 0) {
            if (array[child].compareTo(array[parent]) > 0 ) {
                swap(array, child, parent);
            } else {
                return;
            }
            child = parent;
            parent = (child - 1 ) / 2;
            
        }
    }

    public <T extends Comparable<T>> void heapDown(T[] array, int n) {
        int i = 0;
        int child = i*2 + 1;
        while (child < n) {
            if (child + 1 < n && array[child + 1].compareTo(array[child]) > 0) {
                child++;
            }
            if (array[child].compareTo(array[i]) > 0) {
                swap(array, i, child);
            } else {
                return;
            }
            i = child;
            child = 2*i + 1;
            
        }
    }
    
    
    /**
     * Quick Sort
     */
    public <T extends Comparable<T>> void qsort(T[] array, int start, int end) {
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
     * Merge sort
     */
    public <T extends Comparable> void mergeSort(T[] array, Integer left, Integer right) {
        if (right > left) {
            Integer middle = (right + left) / 2;
            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);
            merge(array, left, middle, right);
        }
    }

    public <T extends Comparable> void merge(T[] array, Integer left, Integer middle, Integer right) {
        T[] helper = array.clone();
        int i, j, k;
        i = k = left;
        j = middle + 1;

        while (i <= middle && j <= right) {
            if (helper[i].compareTo(helper[j]) < 0) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }

        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }

    }

    // swap elements in given array
    public <T extends Comparable> void swap(T[] array, int i, int j) {
        T tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public <T extends Comparable> void testArray(T[] array) throws Exception {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                throw new Exception("This array is not sorted!");
            }
        }
    }

}
