package data_structures;

import abstract_data_types.IPriorityQueue;

/**
 *
 * @author opti
 */
public class Heap<T extends Comparable> implements IPriorityQueue<T> {
    /*
     My own class representing a heap - one of the best implementations of priority queue
     Heaps may be used in graph algoriths such as Dijkstra, Kruskal, Prim algorithms
     */

    private Integer size;
    private Object[] heap;

    public Heap(int s) {
        this.size = 0;
        this.heap = new Object[s];
    }

    public Heap() {
        this.size = 0;
        this.heap = new Object[256];
    }

    // insert an element - O(n)
    @Override
    public void insert(T o) {
        this.heap[size] = (T) o;
        int idx = this.size;
        this.size++;
        while (idx > 0) {
            if (((T) heap[idx]).compareTo((T) heap[(idx - 1) / 2]) > 0) {
                swap(idx, (idx - 1) / 2);
            } else {
                break;
            }
            idx = idx / 2;
        }
    }

    // this small function tests heap - then the heap property is unsettled
    public void testHeap() {
        for (int i = 0; i < (this.size - 1) / 2; i++) {
            if (((T) heap[i]).compareTo((T) heap[(2 * i + 1)]) < 0 || ((T) heap[i]).compareTo((T) heap[(2 * i + 2)]) < 0) {
                throw new Error("This is not a heap!");
            }

        }
    }

    public void swap(int idx1, int idx2) {
        T tmp = (T) this.heap[idx1];
        this.heap[idx1] = this.heap[idx2];
        this.heap[idx2] = tmp;
    }

    // delete O(1)
    @Override
    public T remove() {
        // find max element & extract max - O(1)
        T maxElement = (T) this.heap[0];
        heapDown(0);
        return maxElement;
    }

    // heapify - O(n)
    public void heapDown(int index) {
        this.heap[0] = this.heap[size];
        this.heap[size] = null;
        this.size--;
        int i = index;
        int child = 2 * i + 1;
        while (child < this.size) {
            /* choose greater of children */
            if (child < size && (((T) heap[child + 1]).compareTo((T) heap[child]) > 0)) {
                child++;
            }
            if (((T) heap[child]).compareTo((T) heap[i]) > 0) {
                swap(child, i);
            } else {
                break;
            }
            i = child;
            child = 2 * i + 1;
        }
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
        return (T) heap[0];
    }

    @Override
    public String toString() {
        String str = "";
        for (int i = 0; i < size; i++) {
            str += heap[i] + " ";
        }
        return str;
    }

}
