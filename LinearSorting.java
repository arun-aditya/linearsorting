import java.util.Formatter;
import java.util.Random;

class LinearSorting {
    String[] array;

    public LinearSorting(String[] array) {
        this.array = array;
        sort();
    }

    void sort() {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (less(array[j], array[min])) min = j;
            exchange(array, i, min);
        }
    }

    boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    void exchange(String[] array, int i, int j) {
        String strtmp = array[i];
        array[i] = array[j];
        array[j] = strtmp;
    }

    String[] getSortedArray() {
        return array;
    }
}

