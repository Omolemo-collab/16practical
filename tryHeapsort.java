//build heap from bottom up
public static void buildHeap(String[] a, int n, int i) {
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
        if(right )
    
    }
}