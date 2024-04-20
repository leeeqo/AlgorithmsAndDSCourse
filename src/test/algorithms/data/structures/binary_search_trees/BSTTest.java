package algorithms.data.structures.binary_search_trees;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BSTTest {
    BST<Character, Object> bst = new BST<>();

    @BeforeEach
    public void createBST() {
        bst.put('S', new Object());
        bst.put('E', new Object());
        bst.put('Z', new Object());
        bst.put('A', new Object());
        bst.put('R', new Object());
        bst.put('C', new Object());
        bst.put('H', new Object());
        bst.put('M', new Object());
    }

    @Test
    public void whenPutThenGetNotNull() {
        Object empty = new Object();
        bst.put('X', empty);

        Assertions.assertEquals(empty, bst.get('X'));
    }

    @Test
    public void whenDeleteThenGetIsNull() {
        bst.delete('S');

        Assertions.assertNull(bst.get('S'));
    }

    @Test
    public void whenElemInTreeThenFloorIsThisElem() {
        Assertions.assertEquals('C', bst.floor('D'));
    }

    @Test
    public void whenElemNotInTreeThenFloorIsNearestMinElem() {
        Assertions.assertEquals('C', bst.floor('D'));
    }

    @Test
    public void whenElemInTreeThenCeilingIsThisElem() {
        bst.inOrder();
        Assertions.assertEquals('E', bst.ceiling('E'));
    }

    @Test
    public void whenElemNotInTreeThenCeilingIsNearestMaxElem() {
        Assertions.assertEquals('E', bst.ceiling('D'));
    }
}