package DataStructures;

import AbstractDataTypes.*;
import java.util.ArrayList;

public class Heap<T extends Comparable> implements PriorityQueue<T> {

    private ArrayList<T> heap;
    private Integer size;

    public Heap() {
        this.heap = new ArrayList<>();
        this.size = 0;
    }

    @Override
    public void insert(T o) {
        this.size++;
        this.heap.add(o);
        int idx = size;
        while (idx > 0) {
            if (heap.get(idx).compareTo(heap.get(idx / 2)) > 0) {
                swap(idx, idx / 2);
            } else {
                break;
            }
            idx = idx / 2;
        }
    }

    public void swap(int idx1, int idx2) {
        T tmp = heap.remove(idx2);
        heap.set(idx2, heap.remove(idx1));
        heap.set(idx1, tmp);
    }

    @Override
    public T remove() {
        return heap.remove(0);
    }

    @Override
    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }
        return false;
    }

    @Override
    public T peek() {
        return heap.get(0);
    }

}
