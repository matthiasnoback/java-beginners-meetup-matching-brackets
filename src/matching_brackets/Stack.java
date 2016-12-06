package matching_brackets;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stack<E> {
    private final ArrayList<E> elements;

    public Stack() {
        elements = new ArrayList<E>();
    }

    public void push(E element) {
        elements.add(element);
    }

    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("The stack is empty");
        }

        return elements.remove(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.size() == 0;
    }
}
