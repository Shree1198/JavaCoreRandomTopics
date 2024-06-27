/**
 * This program demonstrates merging two ArrayLists of randomly generated integers
 * into a single ArrayList, ensuring the second list contains unique integers
 * not present in the first list. It utilizes HashSet to track unique numbers
 * and ensures the merged list does not contain duplicates. Random numbers are
 * generated within specified ranges using Java's Random class, providing a practical
 * example of list manipulation and unique element handling in Java.
 */


package miscellaneousconcepts;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class MergeArrayList {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        Random random = new Random();
        int minRange = 1000;
        int maxRange = 10000;
        int count = 10;

        // Generate list1 with random numbers
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            list1.add(randomNumber);
        }

        System.out.println("First list of Integers: " + list1);

        List<Integer> list2 = new ArrayList<>();
        Set<Integer> set = new HashSet<>(list1); // Use a set to track unique numbers

        while (list2.size() < count) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            if (!set.contains(randomNumber)) {
                list2.add(randomNumber);
                set.add(randomNumber); // Add to set to ensure uniqueness
            }
        }

        System.out.println("Second list of unique Integers: " + list2);

        // Merge list1 and list2
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);

        System.out.println("Merged list: " + mergedList);
    }
}
