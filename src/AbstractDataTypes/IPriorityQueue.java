package AbstractDataTypes;

/**
 *
 * @author opti
 */
public interface IPriorityQueue<T> {
    /*
     Priority queue - abstract data type with priority associated with every element held in a queue and every
     Implementation: by heap or by linked list
     */

    // insert object o of class T into priority queue with appropriate element
    public void insert(T o);

    // remove an element with the highest priority
    public T remove();

    // check whether queue is empty or not
    public boolean isEmpty();

    // return an element with the highest priority, but do not modify the whole queue
    public T peek();

}
