/**
 * This program demonstrates how to find duplicate elements in a list of integers.
 * It uses ArrayList and HashSet from Java's utility library. The list initially
 * contains multiple occurrences of some integers. The program iterates through
 * the list and uses a HashSet to track unique elements encountered so far. If an
 * element is already present in the HashSet (indicating it's a duplicate), it
 * adds it to another HashSet called duplicates. Finally, it prints out the
 * duplicate elements found in the original list. This approach efficiently
 * identifies duplicates using HashSet's O(1) average time complexity for add
 * and contains operations, making it suitable for handling larger datasets.
 */


package miscellaneousconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(34);
        numbers.add(34);
        numbers.add(12);
        numbers.add(23);
        numbers.add(12);
        numbers.add(12);
        numbers.add(24);
        numbers.add(23);

        // Set to store duplicate elements
        Set<Integer> duplicates = new HashSet<>();
        // Set to store unique elements
        Set<Integer> uniqueElements = new HashSet<>();

        // Iterate through the list
        for (Integer number : numbers) {
            // If the element is already in uniqueElements, it's a duplicate
            if (!uniqueElements.add(number)) {
                duplicates.add(number);
            }
        }

        // Print duplicates
        System.out.println("Duplicate elements in the list: " + duplicates);
    }
}
