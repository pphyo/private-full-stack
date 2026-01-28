package tech.codoverse.test;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class IteratingAndRemovingTest {

    @Test
    void test_for_itr_remove() {

        var list = new ArrayList<>(Arrays.asList("David", "Bryan", "Black", "Daniel", "Samantha", "Katherine"));

        IO.println(list);

        // var itr = list.iterator();
        // while (itr.hasNext()) {
        // var ele = itr.next();
        // if (ele.startsWith("D"))
        // itr.remove();
        // }
        list.removeIf(ele -> ele.startsWith("D"));
        IO.println(list);
    }

}
