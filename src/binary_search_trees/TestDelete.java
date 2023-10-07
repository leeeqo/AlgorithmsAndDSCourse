package binary_search_trees;

public class TestDelete {
    public static void main(String[] args) {
        BST<Character, Object> bst = new BST<>();
        bst.put('S', new Object());
        bst.put('E', new Object());
        bst.put('X', new Object());
        bst.put('A', new Object());
        bst.put('R', new Object());
        bst.put('C', new Object());
        bst.put('H', new Object());
        bst.put('M', new Object());

        bst.inOrder();
        bst.delete('E');
        System.out.println();
        bst.inOrder();
    }
}
