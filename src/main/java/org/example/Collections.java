package org.example;

import java.util.Comparator;
import java.util.List;

public class Collections {

    // binarySearch для List с Comparable
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // Элемент найден
        }
        return -(low + 1); // Элемент не найден
    }

    // binarySearch для List с Comparator
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0)
                low = mid + 1;
            else if (cmp > 0)
                high = mid - 1;
            else
                return mid; // Элемент найден
        }
        return -(low + 1); // Элемент не найден
    }
}
