package stacks_and_queries;

import java.util.Iterator;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);

        Iterator<Integer> it = st.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
