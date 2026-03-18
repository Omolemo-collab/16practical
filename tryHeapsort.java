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
    // build a heap from top down using insert(node n) 

    public sta
}