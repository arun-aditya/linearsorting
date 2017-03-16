import java.util.Random;

class LinearSorting {
    String[] a, c;
    int size, length;

    public LinearSorting(int size, int length) {
        this.size = size;
        this.length = length;
        if (size <= 0) size = 12;
        a = new String[size];
        c = new String[size];
        createarray(size, length);
    }

    void createarray(int size, int length) {
        String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            String result = "";
            for (int j = 0; j < length; j++) {
                result += abc.charAt(rnd.nextInt(abc.length()));
            }
            a[i] = result;
            c[i] = result;
        }

    }

    void sort() {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++)
                if (less(a[j], a[min])) min = j;
            exchange(a, i, min);
        }
        show();
    }

    boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    void exchange (String[] a, int i, int j) {
        String strtmp = a[i];
        a[i] = a[j];
        a[j] = strtmp;
    }

    void show() {
        System.out.println("Before and After sorting");
        for (int i = 0; i < size; i++) {
            System.out.println(c[i] + "   " + a[i]);
        }
    }
}
