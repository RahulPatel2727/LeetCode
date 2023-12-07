class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return bs(piles, h);
    }
    static int bs(int []arr, int hrs){
        int l = 1, h = max(arr);
        while(l<=h){
            int mid = l + (h-l)/2;
            if(possible(mid, arr, hrs)){
                h = mid - 1;
            }else{
                l = mid + 1;
            }
        }
        return l;
    }
    static boolean possible(int mid, int []arr, int hrs){
        int curHrs = 0;
        for(int it : arr){
            curHrs += Math.ceil(it/(mid*1.0));
            if(curHrs>hrs) return false;
        }
        return curHrs<=hrs;
    }
    static int max(int []arr){
        int max = -1;
        for(int it : arr){
            max = max < it ? it : max;
        }
        return max;
    }
}