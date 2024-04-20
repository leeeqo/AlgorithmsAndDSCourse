package algorithms.data.structures.stacks_and_queries;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item>{
    private Item[] array;
    private int N;

    private class ArrayIterator<Item> implements Iterator<Item> {
        private int i = 0;
        public boolean hasNext() { return i < N; }

        public Item next() { return (Item) array[i++]; }
    }

    public Stack() {
        array = (Item[]) new Object[1];
    }

    public Stack(int capacity) {
        array = (Item[]) new Object[capacity];
    }

    public Iterator<Item> iterator() {
        return new ArrayIterator<Item>();
    }

    private void resize(int capacity) {
        Item[] newArray = (Item[]) new Object[capacity];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(Item item) {
        if (N == array.length)
            resize(2 * array.length);

        array[N++] = item;
    }

    public Item pop() {
        Item last = array[N];
        array[N--] = null;

        if (N == array.length / 4)
            resize(array.length / 2);

        return last;
    }
}
