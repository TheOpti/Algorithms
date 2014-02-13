package AbstractDataTypes;

/**
 *
 * @author opti
 */
public interface IStack<T> {
    /*
     Stack - abstract data type representing LIFO (Last In First Out) queue. 
     A lot of everyday situations follow LIFO logic: books in a library, Hanoi Towers; many
     recursive methods use stack, for example quicksort
     */

    // put an element on the top of stack
    public void push(T o);

    // remove an item from the very top of our stack
    public T pop();

    // check what's on the top; do not remove it
    public T peek();
}
