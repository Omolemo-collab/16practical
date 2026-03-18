

public class Main {

    // Bottom-up heap build
    public static void buildHeapBottomUp(String[] a, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
    }

    public static void heapify(String[] a, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && a[left].compareTo(a[largest]) > 0) {
            largest = left;
        }

        if (right < n && a[right].compareTo(a[largest]) > 0) {
            largest = right;
        }

        if (largest != i) {
            String temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;

            heapify(a, n, largest);
        }
    }

    // Top-down heap build
    public static void buildHeapTopDown(String[] a, int n) {
        for (int i = 1; i < n; i++) {
            insert(a, i);
        }
    }

    public static void insert(String[] a, int i) {
        if (i == 0) return;

        int parent = (i - 1) / 2;

        if (a[i].compareTo(a[parent]) > 0) {
            String temp = a[i];
            a[i] = a[parent];
            a[parent] = temp;

            insert(a, parent);
        }
    }

    public static void main(String[] args) {

        String[] words = {"apple", "brush", "cabbage", "pumpkin", "watermelon"};

        // Bottom-up timing
        long startTime = System.nanoTime();
        buildHeapBottomUp(words, words.length);
        long endTime = System.nanoTime();

        System.out.println("Bottom-up time: " + (endTime - startTime));

        startTime = System.nanoTime();
        buildHeapTopDown(words, words.length);
        endTime = System.nanoTime();

        System.out.println("Top-down time: " + (endTime - startTime));
    }
}
