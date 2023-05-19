class Solution {
    public int[] sortArray(int[] nums) {
        heapSort(nums);
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapify(array, i, 0);
        }
    }
    private static void heapify(int[] array, int heapSize, int rootIndex) {
        int largest = rootIndex; 
        while (true) {
            int leftChild = 2 * rootIndex + 1; 
            int rightChild = 2 * rootIndex + 2;
            if (leftChild < heapSize && array[leftChild] > array[largest]) {
                largest = leftChild;
            }
            if (rightChild < heapSize && array[rightChild] > array[largest]) {
                largest = rightChild;
            }
            if (largest != rootIndex) {
                int temp = array[rootIndex];
                array[rootIndex] = array[largest];
                array[largest] = temp;
                rootIndex = largest;
            } 
            else {
                break;
            }
        }
    }

}