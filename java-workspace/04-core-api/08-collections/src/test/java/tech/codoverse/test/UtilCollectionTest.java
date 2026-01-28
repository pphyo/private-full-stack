package tech.codoverse.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

public class UtilCollectionTest {

    @Test
    void test() {
        var list = new ArrayList<>();
        Collections.addAll(list, 5, 6, 2, 3, 7, 4, 1);
        Collections.rotate(list, 4);
        IO.println(list);
    }

    @Test
    void test_for_key_differences_of_creating_list() {
        var list = new ArrayList<Integer>();
        Collections.addAll(list, 2, 3, 4, 5, 6);

        var asList = Arrays.asList(2, 3, 4, 5, 6);
        asList.set(0, 10);
        IO.println(asList);

        List<Integer> unmodifiable = Collections.unmodifiableList(list);
        unmodifiable.add(0, 20);

    }

}
