package abstract_data_types;

/**
 *
 * @author opti
 */
public interface IPriorityQueue<T> {
    /*
     Priority queue - abstract data type with priority associated to every element held in a queue
     Implementation: by heap or by linked list
     */

    // insert object o of class T into priority queue with appropriate priority
    public void insert(T o);

    // remove an element with the highest priority
    public T remove();

    // check whether queue is empty or not
    public boolean isEmpty();

    // return an element with the highest priority, but do not modify the whole queue
    public T peek();

}
