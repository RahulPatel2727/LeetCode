class Solution {
    public int[] sortArray(int[] nums) {
        QS(nums, 0, nums.length - 1);
        return nums;
    }
    public static void QS(int [] arr, int s, int e){
        if(s < e){
            int pivotIndex = findPivot(arr, s, e);
            QS(arr, s, pivotIndex);
            QS(arr, pivotIndex + 1, e);
        }
    }
    public static int findPivot(int []arr, int s, int e){
        int pivot = arr[s];
        s = s-1;
        e = e+1;
        while(true){
            do{
                s++;
            }while(arr[s]<pivot);
            do{
                e--;
            }while(arr[e]>pivot);
            if(s < e){
                swap(arr,s,e);
            }
            else return e;
        }
    }
    public static void swap(int [] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}