package tech.codoverse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetCollectionTest {

    LinkedHashSet<Integer> set = new LinkedHashSet<>();

    @BeforeEach
    void init() {
        Collections.addAll(set, 9, 10, 2, 1, 5, 8, 7, 3, 4, 6);
    }

    @Test
    void test_for_treeset() {
        var treeSet = new TreeSet<>(set);
        assertThrows(UnsupportedOperationException.class, () -> treeSet.addFirst(100));

        IO.println(treeSet.subSet(3, 9));
        IO.println(treeSet.headSet(5));
        IO.println(treeSet.tailSet(5));

        IO.println(treeSet.lower(15));
        IO.println(treeSet.higher(15));

        IO.println(treeSet.reversed());
        IO.println(treeSet);
    }

    @Test
    void test_for_linkedhashset() {

        set.addFirst(21);
        set.addLast(-2);

        assertEquals(21, set.getFirst());
        assertEquals(-2, set.getLast());

        assertEquals(21, set.removeFirst());
        assertEquals(11, set.size());

        assertEquals(-2, set.removeLast());
        assertEquals(10, set.size());

        IO.println(set);

    }

    @Test
    void test_for_hashset() {

        assertEquals(10, set.size());

        assertFalse(set.add(10));

        assertEquals(10, set.size());

        IO.println(set);
    }

}
