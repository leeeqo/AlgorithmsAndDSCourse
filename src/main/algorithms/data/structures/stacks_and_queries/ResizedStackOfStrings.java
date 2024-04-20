package algorithms.data.structures.stacks_and_queries;

public class ResizedStackOfStrings {
    private String[] array;
    private int N;

    public ResizedStackOfStrings() {
        array = new String[1];
    }

    private void resize(int capacity) {
        String[] newArray = new String[capacity];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }

        array = newArray;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public void push(String str) {
        if (N == array.length)
            resize(2 * array.length);

        array[N++] = str;
    }

    public String pop() {
        String last = array[N];
        array[N--] = null;

        if (N == array.length / 4)
            resize(array.length / 2);

        return last;
    }
}
