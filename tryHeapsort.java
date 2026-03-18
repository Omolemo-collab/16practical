//build heap from bottom up
public static void buildHeapbottomUp(String[] a, int n, int i) {
    for (int i = a.length / 2 -1; i >= 0; i--){
        heapify(a, n, i);
    }

    public static void heapify(String[] a, int n, int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i +2;

        if(left<n && a[left]>a[largest]){
            largest = left;
        }
        if(right<n && a[right]>a[largest]){
            largest = right;
        }
        if(largest != i){
            String temp = a[i];
            a[i] = a[largest];
            a[largest] = temp;
            heapify(a,n,largest);
        }
        // make a list of words sorted into alphabetical order
        public static void main(String[] args){
            String[] words = {"apple", "brush", "cabbage", "pumpkin", "watermelon",};
            buildHeap(words, words.length, 0);
        }
    }
    // build a heap from top down using insert 

    public static void buildHeaptopDown(String[]a, int n, int i){
        for (int i = 1; i < a.length; i++){
            insert(a,i);
        }

        public static void insert (String[] a, int i){
            int parent = (i-1)/2;
            if(a[i] > a[parent]){
                String temp = a[i];
                a[i] = a[parent];
                a[parent] = temp;
                insert(a, parent);
            }
            // use heap sort to sort the list of words into alphabetical order
            public static void main(String[] args){
                String[] words = {"apple", "brush", "cabbage", "pumpkin", "watermelon"};
                buildHeaptopDown(words, words.length, 0);

                // use timing to compare the two methods of building a heap
                long startTime = System.nanoTime();
                buildHeapbottomUp(words, words.length.0);
                long endTime = System.nanoTime();
                long duration = endTime - startTime;
                System.out.println("time taken to build heap from bottom up " + duration + "nanoseconds");
                startTime = System.nanoTime();
                buildHeaptopDown(words,words.length,0);
                endTime = System.nanoTime();
                duration = endTime - startTime;
                System.out.println()
        }



    }
}