import java.util.Formatter;
import java.util.Random;

class LinearSorting {
    String[] sorted, notsorted;
    int size;

    public LinearSorting(int size) {
        this.size = size;
        if (size <= 0) size = 12;
        sorted = new String[size];
        notsorted = new String[size];
        createarray(size);
        sort();
    }

    void createarray(int size) {
        String abc = "qwertyuioplkjhgfdsazxcvbnmMNBVCXZASDFGHJKLLPOIUYTREWQ";
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            String result = "";
            int length=rnd.nextInt(7)+1;
            for (int j = 0; j < length; j++) {
                result += abc.charAt(rnd.nextInt(abc.length()));
            }
            sorted[i] = result;
            notsorted[i] = result;

        }

    }

    void sort() {
        for (int i = 0; i < size; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++)
                if (less(sorted[j], sorted[min])) min = j;
            exchange(sorted, i, min);
        }
        show();
    }

    boolean less(String v, String w) {
        return v.compareTo(w) < 0;
    }

    void exchange (String[] sorted, int i, int j) {
        String strtmp = sorted[i];
       sorted[i] = sorted[j];
        sorted[j] = strtmp;
    }

    void show() {
        System.out.println("Before   and   After sorting");

        for (int i = 0; i < size; i++) {
            Formatter fmt=new Formatter();
            fmt.format("%12s %12s",notsorted[i],sorted[i]);
            System.out.println(fmt);
            fmt.close();
        }

    }
}
