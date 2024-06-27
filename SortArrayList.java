/**
 * This program demonstrates the bubble sort algorithm for sorting a list of
 * randomly generated integers. Bubble sort works by repeatedly stepping
 * through the list, comparing adjacent elements, and swapping them if they
 * are in the wrong order. After each pass through the list, the largest
 * unsorted element moves to its correct position. This process is repeated
 * until the list is sorted. This implementation uses nested loops to perform
 * multiple passes, comparing and potentially swapping elements in each pass
 * until the list is fully sorted. While simple to understand, bubble sort
 * has a time complexity of O(n^2), making it less efficient for large lists
 * compared to more advanced sorting algorithms like quicksort or mergesort.
 */


package miscellaneousconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        Random random = new Random();
        int minRange = 10000;
        int maxRange = 100000;
        int count = 10;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            number.add(randomNumber);
        }

        System.out.println("Random numbers added to list: " + number);
//        System.out.println("Random numbers added to list: " + number.size());

        boolean swappedSomething = true;

        while (swappedSomething) {
            swappedSomething = false;

            for (int i = 0; i < number.size() - 1; i++) {
                if (number.get(i) > number.get(i + 1)) {
                    swappedSomething = true;
                    int temp = number.get(i);
                    number.set(i, number.get(i + 1));
                    number.set(i + 1, temp);
                }
            }
        }
        System.out.println("Numbers after sorting: " + number);

    }
}
