package tech.codoverse.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class MapInterfaceTest {

    static Map<String, String> map = new LinkedHashMap<>();

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        map.put("Myanmar", "Yangon");
        map.put("Thai", "Bangkok");
        map.put("Korea", "Souel");
        map.put("Singapore", "Singapore");
    }

    @Test
    void test_for_hashMap() {
        Map<String, String> hm = new LinkedHashMap<>(map);

        assertTrue(hm.containsKey("Korea"));
        assertTrue(hm.containsValue("Singapore"));
        assertFalse(hm.containsKey("Malaysia"));
        assertFalse(hm.containsValue("Beijing"));

        assertEquals("Bangkok", hm.get("Thai"));
        assertNull(hm.get("Vietnam"));

        var expectedKyes = new LinkedHashSet<String>();
        Collections.addAll(
                expectedKyes, "Myanmar", "Thai", "Korea",
                "Singapore");

        var expectedValues = new ArrayList<String>();
        Collections.addAll(expectedValues, "Yangon", "Bangkok", "Souel", "Singapore");

        assertIterableEquals(expectedKyes, hm.keySet());
        assertIterableEquals(expectedValues, hm.values());

        Set<Entry<String, String>> entries = hm.entrySet();
        for (Entry<String, String> entry : entries) {
            IO.println("%s : %s".formatted(entry.getKey(), entry.getValue()));
        }

        assertEquals("Yangon", hm.getOrDefault("Myanmar", "City"));
        assertEquals("City", hm.getOrDefault("Malaysia", "City"));

        assertEquals("Yangon", hm.replace("Myanmar", "Naypyidaw"));
        assertEquals("Naypyidaw", hm.get("Myanmar"));

        IO.println(hm);
    }

}
