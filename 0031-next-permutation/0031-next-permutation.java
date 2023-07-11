class Solution {
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int point1 = -1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                point1 = i;
                break;
            }
        }
        if(point1 == -1){
            reverse(arr, 0, n-1);
            return;
        }
        int point2 = findLessToPoint(arr, point1);
        swap(arr, point1, point2);
        reverse(arr,point1 + 1, n-1);
    }
    public static int findLessToPoint(int [] arr, int point){
        for(int i=arr.length - 1; i>=point;i--){
            if(arr[i] > arr[point]){
                return i;
            }
        }
        return point;
    }
    public static void reverse(int [] arr, int si, int ei){
        while(si<ei){
            arr[si] = arr[si] + arr[ei];
            arr[ei] = arr[si] - arr[ei];
            arr[si] = arr[si] - arr[ei];
            si++;
            ei--;
        }
    }
    public static void swap(int [] arr, int p1, int p2){
        arr[p1] = arr[p1] + arr[p2];
        arr[p2] = arr[p1] - arr[p2];
        arr[p1] = arr[p1] - arr[p2];
    }
}