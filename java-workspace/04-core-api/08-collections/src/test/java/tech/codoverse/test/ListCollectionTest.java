package tech.codoverse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ListCollectionTest {

    @Test
    void test_for_linkedlist() {
        var list = new LinkedList<Integer>();
        Collections.addAll(list, 5, 3, 1, 8);
        list.addFirst(6);

        assertEquals(5, list.size());

        assertEquals(6, list.poll());

        assertEquals(4, list.size());
    }

    @Test
    void test_for_arraylist() {
        List<Integer> list = new ArrayList<>();

        assertTrue(list.isEmpty());

        Collections.addAll(list, 3, 2, 6, 4, 8, 5);

        assertFalse(list.isEmpty());

        assertEquals(6, list.size());

        assertTrue(list.add(7));

        assertEquals(7, list.size());

        list.add(2, 2);

        assertEquals(8, list.size());

        assertTrue(list.addAll(List.of(10, 6, 17, 12)));

        assertEquals(12, list.size());

        assertEquals(1, list.indexOf(2));

        assertEquals(2, list.lastIndexOf(2));

        assertTrue(list.contains(6));

        assertFalse(list.contains(9));

        assertEquals(8, list.get(5));

        assertEquals(3, list.getFirst());

        assertEquals(12, list.getLast());

        assertEquals(6, list.remove(3));

        Executable removeIndexNoExist = new Executable() {
            @Override
            public void execute() throws Throwable {
                list.remove(100);
            }
        };

        assertThrows(IndexOutOfBoundsException.class, removeIndexNoExist);

        assertTrue(list.remove(Integer.valueOf(17)));

        assertTrue(list.retainAll(List.of(1, 2, 3, 4)));

        assertEquals(4, list.size());

        list.set(2, 1);

        assertEquals(1, list.get(2));

        IO.println(list);

        list.clear();

        assertTrue(list.isEmpty());
    }

}
