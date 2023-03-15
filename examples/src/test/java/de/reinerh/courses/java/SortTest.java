package de.reinerh.courses.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SortTest {
    /**
     * Test für InsertionSort.
     */
    @Test
    public void testInsertionSort()
    {
        // Gegeben: Eine Liste von int und eine sortierte Form davon.
        List<Integer> l1 = Arrays.asList(1,5,6,10,3,25,8,42,25,103);
        List<Integer> l1sorted = l1.stream().sorted().toList();
        
        // Wenn wir die Liste sortieren ...
        Sort.insertion(l1);

        // ... soll sie anschließend eine sortierte Form ihrer selbst sein.
        assertEquals(l1sorted,l1);

        // Anmerkung: 
        // Wir prüfen hier, ob unsere Sortierfunktion die gleiche Wirkung hat,
        // wie eine Sortierung mittels Streams aus der Standardbibliothek.
        // 
        // Dieses Beispiel zeigt, wie man in der Praxis mittels der Standardbibliothek
        // eine sortierte Kopie einer Liste erzeugt.
        // Wenn man keine Kopie braucht, bietet die Standardbibliothek mit List.sort()
        // und Collections.sort() noch weitere Möglichkeiten an.
    }
}