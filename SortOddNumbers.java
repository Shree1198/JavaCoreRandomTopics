/**
 * This program generates a list of 100 random integers within the range of 10,000 to 100,000.
 * It then filters out all even numbers from the list, leaving only the odd numbers. The program
 * uses ArrayLists and the Random class from Java's utility library. After generating the random
 * numbers, it iterates through the list to identify even numbers and stores them in a separate
 * list called toRemove. Finally, it removes all elements in toRemove from the original list,
 * leaving only odd numbers, which are then printed to the console.
 */


package miscellaneousconcepts;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SortOddNumbers {

    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();

        Random random = new Random();
        int minRange = 10000;
        int maxRange = 100000;
        int count = 100;

        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            number.add(randomNumber);
        }

        List<Integer> toRemove = new ArrayList<>();
        for (Integer num : number) {
            if (num % 2 == 0) {
                toRemove.add(num);
            }
        }

        number.removeAll(toRemove);
        System.out.println(number);
    }
}

