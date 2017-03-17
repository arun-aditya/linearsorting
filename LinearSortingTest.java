class LinearSortingTest {
    public static void main(String[] args) {
        String[] array = LinearSortingMain.generateArray();
        show(array, "Before sorting");
        String[] sortedArray = LinearSorting.getSortedArray(array);
        show(sortedArray, "After sorting");
    }

    static void show(String[] sortedArray, String str) {
        System.out.println(str);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
        System.out.println();
    }
}
