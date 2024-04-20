package algorithms.data.structures.red_black_tree;

import algorithms.data.structures.binary_search_trees.BST;

public class TestRB {
    public static void main(String[] args) {
        RedBlackBST<Character, Object> bst = new RedBlackBST<>();
        bst.put('R', new Object());
        bst.put('E', new Object());
        bst.put('D', new Object());
        bst.put('B', new Object());
        bst.put('L', new Object());
        bst.put('A', new Object());
        bst.put('C', new Object());
        bst.put('K', new Object());
        bst.put('T', new Object());
        bst.put('R', new Object());
        bst.put('E', new Object());
        bst.put('E', new Object());
        bst.put('T', new Object());
        bst.put('E', new Object());
        bst.put('S', new Object());
        bst.put('T', new Object());

        bst.inOrder();
    }
}
