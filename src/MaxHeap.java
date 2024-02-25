class MaxHeap {
    public static void maxHeapify(int[] A, int i, int heapSize) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest;

        if (left <= heapSize && A[left] > A[i]) {
            largest = left;
        } else {
            largest = i;
        }

        if (right <= heapSize && A[right] > A[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(A, i, largest);
            maxHeapify(A, largest, heapSize);
        }
    }

    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 3, 5, 1};
        int heapSize = arr.length - 1;
        int index = 0;

        maxHeapify(arr, index, heapSize);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
