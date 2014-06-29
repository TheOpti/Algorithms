package data_structures;

import abstract_data_types.IStack;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author opti
 */
public class Stack<T extends Comparable> implements IStack {

    private List<T> stack;
    private Integer size;

    public Stack() {
        this.size = 0;
        this.stack = new ArrayList<>();
    }

    @Override
    public void push(Object o) {
        this.size++;
        this.stack.add((T) o);
    }

    @Override
    public Object pop() {
        return this.stack.remove(size);
    }

    @Override
    public Object peek() {
        return this.stack.get(size);
    }

    public Integer getSize() {
        return this.size;
    }

}
