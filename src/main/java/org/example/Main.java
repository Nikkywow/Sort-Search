package org.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования для Arrays
        int[] arr = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println("Index of 5: " + index);

        // Пример использования для Collections
        List<Integer> list = java.util.Arrays.asList(1, 3, 5, 7, 9);
        int listIndex = Collections.binarySearch(list, 5);
        System.out.println("Index of 5 in list: " + listIndex);

        // Пример с Comparator
        List<String> names = java.util.Arrays.asList("Alice", "Bob", "Charlie");
        int nameIndex = Collections.binarySearch(names, "Charlie", Comparator.naturalOrder());
        System.out.println("Index of 'Charlie': " + nameIndex);
    }
}
