package tech.codoverse.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import org.junit.jupiter.api.Test;

import tech.codoverse.model.Country;

public class SortingCollectionTest {

    @Test
    void test_for_country_sort() {
        var myanmar = new Country(210, "Myanmar", 600, 73.44);
        var usa = new Country(430, "USA", 738, 83.3);
        var malaysia = new Country(1110, "Malaysia", 429, 54.61);
        var thai = new Country(90, "Thai", 534, 64.32);
        var brunei = new Country(4, "Brunei", 341, 35.36);

        var list = new ArrayList<Country>();
        Collections.addAll(list, myanmar, usa, malaysia, thai, brunei);

        IO.println("Before sorting:\n%s\n".formatted(list));

        // Collections.sort(list);

        // IO.println("After sorting:\n%s\n".formatted(list));

        Comparator<Country> nameComp = new Comparator<Country>() {
            @Override
            public int compare(Country o1, Country o2) {
                return o1.name().compareTo(o2.name());
            }
        };

        Collections.sort(list, nameComp);

        IO.println("Custom sorting:\n%s\n".formatted(list));
    }

    @Test
    void test_for_integer_sort() {
        var list = new ArrayList<>(Arrays.asList(6, 3, 2, 7, 5, 1, 3, 4));

        IO.println("Before sort: " + list);

        Collections.sort(list);

        IO.println("After sort: " + list);

    }

}
