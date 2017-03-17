class LinearSorting {

    static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++)
                if (less(array[j], array[min])) min = j;
            exchange(array, i, min);
        }
    }

    static boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    static void exchange(String[] array, int i, int j) {
        String strtmp = array[i];
        array[i] = array[j];
        array[j] = strtmp;
    }

    static String[] getSortedArray(String[] array) {
        sort(array);
        return array;
    }
}

