class Solution {
    public int trap(int[] height) {
        return trapp(height);
    }
    public static int trapp(int [] arr){
		int []left=new int[arr.length];
		int []right= new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>left[i-1])
				left[i]=arr[i];
			else
				left[i]=left[i-1];
		}

		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--){
			if(arr[i]>right[i+1]){
				right[i]=arr[i];
			}
			else{
				right[i]=right[i+1];
			}
		}

		int res = 0;
		for(int i=0;i<arr.length;i++){
			res+=Math.min(left[i], right[i])-arr[i];
		}
        return res;
    }
}
    